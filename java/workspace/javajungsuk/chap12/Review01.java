package chap12;

public class Review01 {
	public static void main(String[] args) {
	//  연습문제1 클래스 Box가 다음과 같이 정의되어 있을 때, 다음 중 오류가 발생하는 문장은? 경고가 발생하는 문장은?
	
		/*
		     class Box<T>  {
		       T item;
		       
		       void setItem(T item) { this.item = item; }
		       T getItem() { return item;  }
		 
		 ----------------------------------------------------
		 
		 a. Box<Object> b = new Box<String>();
		 b. Box<Object> b = (Object)new Box<String>();
		 c. new Box<String>.setItem(new Object());
		 d. new Box<String>.setItem("ABC");
		 
		  
		 a. <Object>   <String>   ==> 타입 불일치 ==> 대입된 타입은 무조건 일치하기 
		 b. <Object>   <String>   ==> 타입 불일치 ==> 대입된 타입은 무조건 일치하기 
		 c. new Box의 제네릭은 <String>이기 때문에 setItem(   )의 매개변수도 String 타입이어야 한다.
		 
		 */
	
		
		
	}
}	
