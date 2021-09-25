package chapter11;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Ex11_09 {
	
	public static Stack back = new Stack();
	public static Stack forward = new Stack();
  
	public static void main(String[] args) {
		goURL("1.네이버");
		goURL("2.네이트");
		goURL("3.다음");
		goURL("4.구글");
		
	    printStatus();
	    
	    goBack();
	    System.out.println("='뒤로' 가기 버튼 누른 후 =");
	    printStatus();
	    
	    goBack();
	    System.out.println("='뒤로' 가기 버튼 누른 후 =");
	    printStatus();
	    
	    goForward();
	    System.out.println("='앞으로' 가기 버튼 누른 후 =");
	    printStatus();
	    
	    goURL("codechobo.com");
	    System.out.println("= 새로운 주소 누른 후 =");
	    printStatus();
}
	public static void printStatus() {
		System.out.println("back :" + back);
		System.out.println("forward : "+ forward);
		System.out.println("현재화면은 " + back.peek() + " 입니다.");
		System.out.println();
	}
	public static void goURL(String url) {
		back.push(url);
		if(!forward.empty())
			forward.clear();
	}
	public static void goForward() {
		if(!forward.empty())
			back.push(forward.pop());
		
	}
	public static void goBack() {
		if(!back.empty())
			forward.push(back.pop());
		
	}


}