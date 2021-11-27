package chap7_1;

interface checkable {   void method();  }    // 인터페이스 메서드명 method

class exper1 {
	void method() {
			System.out.println("그냥상속");    // 조상클래스 메서드명 method 
	}
}


class exper2 extends exper1 implements checkable {
	
	public void method() {
		System.out.println("aaaaaa");
	}
	
}
public class exper  {
	public static void main(String[] args) {
	
	exper2 e = new exper2();
	e.method();
	}

}


// 궁금한 부분 : 인터페이스 메서드와 조상클래스 메서드명이 같을 때 
// 생각해 본 결과 : 결국 인터페이스의 추상메서드는 꼭 구현해야하므로 조상메서드명이 오버라이드 되어 출력됨.. 
// 느낌점 : 당연한건데 ... 쉽게 결과를 생각하지 못했음 
//  만약 같은 메서드명인데 꼭 추상클래스의 메서드를 상속받고 싶을 경우엔..? => 이름 중복이 없는 새 인터페이스를 만들던가, 인터페이스를 구현하지 말든가?,,,?
