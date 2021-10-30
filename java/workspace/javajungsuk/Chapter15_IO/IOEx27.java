package ch15;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class IOEx27 {
	public static void main(String[] args) throws IOException {
		int korsum=0, engsum=0, mathsum = 0;
		
		try {
		RandomAccessFile raf = new RandomAccessFile("/Users/hahyebin/eclipse-workspace/IO/score2.dat", "r");
		int kor =4;  // 첨 숫자 1번 읽으면 포인터는4 
		int eng = 8; // 영어점수 포인터는 8에서 시작 
		int math =12;
		
		while(true) {
			raf.seek(kor);  // 4포인트 뒤에 있는 국어점수 읽기 
			korsum += raf.readInt();  // 읽은 국어점수 더하기 
			kor += 16;  // 국,영,수 + 다음 번호 뒤에 국어점수 존재하므로 4*4바이트해서 포인트 위치  옮기기 
			
			raf.seek(eng);
			engsum += raf.readInt();  // 읽은 영어점수 더하기 
			eng += 16;
			
			raf.seek(math);
			mathsum += raf.readInt();  // 읽은 수학점수 더하기 
			math += 16;
			
			
		}
		} catch(EOFException e) {
			System.out.println("국어점수 : "+korsum);
			System.out.println("수학점수 : "+mathsum);
			System.out.println("영어점수 : "+engsum);
		} catch(IOException e) {
			System.out.println(e);
		}
	
		
	
}
}
		 
		 