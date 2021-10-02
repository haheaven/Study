package chap4;

//구구단의 일부분을 다음과 같이 출력하시오.

public class ex04_12 {

	public static void main(String[] args) {
		
		
		for(int n=1; n<=3; n++) {
			for(int dan=2; dan<=4; dan++) {
				System.out.print(dan +"*"+n+"="+ dan*n+"\t");
			} System.out.println();
		}
		System.out.println();
		for(int n=1; n<=3; n++) {
			for(int dan=5; dan<=7; dan++) {
				System.out.print(dan +"*"+n+"="+ dan*n+"\t");
			} System.out.println();
		}
		System.out.println();
		for(int n=1; n<=3; n++) {
			for(int dan=8; dan<=9; dan++) {
				System.out.print(dan +"*"+n+"="+ dan*n+"\t");
			} System.out.println();
		}
		System.out.println();
		
		//적은 답은 효율적이지 못한 코드
		//답 
		for(int k=2; k<=9; k+=3) {
			for(int n=1; n<=3; n++) {  //곱하는 수 
				for(int dan=k; dan<=k+2&&dan<10; dan++) { //k가 8일 때 10단이 가능하므로 10단이 출력되지 못하게 &&dan<10을 추가 
					System.out.print(dan +"*"+n+"="+ dan*n+"\t");
			} System.out.println(); //곱하는 수의 줄바꿈 
		} System.out.println();  //2단 5단 8단에서의 줄바꿈
		}
	}

}
