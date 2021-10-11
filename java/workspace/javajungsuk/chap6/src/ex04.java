package chap6;
// 4. 문제6-3에서 정의한 Student클래스에 
//다음과 같이 정의된 두 개의 메서드 getTotal()과 getAverage()를 추가하시오.
public class ex04 {

	public static void main(String[] args) {
		Student s = new Student(); 
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100; s.eng = 60; s.math = 76;
		System.out.println("이름:"+s.name); 
		System.out.println("총점:"+s.getTotal()); 
		System.out.println("평균:"+s.getAverage());
	//	System.out.printf("평균:%.1f",s.getAverage());
	}
}
		
		class Student {
		 String name;
		 int ban;
		 int no;
		 int kor;  int eng;  int math;
		 
		 public int getTotal() {
			 return kor+eng+math;
			 
		 }
		 public  float getAverage() {
			 return (float)getTotal()/3;
		 }
	  }
		
		//  (int)(getTotal() / 3f * 10 + 0.5f) / 10f;

	