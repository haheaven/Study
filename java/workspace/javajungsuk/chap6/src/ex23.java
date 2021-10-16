package chap6;
//23. 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
public class ex23 {
  public static int max(int[] arr) {
	  int num = -99999;
	   if (arr==null || arr.length == 0 ) {    // 유효성 검사는 보통 앞에서 먼저 체크 !!
		   return num;
	   }
	   // if ( arr.length == 0 || arr==null)순서로 체크하면 nullpointexception 발생 
	     //  --> 두번째 실행인 max(null)이 if 조건의 첫번째 순서로 arr.length을 먼저 확인하기 때문에 예외발생하게 됨!!!!!!!
	   
	   int max_num = arr[0];   //비교 위해 arr[0]을 max_num에 대입 
	      for(int i=1; i<arr.length; i++) {   // [0]을 이미 max_num에 대입했으므로 1부터 확인 
			     if(max_num < arr[i])
			    	 max_num = arr[i]; 
	   }
		return max_num;
	   
   }
   
   
	public static void main(String[] args) {
		int[] data = {3,2,9,54,10}; 
		System.out.println(java.util.Arrays.toString(data)); 
		System.out.println("최대값:"+max(data)); 
		System.out.println("최대값:"+max(null));
		System.out.println("최대값:"+max(new int[]{})); // 크기가 0인 배열
	}
	

}
