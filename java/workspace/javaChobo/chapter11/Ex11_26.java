package chapter11;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex11_26 {
	
		
public static void main(String[] args) {
Set set = new TreeSet(); //  범위 검색 , 정렬, 정렬 필요없음 
 //Set set = new HashSet();  //정렬해야함 
  for(int i =0; set.size()<6; i++) {
	  int num = (int)(Math.random()*45)+1;
	  set.add(num);
  }
	 System.out.println(set);
	
	}
}