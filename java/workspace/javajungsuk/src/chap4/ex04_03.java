package chap4;
// [4-3] 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
public class ex04_03 {

	public static void main(String[] args) {
		int n;
		int n_sum=0;
		int sum_total =0;
		for(n=1; n<=10; n++) {
			n_sum += n;    //n의 합들 
			sum_total += n_sum;  //n의 합들인 sum의 합들 
		}
		System.out.println(sum_total);

	}

}
