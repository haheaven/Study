package chapter13;

import javax.swing.JOptionPane;

public class ThreadEx14  {
		public static void main(String[] args) throws Exception {
		  ThreadEx14_1 th1 = new ThreadEx14_1();
		  th1.start();
		 // System.out.println("isInterrupted(): " + th1.isInterrupted());
		  String input = JOptionPane.showInputDialog("아무값이나 입력하세요.");
		  System.out.println("입력하신 값은" + input + "입니다.");
		  th1.interrupt();
		 // System.out.println("isInterrupted(): " + th1.isInterrupted());
		//  System.out.println("interrupted(): " + Thread.interrupted());
		}
	}
	class ThreadEx14_1 extends Thread {
	     public void run() {
	    	
	    	 int i = 100000;
	    	 while ( i!=0 && !isInterrupted()) {
	    		 System.out.println(i--);
	    	for(long x=0; x<250000000L; x++);
		}
	    	 System.out.println("isInterrupted(): " + isInterrupted());
	    	 System.out.println("interrupted(): " + interrupted());
	    	 //static boolean interrupted()는 한번 호출되고 다음 호출시 초기화되어 false 
	    	 System.out.println("interrupted(): " + interrupted());
	     System.out.println("카운트다운종료");
	  }
	}
	
	