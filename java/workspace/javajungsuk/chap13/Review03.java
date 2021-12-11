package chap13;
// p. 750
public class Review03 {
   public static void main(String[] args) {
	
	Thread12 th1 = new Thread12();
	Thread12_1 th2 = new Thread12_1();
	th1.start();
	th2.start();
	
	try {
		th1.sleep(1000);
	} catch (Exception e) {
		e.printStackTrace();
	}
	System.out.println("<main 종료>");
   }	
}

class Thread12 extends Thread{
	public void run() {
	for(int i=0; i<300; i++) 
		System.out.print("-");
	
	System.out.print("<th1 종료>");
  }
}

class Thread12_1 extends Thread{
	public void run() {
	for(int i=0; i<300; i++) {
		System.out.print("|");
	}
		System.out.print("<th2종료>");
  }
}

// th1 가 sleep이기 때문에 가장 늦게 종료되어야 한다고 생각함 
// 실제로는 main이 가장 늦게 종료됨 
// ---> sleep()이 항상 실행 중인 스레드에 작동하기 때문에 th1.sleep을 호출했어도 main에서 실행되므로 main이 sleep의 영향을 받는다. 