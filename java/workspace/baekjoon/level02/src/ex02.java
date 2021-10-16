package level02;

import java.util.Scanner;

// 시험성적 
public class ex02 {

	public static void main(String[] args) {   
		Scanner sc = new Scanner(System.in);
		//System.out.print("시험 성적 입력 >> ");
		int score = sc.nextInt();
		if (score >=90) 
			System.out.println("A");
		else if (score >= 80 && score < 90 )
			System.out.println("B");
		else if (score >= 70 && score < 80 )
			System.out.println("C");
		else if (score >= 60 && score < 70 )
			System.out.println("D");
		else 
			System.out.println("F");
		

	}

}
