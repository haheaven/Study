package level03;

import java.util.Scanner;

// 1. 구구단 
public class ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 int N = sc.nextInt();
		 // 유효성 검사 
		 if( 1 > N || 9 < N) {
			 System.out.println("N은 1~9사이 입니다. 다시 입력하세요.");
			return;
		 }
		for(int i=1; i<=9; i++) {
			System.out.println(N +" * "+ i+ " = " + N*i);
		}
	}
}
