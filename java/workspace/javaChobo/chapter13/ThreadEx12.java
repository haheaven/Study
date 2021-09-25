package chapter13;

import java.util.Iterator;
import java.util.Map;

public class ThreadEx12  {
		public static void main(String[] args) throws Exception {
		  ThreadEx12_1 th1 = new ThreadEx12_1();
		  ThreadEx12_2 th2 = new ThreadEx12_2();
		  th1.start();
		  th2.start();
		  
		  try {
			  //main쓰레드 안에 있으므로 main이 5초 멈추게됨 .
			//  th1.sleep(5*1000);
			  //main을 멈추게 하고 싶으면 
			  Thread.sleep(2*1000);
		   } catch(InterruptedException e) {}
		  
		  System.out.print("main종료 ");
		}
	}
	class ThreadEx12_1 extends Thread {
	     public void run() {
	    	 for(int i = 0; i<300; i++) 
	    		 System.out.print("-");
	    	 System.out.print("th1 종료 ");
		}
	}
	class ThreadEx12_2 extends Thread {
		 public void run() {
	    	 for(int i = 0; i<300; i++) 
	    		 System.out.print("-");
	    	 System.out.print("th2 종료 ");
		
		}
	}
 
