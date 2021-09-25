package chapter03;

public class OperatorEx18 {
	public static void main(String[] args) {
		double pi = 3.13424;
		
		System.out.println(pi);
		System.out.println(pi*1000);
		System.out.println(Math.round(pi*1000));
		System.out.println(Math.round(pi*1000)/1000);
		System.out.println((double)Math.round(pi*1000)/1000.0);
		//double shortPi = Math.round(pi * 1000) / 1000.0;
	//	System.out.println(shortPi);
	}

}
