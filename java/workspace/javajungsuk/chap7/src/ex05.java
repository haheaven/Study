package chap7;
// 5. 다음의 코드는 컴파일하면 에러가 발생한다. 
//그 이유를 설명하고 에러를 수정하기 위해서는 코드를 어떻게 바꾸어야 하는가?

class Product {
	int price;
	int bonusPoint;
	// 추
	Product(){	
	}
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
}
class Tv extends Product{
	Tv() {
		super();
	}      // --> 생성자의 첫줄에 생성자가 없으면 컴파일러가 자동으로 조상생성자를 호출하고 여기서 조상은 매개변수가 있는 product생성자가 아닌 
	       //  --> 기본 생성자이다.(=Product()) 조상클래스에서 매개변수가 있는 생성자가 있으므로 컴파일러가 기본생성자를 추가하지  못하기 때문에 직접 추가해야한다. 
	
	
	public String toString() {
		return "Tv";
	}
}

public class ex05 {
	public static void main(String[] args) {
		Tv t = new Tv();
	}

}

// super() 관련한 강의 복습 
