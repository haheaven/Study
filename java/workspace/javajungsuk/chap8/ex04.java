package chap8;

public class ex04 {

	public static void main(String[] args) {
		// 4. 다음과 같은 메서드가 있을 때, 예외를 잘못 처리한 것은? (모두 고르시오)
		/*
		  void method() throws InvalidNumberException, NotANumberException {}
			
		 class NumberException extends RuntimeException {}
	     class InvalidNumberException extends NumberException {} 
	     class NotANumberException extends NumberException {}
		 */
		
		/*
			a. try {method();} catch(Exception e) {}
			b. try {method();} catch(NumberException e) {} catch(Exception e) {}
			c. try {method();} catch(Exception e) {} catch(NumberException e) {}
		    d. try {method();} catch(InvalidNumberException e) {
							} catch(NotANumberException e) {}
			e. try {method();} catch(NumberException e) {}
			f. try {method();} catch(RuntimeException e) {}
		
		*/		
		// 답
		// c: Exception은 최고조상이므로 가장 마지막에 위치 해야한다.
		 
		
		
		/*
		 *    Exception > RuntimeException >  NumberException > InvalidNumberException , NotANumberException 
		 */
		
		

	}

}
