package chap7;
//섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck클래스)을 정의한 것이다. 
//섯다카드 20장을 담는 SutdaCard배열을 초기화하시오. 단, 섯다카드는 1부터 10까지의 숫자 가 적힌 카드가 한 쌍씩 있고, 
//숫자가 1, 3, 8인 경우에는 둘 중의 한 장은 광(Kwang)이 어야 한다. 
//즉, SutdaCard의 인스턴스변수 isKwang의 값이 true이어야 한다.


class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard2[] cards = new SutdaCard2[CARD_NUM];

	SutdaDeck() {
		// SutdaCard 초기화

	   for(int i=0; i<cards.length; i++) {
		  int num = i%10+1;
		  boolean isKwang = ((i<10) && (num==1 || num==3 ||num==8));  //만족할 때만 true 
		//  System.out.println(isKwang);
		  cards[i] = new SutdaCard2(num, isKwang);
	   }
	}
	
	
	
}
class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard(){
		this(1,true);
	}
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	public String toString() {
		return num + ( isKwang ? "K" :"");
	}
}
public class ex01 {

	public static void main(String[] args) {
		SutdaDeck2 deck = new SutdaDeck2();
		
		for(int i=0; i<deck.cards.length; i++) {
			System.out.print(deck.cards[i]+",");
		}

	}

}
    // 오답 
    // -SutdaDeck[]cards는 배열 선언만 한것인지 실 내용은 null 20개 이기 때문에 
    // 생성자를 통해 실제 객체를 만들어 넣어야한다. 
    // 기본 SutdaCard의 객체를 만들어야 하기 때문에 SutdaCard에 있는 iv num과 isKwang을 만들어야한다.
    // 숫자가 1~10 2번 반복하기 때문에 i%10+1로 
    // num이 1,3,8 일 때 true이기 때문에 그에 맞는 식을 넣어야한다.
    // i가 한번씩 돌아갈 때마다 card[i] = new SutdaCard(num, isKwang)을 통해 객체를 새로 생성한다!
 



   
