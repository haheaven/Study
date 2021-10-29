package chap15;
// 1, 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ex01 {

	public static void main(String[] args) {
		
		
		try {

		int lineNum = Integer.parseInt(args[0]);
		String fileName = "/Users/hahyebin/eclipse-workspace/javajungsuk/src/chap15/ex01.java";
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		
		String line = "";  // 한 라인씩 받기 위한 빈 문자열 선언하기 
		int i =1;
		
		// 라인 하나씩 읽으며, 읽을때 널이 아니고, i는 10이 될때까지 읽기 출력... 
		while((line = br.readLine())!=null && i <= lineNum) {
			System.out.println(i+":"+line);
		    i++;
		}
		
	}
		catch(IOException e) {
			System.out.println(e);
		}
    }

}


