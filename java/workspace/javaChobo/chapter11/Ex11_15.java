package chapter11;

import java.util.*;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Ex11_15 {
	
		
public static void main(String[] args) {
  ArrayList original = new ArrayList(10);
  ArrayList copy1 = new ArrayList(10);
  ArrayList copy2 = new ArrayList(10);
  
  for(int i =0; i<10; i++) 
	  original.add(i+"");
  
  Iterator it = original.iterator();
  
  while(it.hasNext()) {
	  copy1.add(it.next());
	  
	  System.out.println("==Original에서 copy1으로 복사(copy) =");
	  System.out.println("original: " + original);
	  System.out.println("copy :" + copy1);
	  System.out.println();
	  
	  it = original.iterator();
	  
	  while(it.hasNext()) {
		  copy2.add(it.next());
		  it.remove();
	  }
	  System.out.println("==Original에서 copy2으로 복사(copy) =");
	  System.out.println("original: " + original);
	  System.out.println("copy :" + copy2);
  }
  
  
}

}