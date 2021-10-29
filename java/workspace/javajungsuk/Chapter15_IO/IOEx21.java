package ch15;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOEx21 {
	public static void main(String[] args) throws IOException {
		String line ="";
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("사용중인 os의 인코딩: "+isr.getEncoding());
			
			do {
				System.out.print("문장을 입력하세요. 마치시려면 q 입력 > ");
				line = br.readLine();
				System.out.println("입력한 문자 : "+line);
				
			} while (!line.equalsIgnoreCase("q"));
			
			br.close();
			System.out.println("프로그램 종료");
			
		} catch(Exception e) {}
}
}
		 
		 