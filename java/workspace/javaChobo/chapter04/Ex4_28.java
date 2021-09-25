package chapter04;

import java.util.Scanner;

public class Ex4_28 {

	public static void main(String[] args) {
		int input = 0, answer = 0;
		
		answer = (int)(Math.random()*100+1);
		Scanner scanner = new Scanner(System.in);
		
		
		do {
		System.out.println("1~100사이 정수를 입력하세요 > ");
		input = scanner.nextInt();
		if(input> answer) {
			System.out.println("down");
		} else if(answer> input) {
			System.out.println("up");
		}
	}	while(input!=answer);
		    System.out.println("정답");

		    
    
 }
	
}
