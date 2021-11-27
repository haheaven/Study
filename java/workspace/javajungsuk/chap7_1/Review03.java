package chap7_1;

// p. 368 => 7-21
// public class 는 클래스당 1개만이며 파일명과 일치해야한다. 
// -> 가독성의 이유 , 클래스 중첩으로 인한 오류 방지 위해 
// public class를 파일로 나누면서 import형식으로사용 --> 파일명으로 어떤 역할하는지 짐작가능 
class Product {
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
}

class Tv extends Product {
	Tv() {
		super(100);   // 조상클래스 Product(int price) 
	}
	public String toString() { return "tv"; }
}


class Computer extends Product {
	Computer() {
		super(200);   // 조상클래스 Product(int price) 
	}
	public String toString() { return "Computer"; }
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
		    return;
		}
	money -= p.price;
	bonusPoint += p.bonusPoint;
	System.out.println(p + "을/를을 구매하셨습니다.");
   }
}

public class Review03 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		
		System.out.println("현재 남은 돈 : " +b.money);
		System.out.println("현재 보너스 점수 : " +b.bonusPoint);	
	}

}
/*
  	1. 다형성 
  	여러 가지 형태를 가질 수 있는 능력 
  	조상 클래스 타입의 참조변수로 자손클래스의 인스턴스를 참조할 수 있도록 함 
   ** 참조변수가 사용할 수 있는 멤버의 수는 인스턴스의 멤버 수보다 같거나 적어야 한다. 
      ( 조상인스턴스는 자손인스턴스의 수보다 항상 적거나 같다(자손이 조상인스턴스를 확장함) 
 */
