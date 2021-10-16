package chap7;
// 7.  다음 코드의 실행했을 때 호출되는 생성자의 순서와 실행결과를 적으시오.

class Parent { 
	int x=100;
	
	Parent() {
		this(200);     // 3. 첫줄에 생성자 적었지만 this(200)으로 매개변수 생성자한ㅌㅔ감 
    }
	 Parent(int x) {   // 4. 매개변수 생성자에 첫줄생성자가 없기 때문에 super()를 생성함 
		 this.x = x;    // x = 200
	 }
	int getX() {
	 return x;
    }
}

class Child extends Parent {
	int x = 3000;
	
	Child(){             // 1, child() -> 이곳에서  자신 생성자 호출해서 부모한테 안감 
		this(1000);
	}
	Child(int x){        //2. 위의 this(1000) 으로 내려왔지만 첫줄에 생성자 없으므로 
		this.x =x;      // 컴파일러가  super() 통해 조상한ㅌㅔ감 
	}
}                     //여기까지 x = 1000
public class ex07 {

	public static void main(String[] args) {
		Child c = new Child();         
		
		System.out.println("x= "+c.getX());
	}
}

  




