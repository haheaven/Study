package level03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 기찍N
public class ex06 {
	public static void main(String[] args) throws NumberFormatException, IOException {
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  int N = Integer.parseInt(br.readLine());
	  br.close();
	  for(int i=N; i>=1; i--) {
		  System.out.println(i);
	  }
	}
}
