package ch15;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx12 {
	public static void main(String[] args) throws IOException {
		int sum = 0;
		int score = 0;
		
		FileInputStream fis =null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("score.dat");
			dis = new DataInputStream(fis);
			
			while(true) {
				score = dis.readInt();
				System.out.print(score+",");
				sum += score;
			}
		} catch(EOFException e) {
			System.out.println("점수 총합: "+score);
		} catch( Exception e) {}
		finally {
			try {
				if(dis != null) 
					dis.close();
			} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
}

		 
		 