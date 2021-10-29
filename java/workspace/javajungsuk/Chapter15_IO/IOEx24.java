package ch15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class IOEx24 {
	public static void main(String[] args) throws IOException {
		PrintStream ps = null;
		FileOutputStream fos =null;
		
		try {
			fos = new FileOutputStream("test.txt");
			ps = new PrintStream(fos);
			System.setOut(ps);
		} catch(FileNotFoundException e) {
			System.err.println("File noe found");
		}
		System.out.println("Hello by System.out");
		System.err.println("Hello by System.err");
}
}
		 
		 