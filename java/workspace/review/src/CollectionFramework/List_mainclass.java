package CollectionFramework;

import java.util.Arrays;
import java.util.List;

public class List_mainclass {

	public static void method1() {
		
	}
	
    public static void method2() {
		
	}
	
    public static void method3() {
	  
    	List<String> list = Arrays.asList("둘리", "홍길동","또치");
    	for(String s : list) {
    		System.out.println(s);
    	}
}
	
	
	public static void main(String[] args) {
		method3();

	}

}
