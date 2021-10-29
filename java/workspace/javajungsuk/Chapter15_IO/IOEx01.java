package ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx01 {

	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		
		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		int data=0; 
		
		while ( (data=input.read()) != -1 ) {   // input의 데이터를 읽고 data에 저장 후 
			output.write(data);					// data 읽을때마다 output에 저장 
		}
		
		outSrc = output.toByteArray();
		
		System.out.println("Input Source: "+Arrays.toString(inSrc));
		System.out.println("Output Source: "+Arrays.toString(outSrc));

	}

}
