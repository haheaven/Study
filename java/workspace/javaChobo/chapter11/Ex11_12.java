package chapter11;

import java.util.PriorityQueue;
import java.util.Queue;

public class Ex11_12 {
	
		
public static void main(String[] args) {
	Queue pq = new PriorityQueue();
	pq.offer(3);
	pq.offer(new Integer(1));
	pq.offer(5);
	pq.offer(2);
	pq.offer(4);
	System.out.println(pq);
	
	Object obj = null;
	
	while ((obj=pq.poll())!=null) 
      	System.out.println(obj);
    	}
    }
 