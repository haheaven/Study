package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set_MaicClass {
	
public static void method2() {
	
  Set<String> hobbies = new HashSet<String>(Arrays.asList("낚시","등산","포스팅"));
  
  for(String s : hobbies) {
	  System.out.println(s);
  }
  
}

public static void method3() {
	
	//로또 6개; add는 한번만!
	Set<Integer> lotto = new HashSet<Integer>();
     
	while(true) {
	lotto.add((int)(Math.random()*45)+1);
	if (lotto.size()==6) {
		break;
	}
	}System.out.println(lotto);
	
	
	while(lotto.size()<6) {
		lotto.add((int)(Math.random()*45)+1);
	}
	System.out.println(lotto);
	
	List<Integer> list = new ArrayList<Integer>(lotto);
	Collections.sort(list);
	System.out.println(list);
}



public static void main(String[] args) {
	method3();
 }
}
