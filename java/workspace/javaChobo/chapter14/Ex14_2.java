package chapter14;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_2 {

	public static void main(String[] args) {
//		List<Integer> list = Arrays.asList(1,2,3,4);
//		Stream<Integer> intStream = list.stream();  //list를 Stream으로 변경 
//		intStream.forEach(System.out::print);  //forEach()최종연산 
//		
//		//stream은 1회용, stream에 대해 최종연산을 수행하면 stream을 생성 
//		intStream = list.stream();
//		intStream.forEach(System.out::print);
	
//		String[] strArr = new String[] {"a","b","c"};
//		Stream<String> strStream = Stream.of(strArr);
//		//위 두줄 코드 합치면 Stream<String> strStream = Stream.of( new String[] {"a","b","c"});
//		strStream.forEach(System.out::println);
//		
		
		
	 int[] intArr = {1,2,3,4};
	 IntStream intstream = Arrays.stream(intArr);
//	 intstream.forEach(System.out::println);
	 System.out.println("count="+intstream.sum());
	}

}

