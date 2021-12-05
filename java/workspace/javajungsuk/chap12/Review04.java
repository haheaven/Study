package chap12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// 예제 12-2   (p.677)
class Fruit2 { 
	String name;
	int weight;
	int price;
	
	public Fruit2(String name, int weight, int price) {
		super();
		this.name = name;
		this.weight = weight;
	    this.price = price;
	}
	public String toString()  { return name+"("+weight+")"+": "+price; } 
}

class Apple2 extends Fruit2 { 
	Apple2(String name, int weight, int price){
		super(name, weight, price);
	}
}
	
class Grape2 extends Fruit2 { 
	Grape2(String name, int weight, int price){
		super(name, weight, price);
	}
}
  
class AppleComp implements Comparator<Apple2>{          // Comparator 정렬 
	public int compare(Apple2 t1, Apple2 t2) {
	System.out.println( t2.weight - t1.weight);	      //     t2-t1 >0  내림차순        // t1-t2 < 0 오름차순
	return t2.weight - t1.weight;                    
	}
}

class ApplePriceComp implements Comparator<Apple2>{     // Comparator 정렬 
	public int compare(Apple2 t1, Apple2 t2) {
		System.out.println("apple price");
	//	System.out.println("t2 : "+t2.toString());			
	 
		System.out.println(t1.price - t2.price);  
		return t1.price - t2.price;							 //     t2-t1 >0  내림차순        // t1-t2 < 0 오름차순
	}
}

class GrapeComp implements Comparator<Grape2>{
	public int compare(Grape2 t1, Grape2 t2) {
		return t2.weight - t1.weight;
	}
}
class FruitComp implements Comparator<Fruit2>{
	public int compare(Fruit2 t1, Fruit2 t2) {
		return t1.weight - t2.weight;
	}
}

public class Review04 {
	public static void main(String[] args) {
		
		FruitBox2<Apple2> applebox = new FruitBox2<Apple2>();    //  FruitBox의 제네릭으로 Fruit와 그의 자손 타입 가능 
		FruitBox2<Grape2> grapebox = new FruitBox2<Grape2>();    //  FruitBox의 제네릭으로 Fruit와 그의 자손 타입 가능 
		applebox.add(new Apple2("CreenApple", 200, 4500)); 
		applebox.add(new Apple2("AreenApple", 300, 2000));
		applebox.add(new Apple2("BreenApple", 100, 3000));
		
		System.out.println("list="+applebox.getList()); //  -------> list 넣은 순서대로 출력함 ---> GreenApple(300), AreenApple(100), CreenApple(200
		
		grapebox.add(new Grape2("GreenGrape", 600, 5000));
		grapebox.add(new Grape2("GreenGrape", 1000,200));
		grapebox.add(new Grape2("GreenGrape", 100, 10000));
		System.out.println("list="+grapebox.getList());  //  -------> list 넣은 순서대로 출력함 ---> [GreenGrape(600), GreenGrape(1000), GreenGrape(100)]
		System.out.println("-----------------------------------");
		
		
	//  무게별로 정렬 위해 appleComp() - 사용자 지정 Comparator 인터페이스 구현
		Collections.sort(applebox.getList(), new AppleComp());   
		Collections.sort(grapebox.getList(), new GrapeComp());
		System.out.println("---- 무게 정렬--------");
		System.out.println(applebox);							// 내림차순 
		System.out.println(grapebox); 							// 내림차순 
		System.out.println();
		
	//  가격별 정렬 위해 applePriceComp() - 사용자 지정 Comparator 인터페이스 구현  
		Collections.sort(applebox.getList(), new ApplePriceComp());  //// 정렬한 t1, t2 출력됨 
		 System.out.println("-----가격 정렬--------");
		System.out.println(applebox);
		
		
		System.out.println();
		
		Collections.sort(applebox.getList(), new FruitComp());
		Collections.sort(grapebox.getList(), new FruitComp());
		System.out.println(applebox);
		System.out.println(grapebox);
	}
}	
class FruitBox2<T extends Fruit2 > extends Box2<T>{} 
   

class Box2<T>{
	ArrayList<T> list = new ArrayList<T>();
	
	void add(T item)  { list.add(item); }   
	T get(int i)    {return list.get(i);  }
	
	ArrayList<T> getList() { return list;  }
	int size()   { return list.size(); }
	public String toString()  { return list.toString();  }
}



/* 문제 요지
 
 그냥 List
   apple. getlist()   -> 300,100,200
  
  
   Collections.sort을 통해 applebox와 grapebox 의 무게 정렬하는 방법 보기 
   sort()의 선언부는 static <T> void sort (List<T> list, Comparator<? super T> c)
                                          정렬할 대상     정렬 방법 
                                                    ==> 방법위해 AppleComp, GrapeComp, FruitComp 만듦 
     <? super Apple> => Apple ""Fruit"" Object                                              
     <? super Grape> => Grape ""Fruit"" Object 
    
    T가  Fruit인 경우 
    List<Fruit> list    Comparator<? super Fruit> c  => 이여도 List<Apple> 과 List<Grap>를 Comparator<Fruit>가 정렬할수있다. 


     
    ** Comparator 
    : 객체 정렬에 필요한 메서드를 정의한 인터페이스 
    
 */