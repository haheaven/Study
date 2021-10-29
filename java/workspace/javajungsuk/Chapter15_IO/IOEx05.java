package ch15;

import java.io.FileInputStream;
import java.io.IOException;

public class IOEx05 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("/Users/hahyebin/eclipse-workspace/IO/src/ch15/IOEx05.java");
		// "/Users/hahyebin/eclipse-workspace/IO/src/ch15/IOEx05.java"
		int data = 0;
		while
			( (data = fis.read()) != -1) {
			char c = (char)data;
			System.out.print(c);
		}	
   }
}
		 
		 