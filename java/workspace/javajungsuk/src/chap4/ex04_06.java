package chap4;

//두 개의 주사위를 던졌을 때, 
//눈의 합이 6이 되는 모든 경우의 수를 출력하는 프 로그램을 작성하시오.
public class ex04_06 {

	public static void main(String[] args) {
		int x = 0;   //주사위1
		int y = 0;   //주사위2
	 
	    for(x=1; x<=6; x++) {
			for(y=1; y<6; y++) {
				if(x+y==6) {
					System.out.println("x : "+ x +", y :" + y);
				}
			}
		
	    }
	
 }
}