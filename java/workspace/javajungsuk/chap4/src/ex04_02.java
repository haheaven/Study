package chap4;
// [4-2] 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
public class ex04_02 {

	public static void main(String[] args) {
		 int n;
		 int sum=0;
		 for(n=1; n<=20; n++) {
			 if(n%2==0 || n%3==0) {    //2의 배수이거나 3의 배수이면 건너뛴다.
				 continue;
			 }
			 sum = sum+n;
		 }
		 System.out.println(sum);

	}

}
