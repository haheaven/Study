package chap6;
// 18.  다음의 코드를 컴파일하면 에러가 발생한다. 컴파일 에러가 발생하는 라인과 그 이유를 설명하시오.
public class ex18 {
public static void main(String[] args) {
	
  }
}
	 class MemberCall {
			 int iv = 10;
			 static int cv = 20;
		 
			 int iv2 = cv;
//			 static int cv2 = iv;    		// 라인A : 에러 발생  static 변수에 iv 대입 불가 
			 
			 static void sMethod1() {
				 System.out.println(cv);
//				 System.out.println(iv);    // 라인 B : 에러 발생 static 메서드에 iv 사용불가 
			 }
			 
			 void instanceMethod1() {
				 System.out.println(cv);
				 System.out.println(iv);     // 라인 c : im에서는 iv사용 가능 
			 }
			 
			static void sMethod2() {
				sMethod1();
	//			instanceMethod1();           //라인 D : 에러발생  static 메서드 instance 메서드 사용 불가 
			}
			
		   void instanceMethod2() {
			   sMethod1();
			   instanceMethod1();          // 라인 E : instance 메서드에서 instance 메서드 사용 가능 
		   }
}	 
	 
	 // 종합 이유 : static 메서드나 변수에서는 instance 메서드나 변수 사용불가
	 //        --> im/iv는 객체생성후 접근 가능한데 cm,cv는 가장 먼저 생성되기 때문에 객체 생성여부를 알 수 없기 때문에 사용 불가 

