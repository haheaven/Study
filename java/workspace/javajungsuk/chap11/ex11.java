package chap11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// 11. 다음 예제의 빙고판은 1~30사이의 숫자들로 만든 것인데, 숫자들의 위치가 잘 섞이지 않는다는 문제가 있다. 
// 이러한 문제가 발생하는 이유와 이 문제를 개선하기 위한 방법을 설명하고, 이를 개선한 새로운 코드를 작성하시오.
public class ex11 {
	public static void main(String[] args) {
		Set set = new HashSet();
		int[][] board = new int[5][5];
		
		
		for(int i=0; set.size() < 25; i++) {
			set.add((int)(Math.random()*30)+1+"");
			}
		ArrayList list = new ArrayList(set); 
		Collections.shuffle(list);
		Iterator it = list.iterator();
		
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[i].length; j++) {
				board[i][j] = Integer.parseInt((String)it.next());
				System.out.print( (board[i][j]<10?" " : " " )+ board[i][j]);
			}
			System.out.println();
		}
	}
}
// 중복된 값을 허용하지 않는 다는 특성을 이용해서 HashSet에 서로 다른 임의의 값 을 저장하는 것까지는 좋았는데, 
// 해싱알고리즘의 특성상 같은 값은 같은 자리에 저장되기 때문에 빙고판의 숫자들이 잘 섞이지 않는다는 문제가 발생하였다.
// 중복제거와 저장순서유지를 하지 않는  특성을 지님 ==> 해결하기위해 rinkedhashset방법 존재 