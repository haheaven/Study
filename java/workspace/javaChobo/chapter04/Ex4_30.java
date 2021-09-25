package chapter04;

public class Ex4_30 {
	public static void main(String[] args) {
		int sum = 0, i=0;
		
		while(true) { //무한 반복문  =  for(; ; ){
			if(sum>100)
				break;  //자신이 속한 반복문을 벗어남 
				++i;
				sum += i;
			} // end of while 
		System.out.println("i= "+ i);
		System.out.println("sum= "+ sum);
		
		
       System.out.println("-----------------------");
		
		while(sum<=100) { // ㄴsum이 100보다 커질 때 탈출 
				++i;
				sum += i;
			} // end of while 
		System.out.println("i= "+ i);
		System.out.println("sum= "+ sum);
	}
}
	
