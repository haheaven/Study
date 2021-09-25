package Chapter8;

import java.io.File;

public class Ex8_17 {
	public static void main(String[] args) {
       try {
    	   startInstall();   //설치준비 
    	   copyFiles();      //설치복사 
    	   deleteTempFiles();   //임시파일 삭제 
       } catch (Exception e) {
    	   e.printStackTrace();    
    	   deleteTempFiles();   //임시파일삭제 
       }
	}
	static void startInstall() {}
	static void copyFiles() {}
	static void deleteTempFiles() {}
}