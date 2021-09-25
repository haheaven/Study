package chapter14;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_3 {

	public static void main(String[] args) {
//      IntStream intstream=new Random().ints();  //무한스트림 
//		IntStream intstream=new Random().ints(5, 10); //무한스트림(범위지정)
//     intstream.limit(5).   //5개만 자르기 
//     forEach(System.out::println);  //출력하기 
     
		
	//iterator(T seed, UnaryOperator f) 단항 연산자 
      Stream<Integer> intstream = Stream.iterate(0,  n->n+2);
      intstream.limit(10).forEach(System.out::println);
      
      //generate(Supplier s) : 주기만 하는 것 입력 x, 출력 0
      Stream<Integer> intstream1 =Stream.generate(()->1);
      intstream1.limit(10).forEach(System.out::println);
	}

}

