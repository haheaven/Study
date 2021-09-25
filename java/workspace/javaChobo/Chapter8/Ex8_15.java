package Chapter8;

import java.io.File;

public class Ex8_15 {
	public static void main(String[] args) {
		try {
		     File f = createFile(args[0]);
		     System.out.println	(f.getName()+"파일 성공적 생성.");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " 다시 입력해주세요");
		} 
	}
	
	static File createFile(String fileName) throws Exception {
		if(fileName==null || fileName.equals(""))
           throw new Exception("파일이름이 유효하지 않습니다.");
           File f = new File(fileName);
           f.createNewFile();
           return f;
	}
}