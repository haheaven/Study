package chap7;
// 18. 다음과 같은 실행결과를 얻도록 코드를 완성하시오.
public class ex18 {	
	static void action(Robot r) {
		 if(r instanceof DanceRobot) {
			((DanceRobot) r).dance();
		 } else if (r instanceof SingRobot) {
			 ((SingRobot) r).sing();
		 } else if ( r instanceof DrawRobot) {
			 ((DrawRobot) r).draw();
		 }
	 }
	public static void main(String[] args) {
		
		
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
		
		for(int i=0; i< arr.length;i++) {
			action(arr[i]);
			}
		}
	}
class Robot{}

class DanceRobot extends Robot{
	void dance() {
		System.out.println("춤을 춥니다. ");
	}
}
class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}
class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}
