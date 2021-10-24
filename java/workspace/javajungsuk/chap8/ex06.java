package chap8;

public class ex06 {

	public static void main(String[] args) {
		// 06. 아래의 코드가 수행되었을 때의 실행결과를 적으시오.
		try {
			method1();
		} catch(Exception e) {
		        System.out.println(5);
		}
	}	
	static void method1() {
		try {
			method2(); 
			System.out.println(1);
		} catch(ArithmeticException e) {
			System.out.println(2);
		} finally {
		System.out.println(3);
		}
		
		System.out.println(4); 
		} // method1()
	
	static void method2() {
		throw new NullPointerException();

	}
}
    // 3 5
	// 1. main() -> 2. method1() -> 3. method2() NullPointerException 던진 후 종료 
	// 4. method1() : method2에서 던졌지만 method1 받을게 없으나 finally있으므로 무조건 실행 -> 3 출력후 종료 ( method2를 잡지못해서 4출력 못함)
	// 5. main() : 의 catch(Exception e) 에서  NullPointerException(); 처리하고 5 출력 
     