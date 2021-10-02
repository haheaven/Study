package chap4;
//숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코 드를 완성하라.
//만일 문자열이 "12345"라면, 
//‘1+2+3+4+5’의 결과인 15를 출력이 출력되 어야 한다. 
//(1)에 알맞은 코드를 넣으시오.

public class ex04_09 {

	public static void main(String[] args) {
	
		String str = "12345";
		int sum=0;
	
		
		for(int i=0; i<str.length(); i++) {
			// (1)
		   int n = str.charAt(i)-48;  // char형 '1'은 49이므로 48을 빼야
			sum = sum+n;
		}
		System.out.println("sum : "+ sum);
	}

	

}
