package ch15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOEx20 {
	public static void main(String[] args) throws IOException {
		try {
			String fileName= "/Users/hahyebin/eclipse-workspace/IO/src/ch15/IOEx20.java";
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			
			String line="";
			for(int i=1; (line=br.readLine())!=null; i++) {
				if(line.indexOf(";")!=-1)
					System.out.println(i+":"+line);
			}
			 br.close();
			
		} catch(Exception e) {}
}
}
		 
		 