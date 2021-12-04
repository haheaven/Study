package chap12;

import java.util.ArrayList;

// 예제 12-2   (p.677)


class Fruit implements Eatable{  public String toString()  { return "Fruit"; }  }

class Apple extends Fruit { public String toString()  { return "Apple"; } }
class Grape extends Fruit { public String toString()  { return "Grape"; } }
class Toy                 { public String toString()  { return "Toy"; } }
interface Eatable{}


public class Review03 {
	public static void main(String[] args) {
		
		FruitBox<Fruit> fruitbox = new FruitBox<Fruit>();    // 제네릭 타입 일치 + 클래스 일치 
		FruitBox<Apple> applebox = new FruitBox<Apple>();    // code.27 FruitBox의 제네릭으로 Fruit와 그의 자손 타입 가능 
		FruitBox<Grape> grapebox = new FruitBox<Grape>();    // code.27 FruitBox의 제네릭으로 Fruit와 그의 자손 타입 가능 
	//	FruitBox<Grape> grapebox = new FruitBox<Apple>();    // 타입 불일치 에러
	//	FruitBox<Toy> toy = new FruitBox<Toy>();             // Toy는 자손이 아니라서 FruitBox<>의 타입 불가능 
		
		fruitbox.add(new Fruit());     // fruitbox의 타입은 Fruit이므로 Fruit객체 생성 가능 
		fruitbox.add(new Apple());     // fruitbox의 타입은 Fruit이므로 자손인 Apple객체 생성 가능 
		fruitbox.add(new Grape());     // fruitbox의 타입은 Fruit이므로 자손인 Grape객체 생성 가능 
		applebox.add(new Apple());     // applebox의 타입은 Apple이므로 Apple 객체 생성 가능 
//		applebox.add((Apple)new Fruit());
//    	applebox.add(new Grape());     // applebox의 타입은 Apple이므로 상관없는 Grape객체 생성 불가능 
		grapebox.add(new Grape());     // grapebox의 타입은 Grapge이므로 Grape 객체 생성 가능 
		
	
		System.out.println("fuitbox = " + fruitbox.toString());
		System.out.println("applebox = " +  applebox);
		System.out.println("grapebox = " + grapebox);
		
	}
}	

class FruitBox<T extends Fruit & Eatable > extends Box<T>{} 
    //   <T extends Fruit & Eatable >  이므로 FruitBox<Fruit> <Apple> <Grape> 가능 사용시 제네릭타입은 꼭 일치하기

class Box<T>{
	ArrayList<T> list = new ArrayList<>();
	void add(T item)  { list.add(item); }    // 이 문제에서 Box<T>의 T는 객체이므로 item의 타입은 Object이어야 한다. 
	T get(int i)    {return list.get(i);  }
	int size()   { return list.size(); }
	public String toString()  { return list.toString();  }
}


