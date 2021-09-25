package chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex11_02 {

	private static int i;

	public static void main(String[] args) {
	//기본 길이(용량)가 10인 ArrayList 생성 
	final int LIMIT = 10;   //자르고자하는 글자 갯
	String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
	int length = source.length();
	
	List list = new ArrayList(length/LIMIT +10);
	
	for(int i=0; i<length; i+=LIMIT) {
		if(i+LIMIT < length)
			list.add(source.substring(i, i+LIMIT));
		else 
			list.add(source.substring(i));
				
	}
	for(int i =0; i<list.size(); i++)
		System.out.println(list.get(i));
	}
}