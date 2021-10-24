package chap8;

public class ex02 {

	public static void main(String[] args) {
		// 2. 다음은 실행도중 예외가 발생하여 화면에 출력된 내용이다. 이에 대한 설명 중 옳지 않은 것은?
		   // --> 실행 도중 예외는 런타임에러!
		/*  
			java.lang.ArithmethicException : by zero
			at ExceptionEx18.method2(ExceptionEx18.java:12) 
			at ExceptionEx18.method1(ExceptionEx18.java:8)
			at ExceptionEx18.main(ExceptionEx18.java:4)
		
         */
		 /*
		  * a. 위의 내용으로 예외가 발생했을 당시 호출스택에 존재했던 메서드를 알 수 있다.					// T. stack에 있던 메서드들의 호출 순서와 에러를 나타내고 있음 
			b. 예외가 발생한 위치는 method2 메서드이며, ExceptionEx18.java파일의 12번째 줄이다.     // T. 마지막 12번째에서 발생함 
			c. 발생한 예외는 ArithmeticException이며, 0으로 나누어서 예외가 발생했다.               // T. 첫줄애 ArithmethicException : by zero
			d. method2메서드가 method1메서드를 호출하였고 그 위치는 ExceptionEx18.java파일의 8 번째 줄이다.
			   // F.  => main -> method1  - > method2  순서로 호출하였고 위치는 12번째 줄이다. 
		  */
		
		
		
		
		
		
		}

}
