package Chapter6;

public class Ex6_01 {

	public static void main(String[] args) {
	   Tv t  = new Tv();
	   t.channel = 7;
	   t.channelDown();
	   System.out.println("현재 채널은"+t.channel + "입니다,");
	}
}
	   
	   
	   class Tv{
		   //Tv의 속성 (변수, 필드)
		   String color;
		   boolean power;
		   int channel;
		   // Tv의 기능 (메소드)
		  void power() {
			  power = !power;
		  }
		  void channelDown() {
			  --channel;
		  }
		  void channelUp() {
			  ++channel;
		  }
		  
	 }  

	

