package chap7;
// 17. 아래 세 개의 클래스로부터 공통부분을 뽑아서 Unit이라는 클래스를 만들고, 
//이 클래스를 상속받도록 코드를 변경하시오.
public class ex17 {

	public static void main(String[] args) {
	
	class Unit{
		int x, y; // 현재 위치 
		void move(int x, int y) {}
		void stop() {}
	}
	// 오답풀이 : 이동방법이 다를 것이라고 생각 못함 
	// 문제집 관련 예제를보면 marine과 tank는 땅에서 움직이고, dropship은 공중에서 움직임...
	
	class Marine extends Unit{
		void stimPack() {}	
	}
	
	class Tank extends Unit{ // 탱크	
		void changeMode() {}
	}
		
		
	class Dropship extends Unit { // 수송선 
		void load() {}
		void unload() {}
	 }

  }
}
