package chapter13;

import java.util.ArrayList;

public class ThreadEx25  {
	public static void main(String[] args) throws Exception {
		Table3 table = new Table3();
		
		new Thread(new Cook3(table), "COOK1").start();
		new Thread(new Customer3(table,"donut"),"CUST1" ).start();
		new Thread(new Customer3(table,"burger"), "CUST2" ).start();
		
		Thread.sleep(5000);    
		System.exit(0);  //프로그램 전체 종료 
	}
}
class Customer3 implements Runnable {              //손님 쓰레드 
	private Table3 table;
	private String food;
	
	Customer3(Table3 table, String food) {
		this.table = table;
		this.food = food;
	}
	public void run() {
		while(true) {
			try { Thread.sleep(100); } catch(InterruptedException e) {}
			String name = Thread.currentThread().getName();
			
			 table.remove(food);
				System.out.println(name + " ate a " +food);
		}
	}
}
class Cook3 implements Runnable {              //요리사쓰레드 
	private Table3 table;
	
	Cook3(Table3 table) { this.table = table; }
	
	public void run() {
		while(true) {
			//임의의 요리를 하나 선택해서 table 에 담기
			int idx = (int)(Math.random()*table.dishNum());
			table.add(table.dishNames[idx]);
			try { Thread.sleep(1000); } catch(InterruptedException e) { }
		}
	}
}  
class Table3 {                    //공유 테이블 
	String[] dishNames = { "donut", "donut", "burger" };
	final int MAX_FOOD = 6;
	
	private ArrayList<String> dishes = new ArrayList<>();  //요리를 ArrayList에 담
	
	public synchronized void add(String dish) {    
		while(dishes.size() >= MAX_FOOD)  { //테이블 위에 놓일 6개보다 많으면 리턴 
			String name = Thread.currentThread().getName();
		   System.out.println(name + "  waiting");
			try {
				wait();
				Thread.sleep(500);
			} catch(InterruptedException e) {}
		}
		dishes.add(dish);   //아니면 테이블에추가 
		notify();
		System.out.println("Dishes : " +dishes.toString());
	}
	public void remove(String dishName) {
		synchronized(this) {
			String name = Thread.currentThread().getName();
			while(dishes.size() ==0) {
				System.out.println(name + " is waiting");
				try {
					wait();
					Thread.sleep(500); 
					} catch(InterruptedException e) {}
			}
			while(true) {
				for(int i =0; i<dishes.size(); i++) {
					if(dishName.equals(dishes.get(i))) {
						dishes.remove(i);
						notify();
						return;
					}
				}
				try {
					System.out.println(name + "  waiting");
					wait();
					Thread.sleep(500);
				} catch(InterruptedException e) {}
			}	
		}	
	}
	public int dishNum() { return dishNames.length; }  
}

		
	      