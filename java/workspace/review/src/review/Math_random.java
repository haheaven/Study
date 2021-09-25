package review;

public class Math_random {

	public static void main(String[] args) {
		// 숫자로 구성된 6자리 인증번호 생성
		// authCode += 난수;  6번 반복
	
          String	authCode = "";
		for(int i=0; i<6; i++) {  
		int n  = (int)(Math.random()*10);
		   authCode += n;
	   }
	   System.out.println(authCode);
	
	 // 1 ~ 5 중 하나를 생성한다.
	// 4 이상 생성하면 하나 더 생성한다.
	   
	  
	   
	   while(true) {
		   int yut =  (int)(Math.random()*4)+1;
		   System.out.println(yut+"칸이동");
		   if(yut<4) {
			   break;
		   }
	   }
	  
	   
	   
	  
	}

}
