package chapter14;

import java.util.function.Function;


	//함수형 인터페이스 생성 	
	@FunctionalInterface
	interface lambda {
		public void method(String s1, String s2);
	}
	
	// 추상메서드 구현 
	 class lambdachild implements lambda{
		@Override
		public void method(String s1, String s2) {
			System.out.println(s1 + s2);
		}
	}
	
	public class Ex14_1 {
		public static void main(String[] args) {
	     
	 //람다 테스트
		lambda c = (s,v) -> System.out.print(s +v);
		
		String s1 = "Hello ";
		String s2 = "World";
		c.method(s1, s2);
		
	}
}

