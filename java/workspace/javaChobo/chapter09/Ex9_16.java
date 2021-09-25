package chapter09;

public class Ex9_16 {

	public static void main(String[] args) {
		int i = 100;
		//숫자를 문자열로 변경할 때
	    String str1 = i +"";                //방법 1
	    String str2 = String.valueOf(i);    //방법 2
	    
	    double d = 200.0;
	    String str3 = d + "";           //방법1
	    String str4 = String.valueOf(d);    //방법2
	    
	    
	    //문자열을 숫자로 변경할 때 방법1
	    double sum1 = Integer.parseInt(str2) + Double.parseDouble(str4);
	    //문자열을 숫자로 변경할 때 방법2
	   double sum2 = Integer.valueOf(str2) + Double.valueOf(str4);
	   //String join() 사용
	    System.out.println(String.join("*", str2, "+" , str4, "=")+sum1);
	    
	    System.out.println("parse이용 : " + sum1);
	    System.out.println("valueOf이용 : " + sum2);

	}

}
