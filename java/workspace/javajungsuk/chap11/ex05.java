package chap11;
// 5. 다음에 제시된 Student클래스가 Comparable인터페이스를 구현하도록 변경해서 이름(name)이 기본 정렬기준이 되도록 하시오.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Student implements Comparable {
		String name;
		int ban;
		int no;
		int kor, eng, math;
	
		
		Student(String name, int ban, int no, int kor, int eng, int math) {
			this.name = name; this.ban = ban; this.no = no; 
			this.kor = kor; this.eng = eng; this.math = math;
		}
		
		int getTotal() {   return kor+eng+math; }
		
	     float getAverage() {    return (int)((getTotal()/ 3f)*10+0.5)/10f;   	}
		
	
	     public String toString() {
			 return name +","+ban +","+no +","+kor
					 +","+eng +","+math
					 +","+getTotal() +","+getAverage();

	 }
	     public int compareTo(Object o) {    // o는 비교할 객체 (객체의 비교는 불가능 때문에 comparable 이라는 인터페이스 통해 가능하게 함)
	    	 if( o instanceof Student3) {
	    		 Student3 tmp = (Student3)o;         // 매개변수로 받은 o객체는 Student 클래스의 임시객체로만든 tmp가 참조한다. 
	    		 return name.compareTo(tmp.name);	// 결과적으로 임시로 만든 객체의 name과 현재 객체의 name을 비교해서 사전순으로 정렬한다.  
	    	 }else {
	    		 return -1;
	    	 }
	     }
}
		public class ex05 {
			public static void main(String[] args) {
				ArrayList list = new ArrayList();
				list.add(new Student3("홍길동",1,1,100,100,100)); 
				list.add(new Student3("남궁성",1,2,90,70,80)); 
				list.add(new Student3("김자바",1,3,80,80,90)); 
				list.add(new Student3("이자바",1,4,70,90,70)); 
				list.add(new Student3("안자바",1,5,60,100,80));
				
				Collections.sort(list);       // -> 객체를 sort..(comparable을 구현한 student객체들이 name에 따라 정렬됨 
				Iterator it = list.iterator();
				
				while(it.hasNext()) 
					System.out.println(it.next());   // 담 객체 있을 때까지 출력하기
			}
		}
	
		
		
		
		
		
		
		
	// 오답정리	
	// Comparable 인터페이스  ( 자기 자신과 매개변수 객체를 비교)
		/*
		 *  java 객체의 정렬 가능하게 하는 인터페이스 (사용자가 정의한 정렬 기준에 맞출 수 있음 위 문제에서는 이름을 기준으로 ) 
		 	Integer, Double 은 오름차순정렬 // String 사전순 정렬 
		 	
		 	방법 : 정렬할 객체에 implements Comparable -> 구현하기 
		 		compareTo() 메서드를 통해(추상메서드이므로 상속받은 클래스에선 구현필수!) 
					현재 객체 < 파라미터로 넘어온 객체: 음수 리턴   -> 위 문제에선 tmp의name을 파라미터에서 넘어와 객체로 감 
					현재 객체 == 파라미터로 넘어온 객체: 0 리턴
					현재 객체 > 파라미터로 넘어온 객체: 양수 리턴
		 	
		   
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
