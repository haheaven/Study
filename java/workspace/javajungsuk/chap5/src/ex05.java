package chap5;

import java.util.Arrays;

//5. 1~9 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램
// 알맞는 코드를 넣어 완성하기 
public class ex05 {

	public static void main(String[] args) {
	
	int[] ballArr = {1,2,3,4,5,6,7,8,9}; 
	int[] ball3 = new int[3];
	
	// 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다. 
	for(int i=0; i< ballArr.length;i++) {
		int j = (int)(Math.random() * ballArr.length); 
		int tmp = 0;
	 
	//1.코드넣기
	  tmp = ballArr[i];
	  ballArr[i] = ballArr[j];
	  ballArr[j] = tmp;
	}
	 // 확인을 위한 코드 
	for(int i=0; i<ballArr.length; i++)
	System.out.print(ballArr[i] + ",");
    System.out.println();
  
	//2.코드넣기
	ball3 = Arrays.copyOfRange(ballArr, 0, 3);   //Arrays.copyOfRange(복사할 배열, 첫 인덱스, 마지막인덱스) 마지막인덱스는 포함 안함 

	for(int i=0;i<ball3.length;i++) {
		System.out.print(ball3[i]);
	}
  }
}
