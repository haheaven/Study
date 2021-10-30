package ch15;

import java.io.File;
import java.io.IOException;

public class IOEx28 {
	public static void main(String[] args) throws IOException {
	
		/* 
		  	File 
		  	
		  	- 가장 많이 사용되는 입출력 대상 
		  	- 생성자 관련 
		  	1. File(String fileName): fileName을 갖는 파일을 위한 File 인스턴스 생성 -> 경로일수도 파일일수도 
		  	2. File(String path, String fileName) : 경로와 이름을 따로 분리해서 지정 
		  	- 메서드 관련 
		  	1. String getName() : fileName을 문자열로 반환 
		  	2. String getPath() : 파일 경로 문자열로 반환
		 */
		File f = new File("/Users/hahyebin/eclipse-workspace/IO/src/ch15/IOEx28.java");
		String fileName = f.getName();
		int pos = fileName.lastIndexOf(".");
		
		System.out.println("경로를 제외한 파일 이름   => "+f.getName());
		System.out.println("확장자를 제외한 파일 이름  => "+ fileName.substring(0, pos));
		System.out.println("확장자 				 => "+fileName.substring(pos+1));
		System.out.println();
		System.out.println("경로를 포함한 파일 이름   => "+f.getPath());
		System.out.println("파일의 절대경로         => "+f.getAbsolutePath());
		System.out.println("파일의 정규경로         => "+f.getCanonicalPath());
		System.out.println("파일이 속해있는 디렉토리  => "+f.getParent());
		System.out.println();
		System.out.println("File.pathSeparator     => "+File.pathSeparator);
		System.out.println("File.pathSeparatorChar => "+ File.pathSeparatorChar);
		System.out.println("File.separator         => "+File.separator);
		System.out.println("File.separatorChar     => "+ File.separatorChar);
		System.out.println();
		System.out.println("user.dir  			 => "+System.getProperty("user.dir"));
		System.out.println("sun.boot.class.path  => "+System.getProperty("sun.boot.class.path"));
		System.out.println();
		
		
		
		
		
		
		
		
		
		
	}
}
		 
		 