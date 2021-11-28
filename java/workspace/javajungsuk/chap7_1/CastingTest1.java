package chap7_1;

public class CastingTest1 {

	public static void main(String[] args) {
	   // test1 
//		Car car = new Car();                 // 0x100  멤버 5개  color door drive()  stop()  water()
//		FireEngine fe = new FireEngine();    // 0x200  맴버 5개  color door drive()  stop()  (@override)water()
//
//		fe.water();     // 자손water
//		car = fe;       				// car =(Car)fe; 에서 형변환이 생략된 형태다     ** 업캐스팅  :  car(0x200) <- fe(0x200)
//		car.water(); 					// 메소드는 자손껄로 자손water
//		System.out.println(fe == car );    // 같은 주소 확인 : true 

	
		//fe 인스턴스는 멤버를 6개 가지고 있으며, car(0x200) <- fe(0x200)를 가리킨다.  인스턴스 범위가 같기 때문에 잘 실행된다. 
	
		
		
		/**----------------------------------------------------------------**/
		
		
	  // test2
//		Car car = new Car();                 // 0x100  멤버 4개   color door  drive()  stop()
//		FireEngine fe = new FireEngine();    // 0x200  맴버 5개   color door  drive()  stop()   water()
//
//		
//		car.drive(); 	     // drive, Brrrr~ 
//		fe = (FireEngine)car;    // fe = (FireEngine)car 다운 캐스팅  컴파일은 ok -> runTime시 오류 발생 (ClassCastException)
//	    fe.drive();  
		
		
	    // car의 멤버는 4개이며 FireEngine 타입의 멤버는 5개이다 5<-4 로 늘리는 건 안되기 때문에 오류가 난다,
	    // 해결을 위해서는 Car car = new Car() 가 아닌 Car car = new FireEngine()으로 먼저 다운캐스팅을 해야한다.
	    									//(멤버는 5개를 가리키는 주소가 되었지만  car가 water()는  갖고 있지 않기 때문에 water() 사용은 불가능)
	    
		
		/**----------------------------------------------------------------**/		
		
	// test3
		Car car = new Car();                 //0x100   color   door    drive()   stop()  water()
		FireEngine fe = new FireEngine();    //0x200   color   door    drive()   stop()  (@Override)water()

		car.water();    // Car 타입 그냥 자신        조상water 
		fe.water();     // FireEngine 타입 그냥 자신 자손water
		
		fe = (FireEngine) car;     //  fe(0x100)  <-- car(0x100)  불가능? 왜? 멤버는 일치함 
												// why...???????
		car.water(); 	        
		
	}
}

	class Car {
		String color;
		int door;
	
		void drive() { 		
			System.out.println("drive, Brrrr~");
		}
	
		void stop() {		
			System.out.println("stop!!!");	
		}
		void water() {		
			System.out.println("조상 water");
		}
	}
	
	
	class FireEngine extends Car {	
		
	  @Override
		void water() {		
			System.out.println("자손 water!!!");
		}
	}
	
	
	// 업 캐스팅 : 서브클래스(자손)이 슈퍼클래스(조상)이 되는 것 -> 자손은 조상의 모든 특성을 상속받기 때문에 가능 
	// 다운 캐스팅 : 슈퍼클래스(조상)가 서브클래스(자손)가 되는것 -> 조상의 멤버수는 자손보다 같거나 적다,  기존조상클래스의 인스턴스를 추가하는건 불가능하다! 
	
	
	
	
	
	