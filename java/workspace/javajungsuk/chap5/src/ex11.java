package chap5;
//11.주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서 배열 의 행과 열의 마지막 요소에 
//각 열과 행의 총합을 저장하고 출력하는 프로그램이다. 

public class ex11 {

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
		
				//code
				result[i][j]=score[i][j];   //기존 score배열은 그대로 복사 
				if(j==2) {                  //j==2가 되면 배열을 하나 증가시킴 
					int n = j+1;            //늘린배열을n에 저장 
				for(int k=0; k < score[i].length;k++)  // 각 행의 값들을 더해서 늘린 곳에 저장 
					result[i][n] += score[i][j];	
				} 
			} //end of j 
			
				if(i==4) {					//i==4일때 배열 하나 증가 
				  int n = i+1;  			// 증가값 n에 저장 
				for(int j=0; j<score[i].length+1; j++) {  
				 for(int k=0; k<score.length;k++) 
					result[n][j] += result[k][j];    //증가된 곳에 각 열의 값 더해서 저장 	
			}
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
	 	result[i][j] = score[i][j];   있는 값은 그대로 복사 
	 	
	 	int x = score.legnth;    --> x = 5
	  	int y = score[i].length;  --> y = 3
	  	
	  	result[i][y] += score[i][j];
	  	result[x][j] += score[j][i];
	  	
	 */




