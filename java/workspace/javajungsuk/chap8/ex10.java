package chap8;
// 10. 아래의 코드가 수행되었을 때의 실행결과를 적으시오.

public class ex10 {
	public static void main(String[] args) {
		try {
			method1();
			System.out.println(6);
		} catch(Exception e) {
		     System.out.println(7);
		}
	//	Exception > runtimeException > NullPointerException
	}
	static void method1() throws Exception {
		try {
			method2();
			System.out.println(1);
		} catch(NullPointerException e) {
			System.out.println(2);
			throw e;
		} catch(Exception e) {
			System.out.println(3);
		} finally {
			System.out.println(4);
		}
		System.out.println(5);;
	} // method1()
	
	static void method2() {
		throw new NullPointerException();
	}

}


// 답 
//   main -> method1 -> method2 null 던지고 종료 
//   -> method1에서 catch(NullPointerException e)실행으로  =>  2
//   -> throw e 여부와 상관없이 일단 finally = > 4 
//    -> throw e 때문에 main의 catch(Exception e) =>  7  출력 후 종료 