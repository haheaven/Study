package level03;

import java.util.Scanner;

// A+B
public class ex02 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	
		int T = sc.nextInt();
		
		for(int i=1; i<=T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			// 유효성 검사 
			if( (A<0 || A>10) || (B<0 || B>10) ) {
				System.out.println("A와 B는 1~9사이 입니다. 다시 입력하세요.");
			    return;
			}
			System.out.println(A+B);
		}
	}
}
