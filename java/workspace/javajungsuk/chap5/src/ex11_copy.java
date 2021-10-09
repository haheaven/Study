package chap5;
//11.주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서 배열 의 행과 열의 마지막 요소에 
//각 열과 행의 총합을 저장하고 출력하는 프로그램이다. 

public class ex11_copy {

	public static void main(String[] args) {
		int[][] score = {
				{100, 100, 100}, 
				{20, 20, 20} , 
				{30, 30, 30} , 
				{40, 40, 40},
				{50, 50, 50}
				}; 
		int[][] result = new int[score.length+1][score[0].length+1];
		                //score.length=5
		for(int i=0; i < score.length;i++) { 
							//score[i].length=3
			for(int j=0; j < score[i].length;j++) {		
				result[i][j] = score[i][j];  // 있는 값은 그대로 복사 
				
				result[i][score[0].length] += result[i][j];     
				//i=0~4, score[0].length=3 // result[i][j] i=0,1,2,3,4일때, j값에만 변화하며 더함,
				
				result[score.length][j] += result[i][j];       
				//score.length=5 j=0일때,  result[0][0]+result[1][0]+result[2][0]+result[3][0]+result[4][0]
				
				result[score.length][score[0].length] += result[i][j];   
				// result[5][3] -> result 모든 값을 더한 값 
		}		
	} //end of i
		
		for(int i=0; i < result.length;i++) {
			for(int j=0; j < result[i].length;j++)
			   System.out.printf("%4d",result[i][j]);
					
			System.out.println();
		}
	}
}
	//답 
	//5-9과 비슷한 문제 
	/*  
	    score[5][3] 0~4/0~2    result[6][4]  0~5/0~3
	 	
	  	
	 */




