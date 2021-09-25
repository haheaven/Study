package Chapter6;

public class Ex6_05 {

	public static void main(String[] args) {
		System.out.println("Card.width =" + Card.width);
		System.out.println("Card.height =" + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.num = 7;
		
		Card c2 = new Card();
		c2.kind = "Space";
		c2.num = 4;
		
		System.out.println("c1은 "+ c1.kind + "," + c1.num +
				"이며, 크기는(" + Card.width + ","+ Card.height+ ")");
		System.out.println("c2은 "+ c2.kind + "," + c2.num +
				"이며, 크기는(" + Card.width + ","+ Card.height+ ")");
		
	   System.out.println("c1의 크기를 각 50 , 80으로 변경합니다.");
	   c1.width = 50;
	  c1.height = 80;          // width와 height가 클래스 변수이기 때문에 c1으로 호출해도 
	                       //c2까지 변경되는 클래스 함수이므로 c1.호출보다 
	                      //Card.호출 하는 편이 더 좋다 . 
	  
	  System.out.println("c1은 "+ c1.kind + "," + c1.num +
				"이며, 크기는(" + Card.width + ","+ Card.height+ ")");
		System.out.println("c2은 "+ c2.kind + "," + c2.num +
				"이며, 크기는(" + Card.width + ","+ Card.height+ ")");
		
		
	  
	}

}
  class Card{
	  // 인스턴스 변수 
	  String kind;
	  int num;
	  // 클래스 변수 
	  static int width = 100;
	  static int height = 250;
  }