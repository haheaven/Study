package chapter14;

import java.util.function.Function;

public class Ex14_0 {

	public static void main(String[] args) {
	//	Function<String, Integer> f = (String s) -> Integer.parseInt(s);
	//	Function<String, Integer> f = 클래스이름 :: 메소드이름 
	//	Function<String, Integer> f = Integer::parseInt;
		
	//   System.out.println(f.apply("100")+200);
	//	Supplier<MyClass> s = () -> new MyClass();  //입력x, 반환o 
	//	Supplier<MyClass> s =MyClass :: new;
		Function<Integer, MyClass> f = (i) -> new MyClass(i);
	//	Function<Integer, MyClass> f = MyClass::new;       람다   
		MyClass mc = f.apply(100);
		System.out.println(mc.iv);
		
		System.out.println(f.apply(200).iv);
		
   //   Function<Integer, int[]> f2 = (i) -> new int[i];
        Function<Integer, int[]> f2 = int[]::new; 
        int[] arr = f2.apply(100);
        System.out.println("arr.length= "+ arr.length);
	  
	}
}

class MyClass{
	int iv;
	
	MyClass(int iv) {
		this.iv = iv;
	}
}

