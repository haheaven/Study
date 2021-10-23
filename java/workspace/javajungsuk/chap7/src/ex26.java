package chap7;
// 26.  Outer클래스의 내부 클래스 Inner(static)의 멤버변수 iv의 값을 출력하시오. 
class Outer2 {
	static class Inner2{
		int iv = 200;
	}
}
public class ex26 {

	public static void main(String[] args) {
		// 내부 클래스가 static 이면  외부클래스 객체생성 먼저 하지 않아도 된다. 
		// 내부클래스 메소드영역에서 언제든지 호출 가능한 객체로 있기 때문에  
		// 클래스는 언제든지 호출가능한 상태이지만 필드는 일반이기 때문에 내부클래스 객체생성 후 불러와야 함 
		Outer2.Inner2 inner2 = new Outer2.Inner2();
		System.out.println("static Inner 클래스의 iv= "+ inner2.iv);
	}

}
