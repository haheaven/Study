package chap5;
// 주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램을 완성하시오.
public class ex09 {

	public static void main(String[] args) {
		char[][] star = { 
							{'*','*',' ',' ',' '},
							{'*','*',' ',' ',' '},							
							{'*','*','*','*','*'}, 
							{'*','*','*','*','*'}
					};
		char[][] result = new char[star[0].length][star.length];
		
		for(int i=0; i < star.length;i++) { 
			for(int j=0; j < star[i].length;j++) {
				 System.out.print(star[i][j]);
			}
			 System.out.println();
		}   
		System.out.println();
		//star.length=4;       //
		for(int i=0; i < star.length;i++) { 
			//star[i].length=5;
			for(int j=0; j < star[i].length;j++) {
			
				//(1) 알맞은 코드를 넣어 완성하시오.
				for(int k=0; k<star.length; k++)
			//result[5][4] 만들기위해 k 만듦 
		     result[j][k] = star[(star.length-1)-k][j];			
			}		
		}
			for(int i=0; i < result.length;i++) {
				for(int j=0; j < result[i].length;j++) {
					System.out.print(result[i][j]);	
				} 
			System.out.println();
			}	
	}
}
	//답 		
	//int x = j;    //j의 값은 0~4
	//int y=star.length-1-i;   // star.length-1-i   0~3
	//result[x][y] = star[i][j]
	//복잡하게 생각하지 않고 변수를 새롭게 정해 배열의 길이를 정했으면 되는 문제였음 










