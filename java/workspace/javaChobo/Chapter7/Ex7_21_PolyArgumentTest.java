package Chapter7;

public class Ex7_21_PolyArgumentTest {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Computer());
		b.buy(new Tv());
		
		System.out.println("현재 남은 돈 : " + b.money);
		System.out.println("현재 적립 보너스 : " + b.bonus);
	}
}
    class Product {
    	 int price;
    	 int bonus;
    	 
    	 Product(int price) {
    		 this.price = price;
    		 bonus = (int)(price/10.0);
    	 }
    }
    class Tv extends Product{
    	Tv(){
    		super(100);
    	}
    	public String toString() { return "Tv"; }
    }
    class Computer extends Product{
    	Computer(){
    		super(200);
    	}
    	public String toString() { return "Computer"; }
    }
    class Buyer {
    	int money = 1000;
    	int bonus = 0;
    	
    	void buy(Product p ) {
    		if (money < p.price) {
    			System.out.println("잔액부족");
    			return;
    		}
    		money = money - p.price;
    		bonus = bonus + p.bonus;
    		System.out.println(p +"을 구매함");
    	}
    }
