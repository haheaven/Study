package chapter11;

import java.util.ArrayList;
import java.util.Collections;

public class Ex11_01 {

	private static int i;

	public static void main(String[] args) {
	//기본 길이(용량)가 10인 ArrayList 생성 
	  ArrayList list1 = new ArrayList(10);
	  list1.add(new Integer(5)); // = list.add(5) 객체만저장가능(autoboxing)
	  list1.add(new Integer(4));
	  list1.add(new Integer(2));
	  list1.add(new Integer(0));
	  list1.add(new Integer(1));
	  list1.add(new Integer(3));
	  
	  //ArrayLisct(Collection c)
	  ArrayList list2 = new ArrayList(list1.subList(1,4));
	  print(list1, list2);
	  
	  
	  
	  //Collections.sort() 
	  Collections.sort(list1);
	  Collections.sort(list2);
	  print(list1, list2);

	
	System.out.println("list1.containsAll(list2): " + list1.containsAll(list2));
	
	
	list2.add("B"); 
	list2.add("C");
	list2.add(3, "A");
	 print(list1, list2);
	
	list2.set(3, "AAA");
	 print(list1, list2);
	 
	//list2에서 list1 포함 객체 삭제
	 for(int i =0; i<list2.size()-1; i++) {
	   if(list1.contains(list2.get(i)))
	      list2.remove(i);
	 }
	 print(list1, list2);
	}
	
    static void print(ArrayList list1, ArrayList list2) {
    	System.out.println("list1 : " + list1);
    	System.out.println("list2 : " + list2);
    	System.out.println();
    }
}