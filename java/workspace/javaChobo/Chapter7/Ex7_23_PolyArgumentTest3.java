package Chapter7;

import java.util.Vector;

public class Ex7_23_PolyArgumentTest3 {

	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		Tv2 tv = new Tv2();
		Computer2 com = new Computer2();
		Audio2 a = new Audio2();
		
		b.buy(tv);
		b.buy(com);
		b.buy(a);
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();	
	}
}      
class Product2 {
	 int price;
	 int bonus;
	 
	 Product2(int price) {
		 this.price = price;
		 bonus = (int)(price/10.0);
	 }
	 Product2 (){
		 price = 0;
		 bonus = 0;
	 }
}

class Tv2 extends Product2{
	Tv2(){
		super(100);
	}
	public String toString() { return "Tv2"; }
}
class Computer2 extends Product2{
	Computer2(){
		super(200);
	}
     public String toString() { return "Computer2"; }
}
class Audio2 extends Product2{
		Audio2(){
			super(50);
		}
		public String toString() { return "Audio2"; }
}


class Buyer2 {
	int money = 1000;
	int bonus = 0;
	Vector item = new Vector();
	
	void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("잔액부족함");
			return;
		}
		money -= p.price;
		bonus += bonus;
		item.add(p);
		System.out.println(p + "를 구입함");
	}
    void refund(Product2 p) {
    	if(item.remove(p)) {
    		money += p.price;
    		bonus -= p.bonus;
    		System.out.println(p + "를 환불함");
    	}else {
    		System.out.println("반품할 상품이 구입한 상품이 아닙니다.");
    	
    	}
    }
    void summary() {
    	int sum = 0;
    	String itemList = " ";
    	if(item.isEmpty()) {
    		System.out.println("구입한 제품이 없습니다.");
    	return;
    		}
    	
    	//구매 총구입, 구입한 물건 출력 
    	for(int i = 0; i<item.size(); i++) {
    		Product2 p = (Product2)item.get(i);
    		sum += p.price;
    		itemList += (i==0) ? "" +p : ", " + p;
    		
    	}
    	System.out.printf("구입한 총 금액은 %d입니다.%n", sum);
        System.out.printf("구입한 제품은 %s입니다.%n", itemList);
    }
}