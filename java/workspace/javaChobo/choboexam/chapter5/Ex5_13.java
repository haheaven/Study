package chapter5;
import java.util.Arrays;
import java.util.Scanner;
public class Ex5_13 {

	public static void main(String[] args) {
		
		String[] word = {"computer", "television", "coding", "java"};
		
		Scanner scanner = new Scanner(System.in);
	int	count = 0;
		for(int i =0; i <word.length; i++) {
			char[] question = word[i].toCharArray();
	         
			for(int j=0; j <question.length; j++) {
	        	  int idx = (int)(Math.random() * question.length);
	        	  
	        	  char tmp = question[i];
	        	  question[i] =  question[idx];
	        	  question[idx] =  tmp;
	          }
			
			
			System.out.printf("Q%d, %s의 뜻은? \n", i+1, new String(question));
			
		String tmp = scanner.nextLine();
		
		
		if(tmp.equals(word[i])) {
			System.out.printf("정답! %n%n");
		  count ++;
		} else {
			System.out.printf("틀렸습니다. 정답은 %s입니다. %n%n ", word[i]);
		}
		
	} System.out.println("총 " +word.length+"문제 중에 " +count+"번 맞았습니다.");
}
}
