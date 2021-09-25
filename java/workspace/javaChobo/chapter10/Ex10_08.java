package chapter10;

import java.util.Calendar;

public class Ex10_08 {

	public static void main(String[] args) {
		String date1 = "201508";
		String date2 = "201405";
	
		
		//년과 월을 substring 으로 잘라서 정수로 변환 
	
	int month1 = Integer.parseInt(date1.substring(0,4))*12 +
			Integer.parseInt(date1.substring(4));
	System.out.println(month1);
	int month2 = Integer.parseInt(date2.substring(0,4))*12 +
			Integer.parseInt(date2.substring(4));
	System.out.println(month2);
	
	
	System.out.println(date1+"과 "+date2+"의 차이는 "+Math.abs(month2-month1)+ "개월 입니다.");
    }
	
}
