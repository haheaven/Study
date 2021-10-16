package level02;

import java.util.Scanner;

// 두 수 비교하기 
public class ex01 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		 
		if(num1 > num2 ) {
			System.out.println(">");
		} else if(num1 < num2) {
			System.out.println("<");
		} else 
			System.out.println("==");
	}

}
