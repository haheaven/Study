package Chapter8;

import java.io.File;

public class Ex8_18 {
	public static void main(String[] args) {
       try {
    	   startInstall();    //설치준비 
    	   copyFiles();       //파일복사 
    	
       } catch (Exception e) {
    	   e.printStackTrace();
       } finally {          //설치에 사용된 임시파일 삭제 
    	   deleteTempFiles();
       }
	}
	static void startInstall() {}
	static void copyFiles() {}
	static void deleteTempFiles() {}
}