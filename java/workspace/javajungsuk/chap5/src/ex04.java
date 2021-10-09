package chap5;
// 4. 2차원 배열 arr에 담긴 모든 값의 총합과 평균 구하기 
public class ex04 {

	public static void main(String[] args) {
		int[][] arr = {
				{ 5, 5, 5, 5, 5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
				};
		int total = 0; 
		float average = 0;
		
		//코드넣기
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				total += arr[i][j];
				
			}
			average = (float)total/arr.length/arr[i].length;
		}
		
		
	System.out.println("total="+total);
	System.out.println("average="+average);

	}

}
