package ch15;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx11 {
	public static void main(String[] args) throws IOException {
		int[] score = {100, 90, 95, 85, 80};
		
		try {
			FileOutputStream fos = new FileOutputStream("score.dat");
			DataOutputStream dos = new DataOutputStream(fos);
			
			for(int i=0; i<score.length; i++) {
				dos.writeInt(score[i]);
			} 
			dos.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
}
}
		 
		 