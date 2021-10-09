package chap5;

import java.util.Scanner;

//12 예제5-23을 변경하여, 아래와 같은 결과가 나오도록 하시오.
// 전체 3중 2문제 맞췄습니다 나오는 코드 추가 
public class ex12 {

	public static void main(String[] args) {
	  String[][] words= {
			  {"chair","의자"},
			  {"computer","컴퓨터"},
			  {"integer","정수"}
	  };
	  
	  Scanner sc = new Scanner(System.in);
	  
	  int count=0; //맞춘 문제 카운트선언 
	  
	  for(int i=0; i<words.length; i++) {
		  System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);
		  
		  String tmp = sc.nextLine();
		  
		  if(tmp.equals(words[i][1])) {
			  System.out.printf("정답입니다. %n%n");
			  count++;   //맞추면 카운트 증가 
		  } else {
			  System.out.printf("틀렸습니다. 정답은 %s 입니다. %n%n", words[i][1]);
		  }
	  }
	  System.out.printf("전체 %d문제 중 %d문제 맞추셨습니다. ", words.length, count);
	}
}
