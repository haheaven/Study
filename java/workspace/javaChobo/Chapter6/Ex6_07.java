package Chapter6;

public class Ex6_07 {

	public static void main(String[] args) {
	   firstMethod();
	}
	
	static void firstMethod() {
		secondMethod();

	}
	static void secondMethod() {
		System.out.println("secondMethod()");
	}
}
