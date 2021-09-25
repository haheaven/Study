package chapter6;
import java.util.*;

public class Ex09 {
	public static void main(String[] args) {
	class Marine {
		int x=0, y=0;    //위치좌표 
		 int hp= 60;      //현재체력 
		static int weapon=6;    // 공격력 
		static int armor = 0;   //방어력 
		
		static  void weaponUp() { 
			weapon++;
		}
	    static void armorUp() {
			armor++;
		}
		void move(int x, int y) {
		this.x = x;
		this.y = y; 
		}
	}
  }
}
		
	   

