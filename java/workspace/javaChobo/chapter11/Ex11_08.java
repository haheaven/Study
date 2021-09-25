package chapter11;

import java.util.*;

public class Ex11_08 extends Vector{
   public Object push(Object item) {
	   addElement(item);
	   return item;
   }
   public Object pop() {
   Object obj = peek();
    //만일 Stack 이 비어있으면 peek()메서드가 EmpthStackException을 발생 
    //마지막 요소 삭제, 배열의 index가 0부터 시작하므로 1을 빼줌 
     removeElementAt(size() -1);
       return obj;
   }
   public Object peek() {
	int len = size();
	
	if(len ==0)
		throw new EmptyStackException();
	//마지막요소 반환, 배열의 index가 0부터 시작하므로 1빼줌 
	return elementAt(len-1);
	}
   public boolean empty() {
	   return size() ==0;
   }
   public int search(Object o) {
	   int i = lastIndexOf(o);
	   
	   if(i>=0) {
		   return size() -i;
	   }
	   return -1;


      }
   }