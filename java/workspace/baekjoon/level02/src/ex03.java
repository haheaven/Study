package level02;

import java.util.Scanner;

// 윤년 찾기 
public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int answer = ( year%4==0 && year%100!=0 || year%400==0) ? 1 : 0;
		
		System.out.println(answer);
	}

}
