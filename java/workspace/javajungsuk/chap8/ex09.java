package chap8;
// 9.  다음과 같은 조건의 예외클래스를 작성하고 테스트하시오.
		
		class UnsupportedFuctionException extends RuntimeException{
			 private final int ERR_CODE;
			
			public UnsupportedFuctionException(String msg, int errCode) {
				super(msg);     // 조상의 생성자 runtimeException(String msg) 를 호출 
				ERR_CODE  = errCode;
			}
			
			public UnsupportedFuctionException(String msg) {
				this(msg, 100);
			}

			

			public int getErrorCode() {
				return ERR_CODE;
			}
			
				
			public String getMessage() {
				return "["+ getErrorCode()+"]" + super.getMessage();   // Exception의 getMessage() 호출 
			}
					
		} // class end 

		public class ex09 {
			
			public static void main(String[] args) throws Exception {
				throw new UnsupportedFuctionException("지원하지 않는 기능입니다.", 100);
	}

}

		// 오답 : 
		// 기본값을 변수선언, 초기화로 같이 주었음 
		// --> 객체가 생성 될 때 기본값으로 초기화해야함 =!
		// --> 상속관계의 생성자호출에 대한 복습이 더 필요
		
		
		
		