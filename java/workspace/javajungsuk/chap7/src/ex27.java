package chap7;
// 27. 다음과 같은 실행결과를 얻도록 1~4 코드를 완성하시오 
class Outer3 {
	int value  =  10;    // outer.this.변수명
	
	class Inner3{
		int value=20;   // this.변수명
		void method1() {
			int value=30;  // 변수명
			System.out.println("	    value: " + value);                  // 가장가까운 value 
			System.out.println("       this.value: " + this.value);         // 내부클래스의 필드 value
			System.out.println("Outer3.this.value: " + Outer3.this.value);  //Outer의 iv
		}
	} //end of Inner3
} // end of Outer3

public class ex27 {
	public static void main(String[] args) {
		
		// 4) 코드 넣기 
		Outer3 outer3 = new Outer3();
		Outer3.Inner3 inner3 = outer3.new Inner3();
		
		inner3.method1();

	}

}
