package chapter04;

public class Ex4_Ex {

	public static void main(String[] args) {
//		for(int i = 1; i<=6; i++) {
//			for (int j = 6; j>0; j--) {
//				if (j > i) {
//					System.out.print(" ");
//				} else {
//					System.out.print("*");
//				} 
//			} System.out.println();
	//	}

		for(int i =0; i < 6; i++) {
			for(int j = 5; j>i; j-- ) {
		      System.out.print(" ");
			}for(int j = 1; j<=i*2+1; j++) {
				System.out.print("*");
			} System.out.println();
		}
		for(int i =0; i < 5; i++) {
			for(int j = 0; j<=i; j++) {
				System.out.print(" ");
			}for(int j = 9; j>=i*2+1; j--) {
				System.out.print("*");
			}System.out.println();
			
		}
		
		
		
		
	}

}
