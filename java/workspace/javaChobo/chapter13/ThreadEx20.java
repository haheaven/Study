package chapter13;

public class ThreadEx20  {
	
		public static void main(String[] args) {
		  ThreadEx20_1 gc = new ThreadEx20_1();
		  gc.setDaemon(true);
		  gc.start();
		  
		  int requiredMemory = 0;
	     
		  for(int i = 0; i< 20; i++) {
	    	   requiredMemory = (int)(Math.random() *10) * 20;
	    	   
	    //필요한메모리가 사용할 수 있는양보다 크거나 전체 메모리의 60%이상을 
	    //사용할 경우 gc를 깨운다 
	       if(gc.freeMemory() < requiredMemory ||
	          gc.freeMemory() < gc.totalMemory()* 0.4) {
	        	  gc.interrupt();
	        	  try {
	        		  gc.join(100);
	        	  } catch(InterruptedException e) {}
	          }
	          gc.usedMemory += requiredMemory;
	          System.out.println("usedMemory : " + gc.usedMemory);
		  }
		}
}

	class ThreadEx20_1 extends Thread {
		final static int MAX_MEMORY = 1000;
		int usedMemory = 0;
	     public void run() {
	       while(true) {
	    	   try {
	    		   Thread.sleep(10*1000);
	    	   } catch (InterruptedException e) {
	    		   System.out.println("Awaken bt interrupt()");
	    	   }
	    	   gc(); //Garbage Collection 수행 
	    	   System.out.println("Garbage Collected. Free Memory : " + freeMemory());
	    	   
	       }
	}
   public void gc() {
	   usedMemory -= 30;
	   if(usedMemory < 0) usedMemory = 0;
   } public int totalMemory() { return MAX_MEMORY;  }
      public int freeMemory() { return MAX_MEMORY - usedMemory ; }
	}
	
	