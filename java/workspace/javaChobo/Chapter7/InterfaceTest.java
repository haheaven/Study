package Chapter7;


class A {
	//public void method(B b);  // 인터페이스를 구현하지 않았으면 일일이 변경해야함 
	public void method(I i) {
		i.method();
	}
}
interface I {
	public void method();
}
class B implements I{
	public void method() {
		System.out.println("B 클래스의 메서드 ");
	}
}
class C implements I {
	public void method() {
		System.out.println("C 클래스의 메서드 ");
	}
}



public class InterfaceTest {
	public static void main(String[] args) {
        A a = new A();
        a.method(new B());
        System.out.println(a.toString());
	}
}
