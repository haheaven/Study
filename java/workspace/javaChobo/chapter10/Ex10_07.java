package chapter10;

import java.util.Calendar;

public class Ex10_07 {

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
       eDay.set(year, month, sDay.getActualMaximum(Calendar.DATE));  
       
       
       sDay.add(Calendar.DATE, -sDay.get(Calendar.DAY_OF_WEEK)+1);
       eDay.add(Calendar.DATE, -eDay.get(Calendar.DAY_OF_WEEK));
       
      
       System.out.println("      " + args[0] + "년 " + args[1] + "월");
       System.out.println(" 일  월  화  수  목 금 토");
       
       //시작 일부터 마지막일까지 (sDay <= eDay) 1일씩 증가하면서 일(Calendar.DATE)을 출력
      for(int n=1; sDay.before(eDay) ||sDay.equals(eDay); sDay.add(Calendar.DATE, 1)) {
    	  int day = sDay.get(Calendar.DATE);
    	   System.out.print((day<10)? "  " + day:" "+day);
    	   if(n++%7==0) System.out.println();
          }
    }
}
