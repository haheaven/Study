package ch15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx06 {
	public static void main(String[] args) throws IOException {
		try{
			FileInputStream fis = new FileInputStream("/Users/hahyebin/eclipse-workspace/IO/src/ch15/IOEx05.java");
			FileOutputStream fos = new FileOutputStream(args[0]);
		
		
		int data = 0;
		while( (data = fis.read()) != -1) {
				fos.write(data);
		}	
		fis.close();
		fos.close();
   } catch(IOException e) {
	   System.out.println(e);
   }
}
}
		 
		 