package chapter09;

import static java.lang.Math.*;
import static java.lang.System.*;
public class Ex9_20 {

	public static void main(String[] args) {
		double d = 90.7552;
		out.println("round("+d+")="+round(d));
		
		d *= 100;
		out.println("round("+d+")=" + round(d));
		
		out.println("round("+d+")/100=" + round(d)/100);
		out.println("round("+d+")/100.0=" + round(d)/100.0);
		out.println();
		
		out.printf("ceil(%3.1f)=%3.1f%n",   1.1, ceil(1.1));    //올림 
		out.printf("floor(%3.1f)=%3.1f%n",  1.5, floor(1.1));   //버림 
		out.printf("round(%3.1f)=%d%n",  1.1, round(1.1));   //반올림 
		out.printf("round(%3.1f)=%d%n",  1.5, round(1.5));   //반올림 
		out.printf("rint(%3.1f)=%f%n",   1.5, rint(1.5));   //반올림 
		out.printf("round(%3.1f)=%d%n", -1.5, round(-1.5));  //반올림 
		out.printf("rint(%3.1f)=%f%n",  -1.5, rint(-1.5));  //반올림 
		out.printf("ceil(%3.1f)=%f%n",  -1.5, ceil(-1.5));   //올림 
		out.printf("floor(%3.1f)=%f%n", -1.5, floor(-1.5));  //버림 
	}

}
