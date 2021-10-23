package chap7;

// 25. Outer클래스의 내부 클래스 Inner의 멤버변수 iv의 값을 출력하시오.
class Outer {    // 외부클래스 
	class Inner{  // 내부클래스 
		int iv=100;
	}
}
public class ex25 {

	public static void main(String[] args) {
		// 코드
	     Outer outer = new Outer();				  // 2)Outer의 객체생성이 먼저작성되어야한다. 
	     Outer.Inner inner = outer.new Inner();   // 1) Inner 객체를 불러오기 위해서 
	     										  // 3) Outer내부 Inner클래스의 참조변수가 Outer클래스에 접근하는 outer참조변수를 통해 Inner를 불러와 내부를 바라볼수있다.
	     System.out.println(inner.iv);
	  	}
}

// 책참고