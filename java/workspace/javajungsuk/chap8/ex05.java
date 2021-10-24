package chap8;

public class ex05 {

	static void method(boolean b) {
		// 5.  아래의 코드가 수행되었을 때의 실행결과를 적으시오.
		try {
			System.out.println(1);
			if(b) throw new ArithmeticException();
			System.out.println(2);
		} catch(RuntimeException r) { 
			System.out.println(3);
			return;
		} catch(Exception e) { 
			System.out.println(4);
			return;
	
		} finally {
		    System.out.println(5);
		}
		System.out.println(6);
	}
		public static void main(String[] args) {
		 method(true);   // 1 3 5  
		 method(false);  // b의 초기화는 false이므로 try의  1, 2  출력 finally는 예외든 아니든  출력이므로 5, 마지막 만족하므로 6 => 1,2,5,6
	}
}

// 오답 :
//  ArithmeticException은 RuntimeException의 자식이므로 if(b)에서 catch(RuntimeException r)로 향함 