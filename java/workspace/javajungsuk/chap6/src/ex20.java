package chap6;

import java.util.Arrays;

// 20. 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
public class ex20 {

	//코드 넣기 
	// static -> 객체 생성없이 호출할 때 static 필요 
	 static int[] shuffle(int[] arr) {  //반환타입과 매개변수는 배열 
		 
		 // 추가작업 필요..!!
		 if(arr==null || arr.length==0) {
			 return arr;     // -> 만약 배열이 없으면(또는 길이가0) 그대로 배열 리턴 
		 }
		 
		for(int i=0; i<arr.length; i++) {
			int n = (int)(Math.random()*arr.length);  //인덱스 난수 생성 
			int tmp=0;  //임시 저장 변수 
			
			tmp = arr[i];
			arr[i] = arr[n];
			arr[n] = tmp;   // -> swap 
			
		}
		return arr;  //반환타입은 배열 
	}
	
	
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(original));
		
		int[] result= shuffle(original);
		System.out.println(Arrays.toString(result));

	}

}

		// if(arr==null || arr.length==0) {
		//	return arr;   }
	//문제에서의 매개변수 original!=null , length!=0이기 때문에 
    //문제없이 작동되었지만 다른 매개변수를 주게된다면 shuffle()에선 오류가 남 
    //그렇기 때문에 이와 같은 코드가 필요함. 
			