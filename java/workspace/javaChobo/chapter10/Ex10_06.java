package chapter10;

import java.util.Calendar;

public class Ex10_06 {

	public static void main(String[] args) {

if(args.length !=2) {
	  System.out.println("Usage : java CalendarEx6 2021 8");   
	    return;
	  } 
     int year = Integer.parseInt(args[0]);
     int month = Integer.parseInt(args[1]);
     int START_DAY_OF_WEEK =0;
     int END_DAY = 0;

      Calendar sDay = Calendar.getInstance();
      Calendar eDay = Calendar.getInstance(); 

       sDay.set(year, month-1, 1);   // 시작 달 
       eDay.set(year, month, 1);     // 다음 달 1일 
       
       eDay.add(Calendar.DATE, -1);  //다음달 1일에서 -1 해서 해당 달 말일 구하기 
       
       START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK); //1일의 요일 
       
       END_DAY = eDay.get(Calendar.DATE);
       
       System.out.println("      " + args[0] + "년 " + args[1] + "월");
       System.out.println(" 일  월  화  수  목 금 토");
       
       //해당 월의 1일이 어느 요일인지에 따라 앞에 공백이 발생 
       for ( int i=1; i<START_DAY_OF_WEEK; i++) {
    	   System.out.print("   ");
	}
       for(int i = 1, n=START_DAY_OF_WEEK; i<=END_DAY; i++,n++) {
    	   System.out.print((i<10)? "  " + i:" "+i);
    	   if(n%7==0) System.out.println();
          }
    }
}
