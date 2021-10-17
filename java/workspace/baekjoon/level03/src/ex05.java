package level03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// N찍기 
public class ex05 {
	public static void main(String[] args) throws NumberFormatException, IOException {
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  int N = Integer.parseInt(br.readLine());
	  br.close();
	  for(int i=1; i<=N; i++) {
		  System.out.println(i);
	  }
	}
}
