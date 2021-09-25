package Chapter8;

public class Ex8_02 {

	public static void main(String[] args) {
		int n = 100;
		int result =0;
		
		for(int i=0; i<10; i++) {
			result = n/(int)(Math.random()*10) ;
			System.out.println(result);
		}
        
	}

}
