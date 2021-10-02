package chap4;
//int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라. 
//만일 변수 num의 값이 12345라면, ‘1+2+3+4+5’의 결과인 15를 출력하라. 
//(1) 에 알맞은 코드를 넣으시오.
public class ex04_10 {

	public static void main(String[] args) {
		int num =23456;
		int sum=0;
		int n =0;
		
		//(1)
		//
		for(int i=10000; i>0; i=i/10){
			n = num/i;  //숫자를 각 자리의 해당 배수만큼 나눠 각 자리인 몫을 구함(n에 저장)
			num = num % i;  //숫자의 각 자라의 해당 배수만큼 나눠 나머지를 구함(다시 num에 저장->다음 자리의 몫을 구하기 위해)
	        sum = n+sum;  //각 자리인 몫만을 더함 
		}
		
		System.out.println("sum= "+sum);
		
		
		//숫자가 커질수록 i의 초기화 값이 커짐으로 효율적인 코드는 아니다.
		//sum += num%10;
		// num /= 10;
	
		
	}

}
