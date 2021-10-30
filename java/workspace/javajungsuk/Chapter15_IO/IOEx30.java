package ch15;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class IOEx30 {
	static int totalFiles = 0;
	static int totalDirs =0;
	
	public static void main(String[] args) throws IOException {
		
		
		File dir = new File("/Users/hahyebin/eclipse-workspace/IO/src");
		System.out.println("파일이 속해있는 디렉토리  => "+dir.getParent());
			
		if( dir.exists() ==false || dir.isDirectory() == false) {
			System.out.println(dir.exists());
			System.out.println(dir.isDirectory());
			System.out.println("유효하지 않는 디렉토리");
			System.exit(0);
		}
		printFileList(dir);
		System.out.println();
		System.out.println("총: "+totalFiles + "개의 파일");
		System.out.println("총: "+totalDirs + "개의 디렉토리");
	}
		public static void printFileList(File dir) {
			System.out.println(dir.getAbsolutePath() +"디렉토리");
			File[] files =dir.listFiles();
			
			ArrayList subDir = new ArrayList();
			
			for(int i=0; i<files.length; i++) {
				String filename = files[i].getName();
				
				if(files[i].isDirectory()) {
					filename = "["+filename + "]";
					subDir.add(i+"");
					System.out.println(filename);
				}
				int dirNum = subDir.size();
				int fileNum = files.length - dirNum;
				
				totalFiles += fileNum;
				totalDirs += dirNum;
				System.out.println(fileNum + "개의 파일, "+dirNum + "개의디렉토리");
				System.out.println();
				
				for(int k=0; k<subDir.size(); k++) {
					int index= Integer.parseInt((String)subDir.get(k));
					printFileList(files[index]);
				}
			}
		}
		
	

}
		 
		 