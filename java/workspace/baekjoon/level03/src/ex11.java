package level03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 11. X보다 작은 수 
public class ex11 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();  // X보다 작은 수 저장할 객체 
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());  // 여기서 N의 수만큼 입력 
		for(int n=0; n<N; n++) {
			int num = Integer.parseInt(st.nextToken());  // N의 수만큼 입력한 값 num에 초기화 
			if(num<X) sb.append(num).append(" ");        // num이X보다 작으면 sb에 추가함 
		}
		System.out.println(sb);
		
  }
 }
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int X = sc.nextInt();
//		int i = 0;
//		
//		while(i < N) {
//			int t =	sc.nextInt();
//			i++;
//		if(t<X) 
//		   System.out.print(t+" ");	
//		} // end of While 
//		sc.close();