package chapter04;

public class Ex4_17 {

	public static void main(String[] args) {
	 for(int i = 1; i<=5; i++) {
		 for(int j=1; j<=i; j++) {
			 System.out.print("*");
		 } System.out.println();
	 }
	 
	 System.out.println("-----------------------------");
	 
	 for(int i = 1; i<=5; i++) {
		 for(int j=5; j>=i; j--) {
			 System.out.print("*");
		 } System.out.println();
	 }
	 System.out.println("-----------------------------");
	 
	 for(int i = 1; i<=5; i++) {
		 for(int j =5; j>i; j--) {
			 System.out.print(" ");
		 } 
		 for(int j=1; j<i+1; j++) {
			 System.out.print("*");
		 }System.out.println();
	 }
	 
	 
	 
	}

}
