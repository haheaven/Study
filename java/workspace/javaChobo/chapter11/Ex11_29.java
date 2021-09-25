package chapter11;

import java.util.TreeSet;

public class Ex11_29 {
	
public static void main(String[] args) {
	TreeSet set = new TreeSet();
	int[] score = { 80, 84, 90 , 78,30, 40, 33 ,100};
	
	for(int i=0; i<score.length; i++)
		set.add(new Integer(score[i]));
		
		System.out.println("50보다 작은 값 :" +set.headSet(new Integer(50)));
		System.out.println("50보다 작은 값 :" +set.tailSet(new Integer(50)));
		
	
	}
}