package Chapter8;

public class Ex8_08 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("ae.getMessage():"+ae.getMessage());
			System.out.println("AtrithmeticException");
		} catch (Exception e ) {
			System.out.println("Exception");
		}
        System.out.println(5);
        
	}

}
