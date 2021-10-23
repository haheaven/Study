package chap7;

public class ex15 {

	public static void main(String[] args) {
		// 15. 클래스가 다음과 같이 정의되어 있을 때, 형변환을 올바르게 하지 않은 것은? (모두 고르시오.)
		class Unit {}
		class AirUnit extends Unit {}
		class GroundUnit extends Unit {} 
		class Tank extends GroundUnit {} 
		class AirCraft extends AirUnit {}
		
		Unit u = new GroundUnit(); 
		Tank t = new Tank();
		AirCraft ac = new AirCraft();
		
//		  a. u = (Unit)ac;          		   // 조상타입으로 형변환 
//		  b. u = ac;               			   // 형변환 생략 가능 
//		  c. GroundUnit gu = (GroundUnit)u;    // 자손타입으로 형변환(생략불가능)  //u는groundunit 참조하고 있기 때문에 가능 
//		  d. AirUnit au = ac;				   // 자손타입으로 형변환
//		  f. GroundUnit gu = t;   			   // 조상타입으로 형변환 
		
		
		
//		  e. t = (Tank)u;  
	  // false =>  조상타입의 '인스턴스'를 자손타입으로 형변환 불가 
	  // 객체는 조상 인스턴스인 상태에서 tank의 참조변수 t가 t의 멤버를 호출하려고 하면 조상 인스턴스에는 t의 멤버가 없기 때문에 불가능하다!!
	 // ( -> 조상 인스턴스의 멤버 수보다 자손 인스턴스의 멤버수가 많거나 같으므로 조상에서 가지지 않은 멤버를 부르려고하면 없기 때문에 불가능 )
	 //컴파일은 가능할지라도 실행시  java.lang.ClassCastExceptin 발생 
		
		
		
		
		
		// 오답 
	/*----- 참조변수의 형변환 ------
	   사용할 수 있는 멤버의 갯수를 조절하는 것 -> 값이 변하는 게 아니라 때마다 멤버수 변경 
	 	
		 조상 = 자손위치일 경우 형변환 생략 가능 
		 자손 = 조상 위치일 경우 형변환 필수 --> 프로그램에서 형변환이 필요한 경우 수정가능하게 만듦 
	
	
	 */
	}

}
