package chap13;

public class Review00 {

	public static void main(String[] args) {
			Thread0 th = new Thread0();
			
			Runnable r = new Thread0_1();
			Thread th2 = new Thread(r);
			
			th.start();
			th2.start();
	
	}

}
// 클래스 상속 
class Thread0 extends Thread {
	public void run() {
		for(int i=0; i<300; i++) { System.out.println(getName());   // 조상 스레드 겟네임 호출 
	}
  }
}

// 인터페이스 구현 
class Thread0_1 implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<300; i++) {
			// Thread.currentThread() ---- 현재 실행중인 스레드 반환 
			System.out.println(Thread.currentThread());
		}
		
	}
}