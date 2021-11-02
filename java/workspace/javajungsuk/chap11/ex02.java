package chap11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

// 02.  다음 코드의 실행결과를 적으시오
public class ex02 {
	public static void main(String[] args)  {
		
	
	ArrayList list = new ArrayList();
    list.add(3);
	list.add(6);
	list.add(2);
	list.add(2);
	list.add(2);
	list.add(7);  // list 객체  3 / 6 / 2 / 2 / 2 / 7 /
	
	HashSet set = new HashSet(list);   //hash는 중복불가 3 / 6 / 2 / 7  -> 순서는 다름 
	TreeSet tset = new TreeSet(set);  // Tree는 오름차순 + 중복 불가  2 / 3 / 6 / 7 
	Stack stack = new Stack();
	stack.addAll(tset);  // stack에 2 3 6 7 저장 
	
	while(!stack.empty()) {
		System.out.println(stack.pop());  // pop() 은 마지막요소부터 꺼냄 ( push() 처음)
		
	}
	// 즉 7 6 3 2
	
	
	// Set은 중복, 순서가 없는 특징을 가졌다.
	// 보통 arraylist로 중복있는 객체들을 형성하게 되면 
	// set을 통해 정리를 해준다. 
	// stack은 LIFO -> 마지막에 들어온것이 가장 먼저 나감 
}
	
}
