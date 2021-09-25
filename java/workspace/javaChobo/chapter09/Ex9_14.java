package chapter09;

import java.util.StringJoiner;

public class Ex9_14 {

	public static void main(String[] args) {
	    String animals = "dog,cat,bear";
	    String[] arr = animals.split(",");    // animals 문자열을 , 기준으로 arr 배열에 담는다.
	    
	    System.out.println(String.join("-", arr)); //arr배열을 -를 통해 문자열로 변경 
	    
	    StringJoiner sj = new StringJoiner("/", "[","]");
	    for (String s : arr)
	    	sj.add(s);
	    
	    System.out.println(sj.toString());
	    
	}

}
