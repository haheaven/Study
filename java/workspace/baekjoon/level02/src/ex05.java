package level02;

import java.util.Scanner;

// 알람시계 

public class ex05 {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   
	   int H = sc.nextInt();
	   int M = sc.nextInt();
	   // 유효성 검사 
	   if(0 > H || 24 <= H) 
		   System.out.println("시는 0~23시로 표현 가능합니다. 다시 입력하세요");	  
	   if ( 0> M || 60 <= M ) 
		   System.out.println("분은 0~59분까지로 표현 가능합니다. 다시 입력하세요");
		 
	   
    if(0<=H && H<=23) {   
	   if( 0<=M && M<=59) {
		   if(M<45) {
			   if(H==0) {
				   H=23;    // 0시면 H=23
				   System.out.println(H+" "+( M+15));
			   } else
				   System.out.println((H-1) + " " + (M+15));
		   } // 45분 미만  
		   else 
			   System.out.println( (H) + " " + (M-45));
	   }
    } // H if문 end 
	   
	   
	}
}

