package chap7;

import java.awt.Frame;
import java.awt.event.WindowAdapter;    // awt --> java window 프로그램 
import java.awt.event.WindowEvent;


// 아래의 EventHandler를 익명 클래스(anonymous class)로 변경하시오.
public class ex28 {

	public static void main(String[] args) {
		Frame f = new Frame();
		f.addWindowListener(new WindowAdapter() {
   			public void windowClosing(WindowEvent e) {
   				e.getWindow().setVisible(false);
   				e.getWindow().dispose();
   				System.exit(0);
   			 }
   		});
  }
}
   // 책참고 
   		

// 익명클래스 
// 이름이 없는 일회용 클래스 + 정의와 생성 동시에 
// 이름이 없기 때문에 최고조상 Object 활용함 
/* ex)
    Object iv = new Object(){ void method(){} };
	static Object cv = new Object(){ void method(){} };
	
	void method(){
	Object lv = enw Object(){ void method() {} };	
*/
