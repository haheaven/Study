package chapter10;

import java.util.Calendar;

public class Ex10_04 {

	public static void main(String[] args) {
	  Calendar date = Calendar.getInstance();
	  date.set(2021, 7,4);  //2021년 8월 4일 
	
	  // date.add()  다른 필드에 영향을 주며 날짜 바뀜 
	 System.out.println("===기준날짜===");
	 System.out.println(toString(date));
	 System.out.println("===1일 후===");
	 date.add(Calendar.DATE, 1);
	 System.out.println(toString(date));
	 System.out.println("===1달 후===");
	 date.add(Calendar.MONTH, 1);
	 System.out.println(toString(date));
	 System.out.println("===1년 전===");
	 date.add(Calendar.YEAR, -1);
	 System.out.println(toString(date));
	 
	 System.out.println();
	 // date.roll() 다른 필드에 영향 주지 않으며 해당날짜만 바뀜 
	 System.out.println("===rolㅣ()===");
	 date.roll(Calendar.MONTH, 4);
	 System.out.println(toString(date));
	 System.out.println("===rolㅣ()===");
	 date.roll(Calendar.DATE, 31);
	 System.out.println(toString(date));

	 
	 System.out.println();
	 //Calendar 모든 필드 초기화 
	 System.out.println("===clear()===");
	 date.clear();
	 System.out.println(toString(date));
	}
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) +"년 " + (date.get(Calendar.MONDAY)+1) + "월 " + date.get(Calendar.DATE) + "일";
	}
}
