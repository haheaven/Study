package chapter04;

public class Ex4_22 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50 };
		int sum =0;
		
		for(int i =0; i< arr.length; i++)
		 System.out.printf("%d ", arr[i]);   //10 20 30 40 50 
	System.out.println();
	
	for(int tmp : arr) {
		System.out.printf("%d ", tmp); //10 20 30 40 50 
		sum += tmp;
	}
	System.out.println();
	System.out.println("sum=" + sum); //sum=150

	}
}
