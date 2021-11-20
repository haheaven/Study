package chap6_1;
// 생성자 예제 6-26 

class Car {
	String color;
	String gearType;
	int door;
 // 1)-2 이러한 필드를 갖는 객체 생성 ( 0x100)
	Car(){
		this("white", "auto", 4);
	}
// 2)-2  	
	Car(Car c){
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}	
}

public class Review04 {
	public static void main(String[] args) {
	// 1)-1   c1 객체 0x100 생성 
		Car c1 = new Car();
	// 2)-1   c2객체 0x200생성 = c1복사   
		Car c2 = new Car(c1);
		
		System.out.println("c1의 color= " +c1.color +". gearType="+c1.gearType+", door= "+c1.door);  // "white" , "auto" ,4
		System.out.println("c2의 color= " +c2.color +". gearType="+c2.gearType+", door= "+c2.door);  // "white" , "auto" ,4
		
		
		c1.door = 100;    // 3) c1(0x100)의 door = 100 
		System.out.println("c1.door = 100 수행 후 ");
		System.out.println("c1의 color= " +c1.color +". gearType="+c1.gearType+", door= "+c1.door);   // "white" , "auto",100
		System.out.println("c2의 color= " +c2.color +". gearType="+c2.gearType+", door= "+c2.door);   // "white" , "auto",4
		
		//=> c1과 c2는 별개의 객체
		//   c2를 생성할 때 필드만 c1의 필드를 복사 한 것이다. 이후 각 객체에서의 필드들이 변경되어도 영향을 주지 않는다. 
		
		
	}	
}
/*
	생성자 
	: 인스턴스 초기화 메서드 
	연산자 new가 인스턴스를 생성하는 것이지 생성자가 인스턴스를 생성하는 것이 아니다. 
   
*/