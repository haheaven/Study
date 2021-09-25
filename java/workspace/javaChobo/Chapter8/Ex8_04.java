package Chapter8;

public class Ex8_04 {
   public static void main(String[] args) {
	    System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(4);
		} catch (Exception e) {  //예외가발생하지 않아 실행 안함 
			System.out.println(5);
		} // try - catch end 
		System.out.println(6);
   }
  }
