package chapter09;

import static java.lang.Math.*;
import static java.lang.System.*;
public class Ex9_21 {

	public static void main(String[] args) {
		int i = Integer.MIN_VALUE;
		
		out.println("i ="+i);
		out.println("-i ="+(-i));
		
		try {
			out.printf("negateExact(%d) = %d%n ",   10, negateExact(10));
			out.printf("negateExact(%d) = %d%n ",   -10, negateExact(-10));
			//-i가 반대부호되어 i가 되면 정수 최대범위 넘어 오버플로어발생하여 아리스메틱예외발생하기 때문에
			//예외처리에서 long으로 형변화해야한다. 
			out.printf("negateExact(%d) = %d%n ",  -i, negateExact(-i));   
		} catch (ArithmeticException e) {
			out.printf("negateExact(%d) = %d%n ",   (long)i, negateExact((long)i));
		}
	}
}
	