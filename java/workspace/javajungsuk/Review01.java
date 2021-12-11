package chap13;
// p.733
public class Review01 {
	public static void main(String args[]) {
	
	long startTime = System.currentTimeMillis();
	
		
		for(int i=0; i<300; i++) 
			System.out.printf("%s", new String("-"));
		 
		System.out.print("소요시간1 : " + (System.currentTimeMillis()-startTime));    //Review01에서 print("소요시간1") 실행 - 출력 - print("소요시간1")끝 
		
		for(int i=0; i<300; i++) {
			System.out.printf("%s", new String(""));
		}
		System.out.print("소요시간2 : " + (System.currentTimeMillis()-startTime));  ////Review01에서 print("소요시간2") 실행 - 출력 - 메소드 끝 -  main끝 
		
	}

}


