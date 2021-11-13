package chap11;
// 8. 문제11-7의 Student클래스에 총점(total)과 전교등수(schoolRank)를 저장하기 위한 인스턴스변수를 추가하였다. 
// Student클래스의 기본정렬을 이름(name)이 아닌 총점 (total)을 기준으로 한 내림차순으로 변경한 다음, 
// 총점을 기준으로 각 학생의 전교등수 를 계산하고 전교등수를 기준으로 오름차순 정렬하여 출력하시오..
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Student5 implements Comparable {
		String name;
		int ban;
		int no;
		int kor, eng, math;
		
		int total;
		int schoolRank;
		int classRank;
	
		
		Student5(String name, int ban, int no, int kor, int eng, int math) {
			this.name = name; this.ban = ban; this.no = no; 
			this.kor = kor; this.eng = eng; this.math = math;
			total = kor+ eng+math;
		}
		
		int getTotal() {   return total; }
		
	     float getAverage() {    return (int)((getTotal()/ 3f)*10+0.5)/10f;   	}
		
	
	     public String toString() {
			 return name +","+ban +","+no +","+kor
					 +","+eng +","+math
					 +","+getTotal() +","+getAverage() + ","+schoolRank+","+classRank;

	 }
	     public int compareTo(Object o) {    // o는 비교할 객체 (객체의 비교는 불가능 때문에 comparable 이라는 인터페이스 통해 가능하게 함)
	    	 if( o instanceof Student5) {
	    		 Student5 tmp = (Student5)o;         // 매개변수로 받은 o객체는 Student 클래스의 임시객체로만든 tmp가 참조한다. 
	    		 return tmp.total-this.total;	// 결과적으로 임시로 만든 객체의 total과 기존totla 비교해서 반환 
	    	 }else {
	    		 return -1;
	    	 }
	     }
	     
	     class ClassTotalComparator implements Comparator{
	    	 public int compare(Object o1, Object o2) {
	    		 Student5 s1 = (Student5)o1;
	    		 Student5 s2 = (Student5)o2;
	    		 int result = s1.ban - s2.ban;  // 반 
	    		 
	    		 if(result ==0) {
	    			 result = s2.total - s1.total;    // 총점 
	    		 } return result;	 
	    	 }
	     }
}
		public class ex09 {
			public static void calculateClassRank(List list) {
				Collections.sort(list); // 먼저 list를 총점기준 내림차순으로 정렬한다.
				int prevBan = -1; // 이전 반  
				int prevRank = -1; // 이전 등수  
				int prevTotal = -1; // 이전 총점 
				int length = list.size();
			
		// 1. 반복문을 이용해서 저장된 Student객체를 하나씩 읽음 
				for( int i = 0, n=0; i<length; i++, n++) {
					Student5 s = (Student5)list.get(i);
				// 반이 달라지면 이전 등수와 이전 총점을 초기화 
				if(s.ban!=prevBan) {   
					prevRank = -1;
					prevTotal = -1;
					n=0;
				} 
				if(s.total==prevTotal)	{  // 총점이 같으면 이전등수를 등수로 
					s.classRank = prevRank;
				} else {
					s.classRank = n+1;
				}
		
				prevBan = s.ban;
				prevRank = s.schoolRank;      
				prevTotal = s.total;
				}
	}
			
			
			public static void calculateSchoolRank(List list) {
				Collections.sort(list); // 먼저 list를 총점기준 내림차순으로 정렬한다.
				int prevRank = -1; // 이전 전교등수 
				int prevTotal = -1; // 이전 총점 
				int length = list.size();
			
		// 1. 반복문을 이용해서 저장된 Student객체를 하나씩 읽음 
				for( int i = 0;  i<length; i++) {
					Student5 s = (Student5)list.get(i);
				// 현재 객체 총점이 이전 객체의 총점과 같다면 이전등수를 현재 등수로 대입 
				if(s.total == prevTotal) {   
					s.schoolRank = prevRank;  // 첫번째 객체의 등수는 -1 
				} else {  // 총점이 다르면 변경하기 
					s.schoolRank = i+1;       // 첫번째 객체 등수 1
				}
				// 비교해서 이전등수에 저장 
				prevRank = s.schoolRank;      // 첫번째 객체 등수(1)과 총점을 prev에 저장 ..
				prevTotal = s.total;
				}
			}
			
			
			
			
			
			
			public static void main(String[] args) {
				ArrayList list = new ArrayList();
				list.add(new Student5("홍길동",1,3,100,100,100)); 
				list.add(new Student5("남궁성",1,2,90,70,80)); 
				list.add(new Student5("김자바",1,1,80,80,90)); 
				list.add(new Student5("이자바",2,1,70,90,70)); 
				list.add(new Student5("안자바",2,1,60,100,80));
				
				calculateSchoolRank(list);
				calculateClassRank(list);
			
				Iterator it = list.iterator();
				
				while(it.hasNext()) 
					System.out.println(it.next());   // 담 객체 있을 때까지 출력하기
			}
		}
	
		

		
		
		
		
		
		
		
		
		
		
		
		
