package chap6;
// 2. 문제6-1에서 정의한 SutdaCard클래스에 두 개의 생성자와 
//info()를 추가해서 실행 결과와 같은 결과를 얻도록 하시오.
public class ex02 {
	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false); 
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}
}
	class SutdaCard {
	int num;
	boolean isKwang;
	
	public SutdaCard() {
		this(1,true);  // 기본 생성자 
	}
	
	public SutdaCard(int num, boolean isKwang) {
		super();
		this.num = num;
		this.isKwang = isKwang;   //인수가 있는 생성자일때 설정한 초기화 
	}
	
	public String info() {
		return num + ( isKwang==false ? "" : "k");
	}
	
	
}


