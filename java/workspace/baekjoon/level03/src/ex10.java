package level03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 10. 오른쪽 정렬 별찍기 
public class ex10 {
	public static void main(String[] args) throws NumberFormatException, IOException {
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  int N = Integer.parseInt(br.readLine());
	  br.close();
	  
	 for(int i=1; i<=N; i++) {
	  for(int j=N; j>i; j--) {
		  System.out.print(" ");
	   }
	  for(int j =1; j<=i; j++) {
		  System.out.print("*");
	   } 
	  System.out.println();
	}
  }
}