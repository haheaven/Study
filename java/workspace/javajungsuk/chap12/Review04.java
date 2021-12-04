package chap12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// 예제 12-2   (p.677)


class Fruit2 { 
	String name;
	int weight;
	
	public Fruit2(String name, int weight) {
		super();
		this.name = name;
		this.weight = weight;
	}
	public String toString()  { return name+"("+weight+")"; } 
}

class Apple2 extends Fruit2 { 
	Apple2(String name, int weight){
		super(name, weight);
	}
}
	
class Grape2 extends Fruit2 { 
	Grape2(String name, int weight){
		super(name, weight);
	}
}
  
class AppleComp implements Comparator<Apple2>{       // Comparator 정렬 
	public int compare(Apple2 t1, Apple2 t2) {
		return t2.weight - t1.weight;
	}
}


class GrapeComp implements Comparator<Grape2>{
	public int compare(Grape2 t1, Grape2 t2) {
		return t2.weight - t1.weight;
	}
}
class FruitComp implements Comparator<Fruit2>{
	public int compare(Fruit2 t1, Fruit2 t2) {
		return t2.weight - t1.weight;
	}
}



public class Review04 {
	public static void main(String[] args) {
		
		FruitBox2<Apple2> applebox = new FruitBox2<Apple2>();    //  FruitBox의 제네릭으로 Fruit와 그의 자손 타입 가능 
		FruitBox2<Grape2> grapebox = new FruitBox2<Grape2>();    //  FruitBox의 제네릭으로 Fruit와 그의 자손 타입 가능 
		
		applebox.add(new Apple2("GreenApple", 300));
		applebox.add(new Apple2("GreenApple", 100));
		applebox.add(new Apple2("GreenApple", 200));  // list 
	
		grapebox.add(new Grape2("GreenGrape", 400));
		grapebox.add(new Grape2("GreenGrape", 300));
		grapebox.add(new Grape2("GreenGrape", 200));
		
		Collections.sort(applebox.getList(), new AppleComp());
		Collections.sort(grapebox.getList(), new GrapeComp());
		
		System.out.println("applebox = " +  applebox);
		System.out.println("grapebox = " + grapebox);
		System.out.println();
		
		Collections.sort(grapebox.getList(), new FruitComp());
		Collections.sort(grapebox.getList(), new FruitComp());
		System.out.println("applebox = " +  applebox);
		System.out.println("grapebox = " + grapebox);
		
		
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














