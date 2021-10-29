package ch15;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class IOEx08 {
	public static void main(String[] args) throws IOException {
		// DataIn/OutputStream -> Filter~~ 의 자손이며,
		//DataIn,Output 인터페이스 구현하여 byte단위가 아닌 8가지 기본 자료형의 사용이가능하다
		// 출력한 데이터를 읽어올 때는  출력순서에 맞게 구성해야 한다.
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("sample.dat");
			dos = new DataOutputStream(fos);
			dos.writeInt(10);
			dos.writeFloat(20.2f); 
			dos.writeBoolean(true);
			
			dos.close();
		} catch(IOException e) {
			System.out.println(e);
		}
		
	}
}
		 
		 