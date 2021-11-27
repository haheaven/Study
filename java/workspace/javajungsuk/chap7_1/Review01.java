package chap7_1;
// ex7-3 :  상속 - 포함관계 

public class Review01 {	
	public static void main(String[] args) {
	  Deck d = new Deck();
	  Card c = d.pick(0);     //cardArr[0]  => c = new Card(4,1) => 예제로 그린 그림에선  c == 0x10 
	  System.out.println(c);
	  
	  d.shuffle();            // 카드섞기 
	  c = d.pick(0);
	  System.out.println(c);		
	}
}

class Deck{
	final int CARD_NUM = 52;               // 카드 수 
	Card cardArr[] = new Card[CARD_NUM];   // 카드 객체 배열 
	
	Deck() {
		int i = 0;
		
		for(int k=Card.KIND_MAX; k>0; k--)      //  kind_max = 4      // 여기서 kind.max 나 num_max 등은 static이기 때문에 그냥 호출 가능 
			for(int n=0; n<Card.NUM_MAX; n++)   //  num_max = 13
			cardArr[i++] = new Card(k, n+1);   // cardArr[0] = new Card(4,1)   cardArr[1] = new Card(4, 2) ..... 
	}   //Deck객체를 생성할때 
	
	
	Card pick(int index) {                  // 지정된 위치가 있을 때 
		return cardArr[index];
	}
	
    Card pick() {                           // 카드를 그냥 선택했을 때는 랜덤이다. 
	   int index = (int)(Math.random()*CARD_NUM);   // index는 0 ~~~ 52 
	   return pick(index);
   }
    
   void shuffle() {                          // 카드 순서 섞을 때 
	   for(int i=0; i<cardArr.length; i++) {
		   int r = (int)(Math.random()*CARD_NUM);
	    
		   Card temp = cardArr[i];
		   cardArr[i] = cardArr[r];
		   cardArr[r] = temp;
	 }
   }
}

class Card{
	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;
	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	int kind;
	int number;
	
	Card(){
		this(SPADE, 1);
	}
	Card(int kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		String[] kinds = {"", "CLOVER","HEART","DIAMOND","SPADE"};
		String numbers = "0123456789XJQK";
		return "kind : " + kinds[this.kind] +", number : "+numbers.charAt(this.number);
				
		}
	}
	
/*
 *     한 클래스의 멤버변수로 다른 클래스 타입의 참조변수를 선언한다. 
 *     ~를 가지고 있다. 
 *     
 *     Deck클래스에서는 Card클래스를 가지고 있다. 
 *     
 */

