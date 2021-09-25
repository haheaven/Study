package chapter10;

import java.time.LocalDate;
import java.time.LocalTime;

public class TimeTest {

	public static void main(String[] args) {
	   LocalDate today = LocalDate.now();
	   LocalTime now = LocalTime.now();
	   
	   LocalDate birthDate = LocalDate.of(1999, 12, 31);
	   LocalTime birthTime = LocalTime.of(23, 59,58);
	   
	   System.out.println("today : " + today);
	   System.out.println("now : " + now);
	   System.out.println("birthDate : " + birthDate);
	   System.out.println("birthTime : " + birthTime);
	   
	   //bithDate의 년 바꾸기 withYear()
	   System.out.println("birthDate : " + birthDate.withYear(2021));
	   
	   

	}

}
