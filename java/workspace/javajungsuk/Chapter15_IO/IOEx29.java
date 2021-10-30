package ch15;

import java.io.File;
import java.io.IOException;

class IOEx29 {
	public static void main(String[] args) throws IOException {
//		if( args.length != 1) {
//			System.out.println("USAGE: java IOEx29 DIRECTORY");	
//		}
		
		File f = new File("/Users/hahyebin/eclipse-workspace/IO");
		System.out.println("파일이 속해있는 디렉토리  => "+f.getParent());
			
		if( f.exists() ==false || f.isDirectory() == false) {
			System.out.println(f.exists());
			System.out.println(f.isDirectory());
			System.out.println("유효하지 않는 디렉토리");
			System.exit(0);
		}
		File[] files = f.listFiles();
		System.out.println(files);
		
		for(int i=0; i<files.length; i++) {
			String fileName = files[i].getName();
			System.out.println(files[i].isDirectory() ? "["+fileName+"]" : fileName );
		}
		
	
		
	
}
}
		 
		 