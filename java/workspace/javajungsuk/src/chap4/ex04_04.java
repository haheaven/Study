package chap4;

//[4-4] 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 
//몇까지 더해야 총합이 100이상이 되는지 구하시오.

public class ex04_04 {

	public static void main(String[] args) {
		int num =0;
		int sum=0;
	
		for(int n=1; n<=1000; n++) {
		 num = n%2==0 ? n * -1 : n; //n이 2로 나눠지면 -1곱해서 num에 저장 아니면 그냥 n을 num에 저장 
			sum += num;
			if(sum>=100) {
				break;
			}
	     
	}
		System.out.println(num);

 }
}
