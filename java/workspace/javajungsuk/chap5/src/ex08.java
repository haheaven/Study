package chap5;

//다음은 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 ‘*’ 을 찍어서 그래프를 그리는 프로그램이다. 
//(1)~(2)에 알맞은 코드를 넣어서 완성하시오.
//   3 ***
//	 2 *
//   2 **
//   4 *****


public class ex08 {

	public static void main(String[] args) {
		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 }; 
		int[] counter = new int[4];
		
		for(int i=0; i < answer.length;i++) {
			// (1) 코드 넣기 
				if(answer[i]== answer[0]) {
					counter[0]++;        //1일 때, counter[0]에 1씩 증가 
				} else if (answer[i] == answer[7]) {
					counter[1]++;		 //2일 때, counter[1]에 1씩 증가 
				} else if (answer[i] == answer[3]) {
					counter[2]++;		 //3일 때, counter[2]에 1씩 증가 
				} else if (answer[i] == answer[2]) {
					counter[3]++;	     //4일 때, counter[3]에 1씩 증가 
				}
		}
		 
		for(int i=0; i < counter.length;i++) {	
			//(2) 알맞은 코드를 넣어 완성하시오.
	        	System.out.print(counter[i]+" ");  //counter[i] 값 출력 
				for(int j=0; j<counter[i]; j++) {
					System.out.print("*");		   //counter[i] 만큼 * 반복 
				}
				
			    System.out.println();
		}
	}

}
    //(1)번 
	// 숫자가 많아질수록 코드가 늘어나고 일일이 작성해야하기 때문에 적절하지 못함 
	// counter[answer[i]-1] ++ ;;
	// counter의 배열 길이와 answer의  각 요소의 값이 일치하다는 것을 파악했으면 생각해 볼 수 있는 문제였음 













