package chap15;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

public class ex02 {
	public static void main(String[] args) {
//		if(args.length!=1) {
//			System.out.println("USAGE: java HexaViewer FILENAME");
//			System.exit(0);
//		}
		String inputFile = "/Users/hahyebin/eclipse-workspace/javajungsuk/src/chap15/ex02.java";
		
		try {
			FileInputStream input = new FileInputStream(inputFile);
			PrintStream 	output = new PrintStream(System.out);
			
			int data=0;
			int i=0;
			
			while( (data=input.read()) != -1) {
				output.printf("%02x",data);
				if((++i%16)==0) {
					output.println();
				}
				input.close();
				output.close();
			
			}
		}catch(IOException e) {
				System.out.println(e);
			}
		}
	
		
}
	

//??