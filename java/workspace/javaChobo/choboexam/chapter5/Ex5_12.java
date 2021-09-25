package chapter5;
import java.util.Scanner;
public class Ex5_12 {

	public static void main(String[] args) {
		
		String[][] word = {
				{"chair","의자"},
				{"computer", "컴퓨터"},
				{"integer", "정수"}
		};
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		
		for(int i =0; i <word.length; i++) {
			System.out.printf("Q%d, %s의 뜻은? \n", i+1, word[i][0]);
		
		String tmp = scanner.nextLine();
		if(tmp.equals(word[i][1])) {
			System.out.printf("정답! %n%n");
		   
		} else {
			System.out.printf("틀렸습니다. 정답은 %s입니다. \n\n ", word[i][1]);
		}
	}   System.out.println("전체" + word.length + "중에 " + count+  "문제 맞았습니다.");

}
}
