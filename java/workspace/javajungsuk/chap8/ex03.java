package chap8;

public class ex03 {

	public static void main(String[] args) {
		// 3. 다음 중 오버라이딩이 잘못된 것은? (모두 고르시오)
	 	
	  /*
	  	void add(int a, int b)
	 			throws InvalidNumberException, NotANumberException {}
	 			
		class NumberException extends Exception {}
		class InvalidNumberException extends NumberException {} 
		class NotANumberException extends NumberException {}
		 */
		
		/*
		 a. void add(int a, int b) throws InvalidNumberException, NotANumberException {} 
		 b. void add(int a, int b) throws InvalidNumberException {}
		 c. void add(int a, int b) throws NotANumberException {}
		 d. void add(int a, int b) throws Exception {}
		 e. void add(int a, int b) throws NumberException {} 
		 */
		
		// 오답 
		// 오버라이딩을 할 때 조상 클래스의 메서드보다 많은 수의 예외를 선언할 수 없다..
		// 조상보다 자손 예외의 개수는 적거나 같아야 한다는 조건을 만족시키지 못하는 잘못된 오버라이딩
		
		
	}

}
