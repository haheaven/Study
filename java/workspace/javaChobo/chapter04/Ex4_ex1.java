package chapter04;

public class Ex4_ex1 {

	public static void main(String[] args) {
		//이등변 삼각형 만들기 
       for(int i = 0; i<4; i++) {
    	   for(int j =0; j<3-i; j++) {
    		   System.out.print(" ");
    		   }
    	    for(int j = 0; j<2*i+1; j++) {
    	    	System.out.print("*");
    	    }System.out.println();
    	   }
       
        System.out.println("-------");
        
        for(int i = 0; i<4; i++) {
     	   for(int j =3; j>i; j--) {
     		   System.out.print(" ");
     	   }for (int j =0; j<i*2+1; j++) {
     		   System.out.print("*");
     	   } System.out.println();
  	   }
	}
}