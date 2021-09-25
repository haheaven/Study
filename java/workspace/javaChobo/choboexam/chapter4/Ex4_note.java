package chapter4;

import java.util.Scanner;

public class Ex4_note {

	public static void main(String[] args) {
		int answer = (int)(Math.random()*100+1);
		int input = 0, count=0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			count++;
			System.out.println("1~100 사이 정수를 입력하세요. >>");
			input = scanner.nextInt();
		
		
		
		if (input>answer) {
			System.out.printf("%d보다 작은 수를 입력하세요. %n", input);
		} else if (input < answer) {
			System.out.printf("%d보다 큰 수를 입력하세요. %n", input);
		} else {
			System.out.println("정답입니다");
		    System.out.printf("%d번만에 맞췄습니다.", count);
		    break;
		 }
		} while(true);
	
	
	} //end of main 
} // end of class