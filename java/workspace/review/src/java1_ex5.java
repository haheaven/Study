import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class java1_ex5 {
	
	public static void main(String[] args) {
/* 정수를 몇 개 저장할지 키보드로부터 개수를 입력받아(100보다 작은 개수로 제한한다.) 
 *  정수 배열을 생성하고, 이곳에 1에서 100까지 범위의 정수를 랜덤하게 삽입하시오.
 *   같은 값은 생성하지 못하도록 설정하고 생성된 배열을 출력하시오.
 *  
 */
		Scanner sc = new Scanner(System.in);
		Set<Integer> unit = new HashSet<Integer>();
		System.out.print("배열의 크기를 정해주세요 > " );
		
		int size = sc.nextInt();
		while(unit.size()<size) {
			if(0 < size && size <100) {
			   for(int i=0; i<size; i++) {
				   unit.add((int)(Math.random()*100)+1);	
				   break;  	 
			   } 
		} else { 
			System.out.println("배열 크기는 0~99까지입니다.");
			return;
		    }	
		} // end of while 
		System.out.println("unit의 배열 : " + unit);	
		   
	}
} 



