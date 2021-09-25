package Chapter8;

public class Ex8_03 {
   public static void main(String[] args) {
	int n = 100;
	int result =0;
	
	for(int i=0; i<10; i++) {
		try {
		result = n/(int)(Math.random()*10) ;
		System.out.println(result);
	} catch(ArithmeticException e) {
		System.out.println(0);
	   }
	}
 }
}
