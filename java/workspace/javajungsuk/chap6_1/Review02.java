package chap6_1;
//  참조형 매개변수 예제 :ex6_10
class Data2{ int x; }

public class Review02 {
	public static void main(String[] args) {
		
	//	1)
		Data2 d = new Data2(); 				  // d객체 주소 임의 : 0x100 내부에 x 존재 
		d.x = 10;          				  // x = 10
		System.out.println("main() : x = " + d.x);  // 10
	// 2)-1	
		change(d);   //  주소를 매개변수로 
	
	// 3)	
		System.out.println("After change(d)");
		System.out.println("main() : x = "+ d.x);  // 1000
	
	}
	
	// 2)-2
	static void change(Data2 d) {  				// change(참조형매개변수=>0x100)
		d.x = 1000;   					//  0x100(d) 있는 x = 1000
		System.out.println("change() :x = " + d.x);   //1000
	}
	
	
}

/*
 	참조형 매개변수 
 	변수의 값을 읽고 변경할 수 있다. 
 
*/
