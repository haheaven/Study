package ch15;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx10 {
	public static void main(String[] args) throws IOException {
		try {
			FileInputStream fis = new FileInputStream("sample.dat");
			DataInputStream dis = new DataInputStream(fis);
			
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readBoolean());
			dis.close();
		}catch(Exception e) {
			System.out.println(e);
		}
}
}
		 
		 