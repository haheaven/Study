package chap7;
//2. 문제7-1의 SutdaDeck클래스에 다음에 정의된 새로운 메서드를 추가하고 테스트 하시오.
class SutdaDeck2 {
	final int CARD_NUM = 20;
	SutdaCard3[] cards = new SutdaCard3[CARD_NUM];

	SutdaDeck2() {
		// SutdaCard 초기화

	   for(int i=0; i<cards.length; i++) {
		  int num = i%10+1;
		  boolean isKwang = ((i<10) && (num==1 || num==3 ||num==8));  //만족할 때만 true 
		//  System.out.println(isKwang);
		  cards[i] = new SutdaCard3(num, isKwang);
	   }
	}
	
	// 1. shuffle
	public void shuffle() {
		for(int i=0; i<cards.length; i++) {
			int n = (int)(Math.random()*cards.length);
			
			SutdaCard3 tmp = cards[i];    //임시 객체 생성해서 자리 swap
			cards[i] = cards[n];
			cards[n] = tmp;           
			
		}
	}
	
	//2. pick
	SutdaCard3 pick(int index) {
		if(index < 0 || index >= CARD_NUM)
			return null;
		
		return cards[index];     // index로 지정된 객체 그대로 반환 
	}
	//3. pick
	SutdaCard3 pick() {	
		int n = (int)(Math.random()*cards.length);
		return cards[n];		 // 매개변수 없으면 랜덤 값 아무곳 반환 
	}	
}
class SutdaCard2 {
	int num;
	boolean isKwang;
	
	SutdaCard2(){
		this(1,true);
	}
	SutdaCard2(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	public String toString() {
		return num + ( isKwang ? "K" :"");
	}
}
public class ex02 {

	public static void main(String[] args) {
		SutdaDeck2 deck = new SutdaDeck2();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick()); 
		deck.shuffle();
		
		for(int i=0; i<deck.cards.length; i++) {
			System.out.print(deck.cards[i]+",");
		}
		System.out.println(); 
		System.out.println(deck.pick(0));	

	}
}



   // 오답 : 어떤 범위가 있는 상황에서 인수가 주어진다면 인수에 대한 유효성 검사를 먼저 하고 실행시켜야한다.