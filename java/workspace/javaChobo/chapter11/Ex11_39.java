package chapter11;

import java.util.ArrayList;
import java.util.*;
import static java.util.Collections.*; // static 으로 Collections 생략가능하게 함 

public class Ex11_39 {
	
public static void main(String[] args) {
	List list = new ArrayList();
	System.out.println(list);
	
	addAll(list, 1,2,3,4,5); //Collections의 메서드지만 static으로 생략가능 원래는 Collections.addAll
	System.out.println(list);
	
	rotate(list,2);         // 반시계 방향으로 2번 회전 
	System.out.println(list);
	
	swap(list, 2,0);   //인덱스가 2와 0인걸 바꿈 
	System.out.println(list);
	
	shuffle(list);
	System.out.println(list);
	
	sort(list, reverseOrder());
	System.out.println(list);
	
	sort(list);
	System.out.println(list);
	
	int idx = binarySearch(list, 3);
	System.out.println("index of 3  : "+idx);
	
	System.out.println("max= "+max(list));
	System.out.println("min= "+min(list));
	System.out.println("min= "+max(list, reverseOrder()));
	
	fill(list, 9); //list를 9로 채움 
	System.out.println(list);
	
	//list오ㅏ 크기가 같은 list를 생성하고 2로 채움 , 단 결과는 변경불가
	List newList = nCopies(list.size(),2);
	System.out.println("newList : "+ newList);
	
	System.out.println(disjoint(list, newList)); //공통요소없으면 true
	
	copy(list, newList);
	System.out.println("newList : " +newList);
	System.out.println("list : " + list);
	
	replaceAll(list, 2, 1);
	System.out.println("list : "+list);
	
	Enumeration e = enumeration(list);
	ArrayList list2 = list(e);
	
	System.out.println("list2 : " + list2);

	}
}