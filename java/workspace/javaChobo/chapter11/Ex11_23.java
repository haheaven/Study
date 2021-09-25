package chapter11;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Ex11_23 {
	
		
public static void main(String[] args) {
 HashSet set = new HashSet();
 
 
 set.add("abc");
 set.add("abc");
set.add(new Person("David",10));
set.add(new Person("David",10));

 System.out.println(set);
}
}

class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
		
	}
	public String toString() {
		return name +":"+age;
	}
}