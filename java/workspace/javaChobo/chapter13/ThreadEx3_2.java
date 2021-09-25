package chapter13;

public class ThreadEx3_2 {
	static long startTime = 0;


	public static void main(String[] args) {
		ThreadEx4_1 th1 = new ThreadEx4_1();
		ThreadEx4_2 th2= new ThreadEx4_2();
		th1.start();
		th2.start();
		startTime = System.currentTimeMillis();
	
		try {
			th1.join();  //main쓰레드가 th1의 작업이 끝날 때까지 기다림 
			th2.join();  //main쓰레드가 th2의 작업이 끝날 때까지 기다림 
		}catch(InterruptedException e) {}
		
		 System.out.print("소요시간 : "+(System.currentTimeMillis() - startTime));
	}
}
		
 class ThreadEx4_1 extends Thread {
	 public void run() {
		 for(int i =0; i< 100; i++) {
			 System.out.print("-");
			 
		 }
	 }
 }
 class ThreadEx4_2 extends Thread {
	 public void run() {
		 for(int i =0; i< 100; i++) 
			 System.out.print("|");
		 }
	 }
 