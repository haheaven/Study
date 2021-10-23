package chap7;
// 19.다음은 물건을 구입하는 사람을 정의한 Buyer클래스이다. 
//이 클래스는 멤버변수 로 돈(money)과 장바구니(cart)를 가지고 있다. 
//제품을 구입하는 기능의 buy메서드와 장 바구니에 구입한 물건을 추가하는 add메서드,
//구입한 물건의 목록과 사용금액, 그리고 남 은 금액을 출력하는 summary메서드를 완성하시오.

import java.util.Arrays;

public class ex19 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv2());
		b.buy(new Computer());
		b.buy(new Tv2());
		b.buy(new Audio()); 
		b.buy(new Computer()); 
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();

	}
}

	class Buyer {
		int money = 1000;
		Product2[] cart = new Product2[3];
		int i =0;
		
		void buy(Product2 p) {
			//1-1
			if(p.price > money) {
				System.out.println("돈부족");
				return;
			} // 1-2
			else if(p.price <= money) {
				money -= p.price;
				// 1-3
				add(p);
			}
		}
		
		void add(Product2 p) {
			// 1-1
			if(i >= cart.length) {
				//1-1-1
				Product2[] cart2 = new Product2[cart.length*2];
				//1-1-2
				System.arraycopy(cart, 0, cart2, 0, cart.length);
				// 1-1-3
				cart = cart2;
			}
			// 1.2
			cart[i] = p;
			i++;
				
				
			}
	
	
		// 금액합계 위한 변수 
	    int sum = 0;
	    // item 출력 위한 변수 
		String str = "";
	
		void summary() {
			
		
			// 1-1
			for(int i=0; i<cart.length; i++) {
				// 유효성 검사...
				if(cart[i]==null) {
					break;  }
					
				str += cart[i].toString() + ", ";
				sum += cart[i].price;
			}
			System.out.println("구입한 물건 : " + str);
			System.out.println("총금액: "+sum);
			System.out.println("남은금액: "+money);
			
		}
	}
	
	// 오답 풀이 
	// - summary()에서 유효성 검사하기 
	// - 배열 복사 메소드기억하기..System.arraycopy(기존, 기존의시작인덱스, 새배열, 새배열시작인덱스, 길이);
	
	class Product2{
		int price;
		
		Product2(int price){
			this.price = price;
		}
	}
	class Tv2 extends Product2{
		Tv2() { super(100); }
		
		public String toString() {return "Tv2"; }
	}
	
	class Computer extends Product2{
		Computer() { super(200); }
		
		public String toString() {return "Computer"; }
	}
	class Audio extends Product2{
		Audio() { super(50); }
		
		public String toString() {return "Audio"; }
	}
	
	
	