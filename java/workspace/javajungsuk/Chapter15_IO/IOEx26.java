package ch15;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class IOEx26 {
	public static void main(String[] args) throws IOException {
		
		int[] score = { 1, 100,  90,  90,
				  		2,  70,  90, 100,
				  		3, 100, 100, 100,
				  		4,  70,  60,  80,
				  		5,  70,  90 ,100};
		
		try {
			RandomAccessFile raf = new RandomAccessFile("score2.dat", "rw");
			for(int i=0; i<score.length; i++) {
				raf.writeInt(score[i]);
			}
		  // 내부 포인터의 위치를 원점으로 이동시켜야한다. ->seek(0)이 없다면 writeInt()를 통해 포인터의 위치를 맨마지막으로 옮겼기 때문에..  이후 글 읽으려고 하니 글 없어서 읽을 내용없어서 EOF발생 
			raf.seek(0);
			while(true) { System.out.println(raf.readInt()); }
			
		} catch(EOFException e) {
			// readInt()호출 후에 읽을 게 없다면 발생하는 예외 
			
		} catch(IOException e) {}	
	}
}
		 
		 