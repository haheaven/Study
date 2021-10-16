package chap6;
// 19. 다음 코드의 실행 결과를 예측하여 적으시오.
public class ex19 {
	public static void main(String[] args) {
	String str = "ABC123";
	System.out.println(str);
	change(str);
	System.out.println("After change:"+str);
  }

	public static void change(String str) {
		str += "456";
	}
	
}


 // 실행 결과 :  ABC123
 //            After change: ABC123456   --> String 기본형이 아니므로  참조형 매개변수로 생각해서 답을 단순하게 생각해냄 
//                               // String의 특성: 1000번지 메모리에 'aa' 저장하면 4바이트 재할당해서 'aaa' 6바이트이므로 항상 새주소로 참조하게 됨 

// ******* 그러나 change()에서 문자열 주소를 넘겨받은 후에  456을 붙이고, 문자열은 내용을 변경할 수 없기 때문에 새로운 문자열이 생성되고,
//새 주소가 str 에 저장됨 



// method area---------
// main()			 |
// change(String str)|
//					 |


// stack----------------------
//	---change()------         |
//  str(0X100)) -> str(0X200) |  -> change(str) 종료 후 gc로 
//					          |
//	 ----main()---------------|
//	str(0x100)		 		  |
//				    		  |


// heap--------------
//  0x100("ABC123")
//   0X200("ABC123456")      -> change(str) 종료 후 gc로 



// String 연산시 인스턴스가 생길 때마다 메모리 차지하기 때문에 낭비가 존재했다.
// ->StrinBuilder, StringBuffer의 객체생성 후 append 메소드를 이용하면 문자열을 결합해도 새로운 메모리를 발생하지 않게 된다.









