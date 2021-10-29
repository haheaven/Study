package ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx02 {

	public static void main(String[] args) {
	 byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
	 byte[] outSrc = null;
	 byte[] tmp = new byte[10];
	 
	 ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
	 ByteArrayOutputStream output = new ByteArrayOutputStream();
	 
	 input.read(tmp, 0, tmp.length); //input 읽어서 tmp에 인덱스 0번부터 tmp 길이만큼 복사 
	 output.write(tmp, 5,5); 		// tmp의 인덱스5번부터 5개를 ouput에 담는다. 
	 
	 outSrc = output.toByteArray();
	 
	 System.out.println("Input Source:" + Arrays.toString(inSrc));
	 System.out.println("tmp Source:"+ Arrays.toString(tmp));
	 System.out.println("output Source:" + Arrays.toString(outSrc));

	}

}
