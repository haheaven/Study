package chap13;

public class Review04 {
	public static void main(String args[]) {
	   Runnable r = new Runnable21();
	   new Thread(r).start();
	   new Thread(r).start();
	   
	}
}

class Account {
	  private int balance = 1000;      // 잔고는 은행과 나만 알아야 하므로 private  

	public int getBalance() {
		return balance;
	}

	public  void withdraw(int money) {
		if(balance >= money) {                               
			try { Thread.sleep(1000);  } catch (Exception e) {  }
			balance -= money;
			}
	}
	
	public synchronized void withdraw2(int money) {
		if(balance >= money) {                               
			try { Thread.sleep(1000);  } catch (Exception e) {  }
			balance -= money;
		}
	}
	
}	  




 class Runnable21 implements Runnable{
	 Account acc = new Account();
	 
	 @Override
	public void run() {
		 while(acc.getBalance()>0) {
			 int money = (int)(Math.random() * 3+1)*100;
			 acc.withdraw(money);
			 System.out.println("balance : "+acc.getBalance());
		 }
	}
 }
 // 코드 19
//  synchronized 가 없다면 if문의 조건에 맞지 않게 음수 잔고가 출력된다 .
//  조건식에 맞아 조건식내부를 실행하려는 순간 다른 스레드에게 제어권이 넘어가 남은 금액보다 큰 금액을 출금하면서 음수가 발생한다. 
//  그렇기 때문에 여러 스레드가 있는 경우, 한 작업이 다른 작업에 의해 영향을 받지 않도록 하기 위해 synchronized(동기화) 가 필요하다. 
 
 
 
 
