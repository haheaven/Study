package chapter09;

import java.util.StringJoiner;

public class Ex9_15 {

	public static void main(String[] args) throws Exception {
	   String str = "가";
	   
	  byte[] bArr = str.getBytes("UTF_8");
	  byte[] bArr2 = str.getBytes("CP949");
	  
	  System.out.println("UTF_8:" + joinByteArr(bArr));
	  System.out.println("CP949:" + joinByteArr(bArr2)); 
	  
	  System.out.println("UTF_8:" + new String(bArr, "UTF_8"));
	  System.out.println("UTF_8:" + new String(bArr2, "CP959"));
	  
	}
	static String joinByteArr(byte[] bArr) {
		StringJoiner sj = new StringJoiner(":","[","]");
		
		for(byte b : bArr) 
			sj.add(String.format("%02X", b));
		return sj.toString();
	}

}
