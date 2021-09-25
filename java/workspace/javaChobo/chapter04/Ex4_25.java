package chapter04;

import java.util.Scanner;

public class Ex4_25 {

	public static void main(String[] args) {
		int num = 0, sum=0;
	    System.out.println("숫자를 입력하세요 > ");
	    
	    
		Scanner scanner = new Scanner(System.in);
	    String tmp = scanner.nextLine();
	    num = Integer.parseInt(tmp);
	    
	    while(num!=0) {
	    	//num을 10으로 나눈 나머지를 sum에 더함 
	    	sum += num%10;
	    	System.out.println("sum=" +sum + ", num%10="+num%10);
	    	
	    	num /= 10;
	    }
	    System.out.println("각 자리수의 합 :" + sum);
	}

}
