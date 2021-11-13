package chap11;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Student2 implements Comparable {
		String name;
		int ban;
		int no;
		int kor, eng, math;
	
		
		Student2(String name, int ban, int no, int kor, int eng, int math) {
			this.name = name; this.ban = ban; this.no = no; 
			this.kor = kor; this.eng = eng; this.math = math;
		}
		
		int getTotal() {   return kor+eng+math; }
		float getAverage() {   
			return (int)((getTotal()/ 3f)*10+0.5)/10f;   	
		}
	
	     public String toString() {
			 return name +","+ban +","+no +","+kor
					 +","+eng +","+math
					 +","+getTotal() +","+getAverage();
	 }
	     
	     public int compareTo(Object o) {    // o는 비교할 객체 (객체의 비교는 불가능 때문에 comparable 이라는 인터페이스 통해 가능하게 함)
	    	 if( o instanceof Student2) {
	    		 Student2 tmp = (Student2)o;         // 매개변수로 받은 o객체는 Student 클래스의 임시객체로만든 tmp가 참조한다. 
	    		 return name.compareTo(tmp.name);	// 결과적으로 임시로 만든 객체의 name과 현재 객체의 name을 비교해서 사전순으로 정렬한다.  
	    	 }else {
	    		 return -1;
	    	 }
	     }
}
		public class ex06 {
				static int getGroupCount(TreeSet tset, int from, int to) {
					Student2 s1 = new Student2("",0,0,from,from,from); 
					Student2 s2 = new Student2("",0,0,to,to,to);
					return tset.subSet(s1,s2).size();
					}
					
					
					
				
					public static void main(String[] args) {
						TreeSet set = new TreeSet(new Comparator() {
						public int compare(Object o1, Object o2) {
							if(o1 instanceof Student2 && o2 instanceof Student2) {
								Student2 s1 = (Student2)o1;
								Student2 s2 = (Student2)o2;
								return (int)(s1.getAverage() - s2.getAverage());
				
							}
							return -1;				 
						}
						});
				set.add(new Student2("홍길동",1,1,100,100,100)); 
				set.add(new Student2("남궁성",1,2,90,70,80)); 
				set.add(new Student2("김자바",1,3,80,80,90)); 
				set.add(new Student2("이자바",1,4,70,90,70)); 
				set.add(new Student2("안자바",1,5,60,100,80));
				
				Iterator it = set.iterator();
				while(it.hasNext()) System.out.println(it.next());
				
				System.out.println("[60~69] :"+getGroupCount(set,60,70)); 
				System.out.println("[70~79] :"+getGroupCount(set,70,80)); 
				System.out.println("[80~89] :"+getGroupCount(set,80,90)); 
				System.out.println("[90~100] :"+getGroupCount(set,90,101));
			}
		}
	
		
		
		
		
		
		
		
	// 오답정리	
	// 
		/*
		 *  
		 	
		   
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
