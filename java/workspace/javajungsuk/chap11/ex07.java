package chap11;
// 7.  다음에 제시된 BanNoAscending클래스를 완성하여, 
//ArrayList에 담긴 Student인 스턴스들이 반(ban)과 번호(no)로 오름차순 정렬되게 하시오.(반이 같은 경우 번호를 비 교해서 정렬한다.)
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student3  {
		String name;
		int ban;
		int no;
		int kor, eng, math;
	
		
		Student3(String name, int ban, int no, int kor, int eng, int math) {
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
	    
}

	     class BanNoAscending implements Comparator {
	    	 public int compare(Object o1, Object o2) {
	    		 if(o1 instanceof Student3 && o2 instanceof Student3) {
						Student3 s1 = (Student3)o1;
						Student3 s2 = (Student3)o2;
						int result = s1.ban - s2.ban;      // 반비교 
					if (result == 0) { // 반이 같을 경우 
						return s1.no - s2.no;  // 번호로리턴해서 
					} return result;
	    		 }
	    		 return -1;
	    	 }
	     }


		public class ex07 {
			public static void main(String[] args) {
				ArrayList list = new ArrayList();
				list.add(new Student3("홍길동",1,1,100,100,100)); 
				list.add(new Student3("남궁성",1,2,90,70,80)); 
				list.add(new Student3("김자바",1,3,80,80,90)); 
				list.add(new Student3("이자바",2,4,70,90,70)); 
				list.add(new Student3("안자바",2,5,60,100,80));
				
				Collections.sort(list, new BanNoAscending());       // -> 객체를 sort..(comparable을 구현한 student객체들이 name에 따라 정렬됨 
				Iterator it = list.iterator();
				
				while(it.hasNext()) 
					System.out.println(it.next());  
			}
		}

		
		
		
		
	// 오답정리	
	//

		
		
		
		
		
		
		
		
		
		
		
		
		
