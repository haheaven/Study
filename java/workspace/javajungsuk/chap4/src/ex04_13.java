package chap4;

//다음은 주어진 문자열(value)이 숫자인지를 판별하는 프로그램이다. 
//(1)에 알맞 은 코드를 넣어서 프로그램을 완성하시오.
public class ex04_13 {

	public static void main(String[] args) {
		String value = "113333"; 
		char ch = ' ';
		boolean isNumber = true;
		int n =0;
		for(int i=0; i < value.length() ;i++) {
			ch = value.charAt(i);
			  if('0' > ch || ch > '9') 
				  isNumber= false;  
		     }
		
	
		if (isNumber) {
			System.out.println(value+"는 숫자입니다.");
			} else {
				System.out.println(value+"는 숫자가 아닙니다.");
			}
	}

}
