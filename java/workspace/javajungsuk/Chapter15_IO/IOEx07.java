package ch15;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx07 {
	public static void main(String[] args) throws IOException {
		try{
			
			FileOutputStream fos = new FileOutputStream("123.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
		
		int data = 0;
		for( int i ='1'; i<='9'; i++) {
				bos.write(i);
		}	
	
		fos.close();
   } catch(IOException e) {
	   System.out.println(e);
   }
}
}
		 
		 