package chap13;
// p.733
public class Review02 {
	static long startTime = 0;           // startTime 공통필드 
	
	public static void main(String args[]) {
		
		ThreadEx5 th1 = new ThreadEx5();
		th1.start();
		startTime = System.currentTimeMillis();
		
		for(int i=0; i<300; i++) {
			System.out.printf("%s", new String("-"));
		}
		System.out.print("소요시간1 : " + (System.currentTimeMillis()-Review02.startTime));
		
		
	}

}

class ThreadEx5 extends Thread {     // ThreadEx5는 Thread 상속 
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.printf("%s", new String("|"));
		}
		System.out.print("소요시간2 : " + (System.currentTimeMillis()-Review02.startTime));
  }
}
// 메인 이외로 실행할 수 있는 (Thread)ThreaEx5를 주어 실행함 
// main 쓰레드와 ThreadEx5 쓰레드가  작업전환을 하며 일정한 순서없이 작업을 실행한다. 
