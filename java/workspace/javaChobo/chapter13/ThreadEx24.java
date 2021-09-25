package chapter13;

import java.util.ArrayList;

public class ThreadEx24  {
	public static void main(String[] args) throws Exception {
		Table2 table = new Table2();
		
		new Thread(new Cook2(table), "COOK1").start();
		new Thread(new Customer2(table,"donut"),"CUST1" ).start();
		new Thread(new Customer2(table,"burger"), "CUST2" ).start();
		
		Thread.sleep(5000);    
		System.exit(0);  //프로그램 전체 종료 
	}
}
class Customer2 implements Runnable {              //손님 쓰레드 
	private Table2 table;
	private String food;
	
	Customer2(Table2 table, String food) {
		this.table = table;
		this.food = food;
	}
	public void run() {
		while(true) {
			try { Thread.sleep(10); } catch(InterruptedException e) {}
			String name = Thread.currentThread().getName();
			
			if(eatFood())
				System.out.println(name + " ate a " +food);
			else 
				System.out.println(name + " failed to eat. : (");
		}
	}
	boolean eatFood() { return table.remove(food); }
}
class Cook2 implements Runnable {              //요리사쓰레드 
	private Table2 table;
	
	Cook2(Table2 table) { this.table = table; }
	
	public void run() {
		while(true) {
			//임의의 요리를 하나 선택해서 table 에 담기
			int idx = (int)(Math.random()*table.dishNum());
			table.add(table.dishNames[idx]);
			try { Thread.sleep(1000); } catch(InterruptedException e) { }
		}
	}
}  
class Table2 {                    //공유 테이블 
	String[] dishNames = { "donut", "donut", "burger" };
	final int MAX_FOOD = 6;
	
	private ArrayList<String> dishes = new ArrayList<>();  //요리를 ArrayList에 담
	
	public synchronized void add(String dish) {    
		if(dishes.size() >= MAX_FOOD)     //테이블 위에 놓일 6개보다 많으면 리턴 
			return ;
		dishes.add(dish);                //아니면 테이블에추가 
		System.out.println("Dishes : " +dishes.toString());
	}
	public boolean remove(String dishName) {
		synchronized(this) {
			while(dishes.size() ==0) {
				String name = Thread.currentThread().getName();
				System.out.println(name + " is waiting");
				try { Thread.sleep(500); } catch(InterruptedException e) {}
			}
			
		for(int i =0; i<dishes.size(); i++)      //테이블에 있는 요리수만큼 제거 
		 if(dishName.equals(dishes.get(i))) {
			dishes.remove(i);
			return true;
	    	}
		}
		return false;	
	}
	public int dishNum() { return dishNames.length; }  
}

		
	      