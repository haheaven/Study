package ch15;

import java.io.IOException;

public class IOEx22 {
	public static void main(String[] args) throws IOException {
	
		try {
			int input = 0;
			
			
			while (( input=System.in.read()) != -1) {
				System.out.println("input: "+input+", (char)input :" + (char)input);
			}
			
		} catch(Exception e) {}
}
}
		 
		 