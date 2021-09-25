package chapter4;

public class ex4_3 {

	public static void main(String[] args) {
		int totalsum=0;
		int sum =0;
		for(int i =1; i<=10; i++) {
			sum += i;
		   totalsum += sum;
		}	
		 System.out.println(totalsum);

	}

}
