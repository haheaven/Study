package chap4;
//다음은 회문수를 구하는 프로그램이다. 회문수(palindrome)란, 
//숫자를 거꾸로 읽어도 앞으로 읽는 것과 같은 수를 말한다. 
//예를 들면 ‘12321’이나 ‘13531’같은 수를 말한 다. 
//(1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
public class ex04_15 {

	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;
		int result =0; // 변수 number를 거꾸로 변환해서 담을 변수 
	
		while(tmp !=0) {
			for(int j =10000; j>0; j/=10) {
			 int n = tmp%10;  //일의자리 숫자
			 tmp = tmp/10;    //일의자리 숫자뺀 몫 
			 result += n*j;   //나오는 일의자리 숫자에서 *10000 + *1000 + *100 + *10 + * 1 필   
			
			}	
		}
		
		
		if(number == result)
			System.out.println( number + "는 회문수 입니다.");
		else
			System.out.println( number + "는 회문수가 아닙니다.");
	}

}
