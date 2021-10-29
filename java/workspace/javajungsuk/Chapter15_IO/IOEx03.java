package ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class IOEx03 {

	public static void main(String[] args) {
		// 배열을 이용한 입출력은 작업의 효율을 증가시키므로 가능하면 입출력 대상에 따라 알맞는 크기의 배열을 사용하는 것이 좋다. 
		 byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		 byte[] outSrc = null;
		 byte[] tmp = new byte[4];

		 
		 ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		 ByteArrayOutputStream output = new ByteArrayOutputStream();
		 
		 System.out.println("Input Source:" + Arrays.toString(inSrc));
		
	
		 try {
			 while ( input.available() > 0) {
				 input.read(tmp);
				 output.write(tmp);
				 //System.out.println("tmp Source:"+ Arrays.toString(tmp));
				 
				 outSrc = output.toByteArray();
				 printArrays(tmp, outSrc);
			 }
		 } catch(IOException e) { }

	}


	static void printArrays(byte[] tmp, byte[] outSrc) {
		System.out.println("tmp Source:"+ Arrays.toString(tmp));
		System.out.println("output Source:" + Arrays.toString(outSrc));
	}
}