package chap8;

public class oop_04 {

	public static void main(String[] args) {
		
		  // 두 정육면체 객체 생성
	    Cube a = new Cube(3);
	    Cube b = new Cube(5);
	    
	    // 두 정육면체의 부피와 겉넓이 출력
	    System.out.printf("정육면체 a의 부피: %d, 겉넓이: %d\n", a.volume(), a.surfaceArea());
	    System.out.printf("정육면체 b의 부피: %d, 겉넓이: %d\n", b.volume(), b.surfaceArea());
	  }
	}

	class Cube {
	  // 필드
	  int length; // 한 변의 길이

	  // 생성자
	  public Cube(int i) {
	    /* 1. 생성자를 완성하세요. */
		  super();       // 첫줄에는 생성자 삽입(개발자가 안하면 컴파일러알아서추가함)
		  length = i;    // 매개변수 i를 length에 대입 
		  
		  
	  }
	  
	  // 메소드(인스턴스 메소드) - 정육면체의 부피 반환
	  public int volume() {
	    /* 2. 부피를 반환하세요. */
	    return length*length*length;
	  }

	  // 메소드(인스턴스 메소드) - 정육면체의 겉넓이 반환
	  public int surfaceArea() {
	    /* 3. 생성자를 완성하세요. */
		  
	    return length*length*6;
	  }
	}