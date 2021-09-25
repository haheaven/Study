package chapter04;

public class Ex4_26 {

	public static void main(String[] args) {
		int sum =0;
		int i=0;
		
		while( 100>=sum) {
			System.out.printf("%d - %d%n", i, sum);
			sum += ++i;
		}
	}

}
