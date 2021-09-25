package chapter10;

import java.util.Calendar;

public class Ex10_02 {

	public static void main(String[] args) {
		//요일은 1부터 시작하기 때문에, DAY_OF_WEEK[0]은 비움 
		final String[] DAY_OF_WEEK = { "","일","월", "화", "수", "목", "금","토"};
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		//month의 경우 0부터 시작하기 때문에 8월인 경우, 7로 지정 
		//date.set(2015, Calendar.August, 15) 형식으로도 지정 가능 
		date1.set(2015,7,15);
		System.out.println("date1은 " + 
		   toString(date1)+DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일이고");
		System.out.println("date2(오늘)은 " +  toString(date2)+
				DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]+ "요일이다."); 
		
		//두 날짜간의 차이를 얻으려면, getTimeInMillies() 천분의 일초 단위로 변환 
		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis())/1000;
		
		System.out.println("그날(date1)부터 지금(date2)까지 "+ difference+ "초가 지났습니다.");
		System.out.println("일로 계산하면 " + difference/(24*60*60) +"일 입니다. ");
		}
		
		public static String toString(Calendar date) {
			return date.get(Calendar.YEAR)+"년 "+(date.get(Calendar.MONTH)+1) +"월 " 
					+ date.get(Calendar.DATE) + "일 ";
		}
		
		
		}


