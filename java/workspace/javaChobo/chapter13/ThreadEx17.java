package chapter13;


public class ThreadEx17  {
		public static void main(String[] args) throws Exception {
		  MyThread th1 = new MyThread("*");
		  MyThread th2 = new MyThread( "**");
		  MyThread th3 = new MyThread( "***");
		  th1.start();
		  th2.start();
		  th3.start();
		  
		  try {
			  Thread.sleep(2000);
			  th1.suspend();
			  Thread.sleep(2000);
			  th2.suspend();
			  Thread.sleep(3000);
			  th1.resume();
			  Thread.sleep(3000);
			  th1.stop();
			  th2.stop();
			  Thread.sleep(2000);
			  th3.stop();
		  } catch(InterruptedException e) {}
		  
		}
	}

	class MyThread implements Runnable {
		boolean suspended = false;
		boolean stopped = false;
		
		Thread th; 
		
		MyThread(String name) {
			th = new Thread(this, name); //Thread(Runnable r, String name)
		}
		 void start() { th.start();    }
		
		 public void suspend() { suspended = true; }
	     public void stop() { stopped = true; }
	     public void resume() { suspended = false; }
	     
	     
	     public void run() {
	    	while(!stopped) {
	    		if(!suspended) {
	    			System.out.println(Thread.currentThread().getName());
	    			try {
	    				Thread.sleep(2000);
	    			} catch(InterruptedException e) {}
	    		}
	    	} System.out.println(Thread.currentThread().getName());
	  }
	    
	}
	     
	
	
	