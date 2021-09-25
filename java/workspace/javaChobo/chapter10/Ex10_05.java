package chapter10;

import java.util.Calendar;

public class Ex10_05 {

	public static void main(String[] args) {
		  Calendar date = Calendar.getInstance();
		  
		  date.set(2021, 7, 31); //2021년 8월 31일 
		 System.out.println(toString(date));
		 date.roll(Calendar.MONTH, 1);         //일 필드가 말일 일 때 roll메서드를 이용해서 월 필드를 변경하면 일 필드에 영향줌 
		 System.out.println(toString(date));
		 
		}
		public static String toString(Calendar date) {
			return date.get(Calendar.YEAR) +"년 " + (date.get(Calendar.MONDAY)+1) + "월 " + date.get(Calendar.DATE) + "일";
		}
	}