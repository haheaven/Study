package chap6_1;
// 기본형 매개변수 예제: ex6_9(p264)

class Data { int x;  }

public class Review01 {	
	public static void main(String[] args) {
 // 1)	
	Data d = new Data();		// d객체 주소 임의 : 0x100 내부에 x 존재 
	d.x = 10;					// x = 10
	System.out.println("main() : x = "+d.x);   // 10
// 2)-1
	change(d.x);  
	
// 3)
    System.out.println("After change(d.x)");
	System.out.println("main() : x = "+d.x);   // 10   => 객체의 x를 바꾼게 아니라 change 매서드 내부의 지역변수 x를 1000으로 바꾼것이므로 
	                						   //  			객체속의 x에는 영향 없으며 그대로 10 출력 

  }
  
// 2)-2
  static void change(int x) {    // change(기본형매개변수)
	  x=1000;					// x = 1000
	  System.out.println("change() : x = "+ x);  // 1000    => 출력 후 스택에서 사라짐 
  }
  
}



  /* 기본형 매개변수 
  매개변수의 타입이 기본형
  변수의 값을 읽기만 할 수 있다. 


 */

