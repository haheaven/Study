package chapter04;

public class Ex4_ex2 {

	public static void main(String[] args) {
		// 다이아몬드만들기 
		for(int i =0; i<6; i++) {
			for(int j =5; j>i; j--) {
				System.out.print(" ");
			}for(int j = 0; j<i*2+1; j++){
				System.out.print("*");
			}System.out.println();
		}
		//System.out.println("---------------");
		
		for(int i =0; i<5; i++) {
			for(int j=0; j<=i; j++) {
		       System.out.print(" ");
			} 
			for(int j= 9; j>=i*2+1; j--) {
			System.out.print("*");
	    	  }System.out.println(); 
	    	}
    	}
	}

