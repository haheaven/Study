package chap6;
// 8. 다음의 코드에 정의된 변수들을 종류별로 구분해서 적으시오.
public class ex08 {
  
	 public static void main(String[] args) {
		 PlayingCard card = new PlayingCard(1,1);
	}
 } 
		class PlayingCard {    
			 int kind;       //인스턴스변수 
			 int num;		 //인스턴스변수 
		
		
		static int width;   //클래스변수 
		static int height;  //클래스변수 
		
		PlayingCard(int k, int n) {   //int k, int n -> 지역변수 
			 kind = k;     
			 num = n;
		 }
		}
		
		
		// 오답 체크 
		//card, args -> 지역변수 
		//stack 영역 : 메서드의 작업에 필요한 메모리 공간 제공, 메서드 내에서 객체참조형으로 선언된 변수의 경우 지역변수로서 스택에 위치한다.
		//            참조변수는 메서드 내에 위치하며, 작업이 끝나면 사라지기 때문에 지역변수이다( 남는 건 참조(주)하고 있던 힙에 저장된 객체다. )
		
// MethodArea ---------------------
//	---------playingCard---------  |
//  static width, static height |  |
//----------------------------------

// Call Stack -------------------
//  ------main()-----
//	   card-----     |
//     | 0x100  |    |    -----> 1. call stack은 사용하면 메모리에서 사라짐 -> main을 통해서 참조변수 card의 실행이 끝나면 사라지고 
//     ---------
//-------------------------------
		
// Heap -------------------------
//	---0X100---
//	|   kind  |
//	-----------          ------> 2.card는 사라지더라도 참조하고 있던 0X100의 객체는 heap에 남아있음!
//  |  num    |		
//   ---------
		
		
		
		
		