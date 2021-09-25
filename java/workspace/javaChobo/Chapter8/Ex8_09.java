package Chapter8;

public class Ex8_09 {

	public static void main(String[] args) {
		try {  // Exception 과 그 자손은 반드시 예외처리를 해줘야 한다(필수)
			  throw new Exception() ;   //Exception 을 고의로 발생 
		} catch (Exception e) {}
	
		 //RuntimeException 의 경우 try-catch 선택이다.
		// 컴파일은 됨 
		throw new RuntimeException();
	}
}