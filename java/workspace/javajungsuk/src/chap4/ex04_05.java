package chap4;
//다음의 for문을 while문으로 변경하시오.

public class ex04_05 {

	public static void main(String[] args) {
		//for
//		for(int i=0; i<=10; i++) {
//			for(int j=0; j<=i; j++) 
//		    System.out.print("*");
//		System.out.println();
//		}
		
		int n = 0;
		while(n<=10) {
			int m = 0;
			while(m<=n) {
				System.out.print("x");
			  m++;
			} System.out.println(); 
			n++;
		}
		
		
		//*****오답 이유 
		//변수 m을 전역변수에 선언함 
		// 전역변수 사용시 m++;이 할 때마다 증가되기 때문에 m은 0으로 돌아가지 않고
		//0,1,2,3..이 되어 m<=n에서 값 1개만 나와 x 한 개만 찍힌다.
		//그렇기 때문에 안쪽에 배치를 시켜 계속 0으로 초기화되어 n이 증가할 때마다 m의 값도 늘어나게끔 만들어야 한다. 
		 
			
		
		
	}

}
