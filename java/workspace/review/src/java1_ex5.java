import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class java1_ex5 {
	
	public static void main(String[] args) {
/* ������ �� �� �������� Ű����κ��� ������ �Է¹޾�(100���� ���� ������ �����Ѵ�.) 
 *  ���� �迭�� �����ϰ�, �̰��� 1���� 100���� ������ ������ �����ϰ� �����Ͻÿ�.
 *   ���� ���� �������� ���ϵ��� �����ϰ� ������ �迭�� ����Ͻÿ�.
 *  
 */
		Scanner sc = new Scanner(System.in);
		Set<Integer> unit = new HashSet<Integer>();
		System.out.print("�迭�� ũ�⸦ �����ּ��� > " );
		
		int size = sc.nextInt();
		while(unit.size()<size) {
			if(0 < size && size <100) {
			   for(int i=0; i<size; i++) {
				   unit.add((int)(Math.random()*100)+1);	
				   break;  	 
			   } 
		} else { 
			System.out.println("�迭 ũ��� 0~99�����Դϴ�.");
			return;
		    }	
		} // end of while 
		System.out.println("unit�� �迭 : " + unit);	
		   
	}
} 



