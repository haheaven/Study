package chap4;

import java.util.Scanner;
//	[4-1] 다음의 문장들을 조건식으로 표현하라.
	
public class ex04_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
		 int x = sc.nextInt();
		 x = 10<x && 20 > x ? 1 : 0;
		 System.out.println("1번 : " + x);
		
//		2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
		char ch = 'd';   
		ch = !((ch == ' ') || (ch =='\t')) ? 'T' : 'F';
		System.out.println("2번 : " + ch);
		
//		3. char형 변수 ch1가 ‘x' 또는 ’X'일 때 true인 조건식
		char ch1 = 'x';   
		ch1 = ((ch1 =='x') || (ch1=='X')) ? 'T' : 'F';
		System.out.println("3번 : " + ch1);
		
//		4. char형 변수 ch2가 숫자(‘0’~‘9’)일 때 true인 조건식
		char ch2 = '0';   
		ch2 = ( ('0'<=ch2) && (ch2<='9')) ? 'T' : 'F';
	    System.out.println("4번 : " + ch2);
	    
//		5. char형 변수 ch3가 영문자(대문자 또는 소문자)일 때 true인 조건식
	    char ch3 = 'a';   
	    ch3 = ( 'A' <= ch3 &&  ch3<='Z') || ( 'a'<=ch3 && ch3<='z') ? 'T' : 'F';
	    System.out.println("5번 : " + ch3);
	    
//		6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을 때 true인 조건식
	    int year = sc.nextInt();  
	    year = (year % 400 == 0 || (year%4==0 && year%100 !=0)) ?  1 : 0;
	    System.out.println("6번 : " + year);
	   
//		7. boolean형 변수 powerOn가 false일 때 true인 조건식 
	    boolean powerOn = false;   //true
	    powerOn = (powerOn == false) ? true : false;
	    System.out.println("7번 : " + powerOn);
	     
//	    8. 문자열 참조변수 str이 “yes”일 때 true인 조건식
	    String str = sc.next();
	    	    if(str.equals("yes")) {
	    	System.out.println("8번 : " + "true");
	    } else {
	    	System.out.println("8번 : " + "false");
	    }

	}

}
