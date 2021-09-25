package Chapter6;

public class Ex6_08 {

	public static void main(String[] args) {
	    System.out.println("main(String[] args)이 시작");
		firstMethod();
		System.out.println("main(String[] args)이 끝");
	}
	
	static void firstMethod() {
		System.out.println("firstMethod()이 시작");
		secondMethod();
		System.out.println("firstdMethod)이 끝");
	}
	
	static void secondMethod() {
		System.out.println("secondMethod)이 시작");
		System.out.println("secondMethod)이 끝");
	}
}
