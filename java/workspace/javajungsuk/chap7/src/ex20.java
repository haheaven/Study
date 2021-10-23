package chap7;

public class ex20 {

	public static void main(String[] args) {
		
		Parent2 p = new Child2(); 
		Child2 c = new Child2();
		
		System.out.println("p.x = " + p.x);     //p.x = 100
		p.method();								//Child2 Method
		System.out.println("c.x = " + c.x);		//c.x = 200
		c.method();								//Child2 Method
			
	}   						//부모의 참조변수가 자식의 클래스를 바라보는 경우 
								// 같은 변수는 부모의 값을 가지지만 메서드의 경우 오버라이딩되어 자식메서드 값으 가지게 된다. 
	
}
		class Parent2 { 
		  int x = 100;
		  void method() {
				System.out.println("Parent2 Method");
		   }
		}
		class Child2 extends Parent2 {
		  int x = 200;
	      void method() {
		  System.out.println("Child2 Method");
	      }
		}
		
		
		
		