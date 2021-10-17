package level03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 3.합 
public class ex03 {
	public static void main(String[] args) throws NumberFormatException, IOException {
//	 Scanner sc = new Scanner(System.in);
//	 int n = sc.nextInt();
//	 
//	 // 유효성 
//	 if( n < 1 || n > 10000) {
//		 System.out.println("n은 1~10000사이입니다. 다시 실행해주세요.");
//		 return;
//	 }
//	 
//	int sum = 0;
//	for(int i=1; i<=n; i++) sum += i;
//	
//	 System.out.println(sum);	
		
		BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(sb.readLine());
		sb.close();
		int sum=0;
		for(int i=1; i<=N; i++) sum+=i;
		
		System.out.println(sum);
	}
}
