package Chapter8;

public class Ex8_07 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch (ArithmeticException ae) {
			if (ae instanceof ArithmeticException)
				System.out.println("true");
			System.out.println("AtrithmeticException");
		} catch (Exception e ) {
			System.out.println("Exception");
		}
        System.out.println(5);
        
	}

}
