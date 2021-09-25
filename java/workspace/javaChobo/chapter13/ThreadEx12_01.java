package chapter13;

import java.util.Iterator;
import java.util.Map;

public class ThreadEx12_01  {
		public static void main(String[] args) throws Exception {
		  ThreadEx12_3 th1 = new ThreadEx12_3();
		  ThreadEx12_4 th2 = new ThreadEx12_4();
		  th1.start();
		  th2.start();
		
		  delay(2*1000);
		  
		  System.out.print("main종료 ");
		}
		//delay 메소드를 만들어서 호출해서 만드는방법도있다. 
		static void delay(long millis) {
			  try {
				  Thread.sleep(2*1000);
			   } catch(InterruptedException e) {}
		}
	}
	class ThreadEx12_3 extends Thread {
	     public void run() {
	    	 for(int i = 0; i<300; i++) 
	    		 System.out.print("-");
	    	 System.out.print("th3 종료 ");
		}
	}
	class ThreadEx12_4 extends Thread {
		 public void run() {
	    	 for(int i = 0; i<300; i++) 
	    		 System.out.print("|");
	    	 System.out.print("th4 종료 ");
		
		}
	}
 
