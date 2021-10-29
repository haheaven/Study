package ch15;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class IOEx16 {
	public static void main(String[] args) throws IOException {
		try {
			 String fileName = "test.txt";
			 FileInputStream fis = new FileInputStream(fileName);
			 FileReader fr = new FileReader(fileName);
			 
			 int data =0;
			// FileInputStream 을 이용하고 파일 내용 읽어 화면 출력하기 
			 while( ( data = fis.read()) != -1 ){
				 System.out.print((char)data);
			 }
			 System.out.println();
			 fis.close(); 
			 
			// FileReader 이용해서  화면 출력하기 
			 while( ( data = fr.read()) != -1 ){
				 System.out.print((char)data);   // ==> 문자열 기반은 문자그대로 출력됨!!
			 }
			 fr.close();
		} catch(Exception e) {}
}
}
		 
		 