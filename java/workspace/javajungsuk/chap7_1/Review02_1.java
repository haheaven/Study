package chap7_1;

/**    잘못된 super 호출 예제   **/


public class Review02_1 {
	public static void main(String[] args) {
		Point3D1 p3 = new Point3D1(1,2,3);            // 매개변수 있는 생성자 객ㅊㅔ 생성 
		System.out.println(p3.getLocation());
	}
}

class Point1 {
	int x;
	int y;

	
	
	Point1(int x, int y){    //   ==>  생성자 첫줄에 호출이 없으면 컴파일러가 super(); 자동으로 삽입한다 (매개변수가 없는)
		                    //  즉 Point에서는 최고조상인 Object()의 super()호출한다. 
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x: " +  x + ", y : "+ y;
	}
}
class Point3D1 extends Point1{
	int z;
	

	Point3D1(int x, int y, int z){     
	// ==>  생성자의 첫줄에 컴파일러가 super()삽입한다. 여기서 super() 는 Point 객체이다.
    // ==>  Point클래스에서는 생성자가 매개변수 있는 생성자만 존재하기 때문에 기본 생성자가 존재하지 않아
    // ==> 호출할 생성자인 super()가 없으므로 컴파일러 오류가 난다,  
		
		// 해결 방법
		// 1. Point1 Class에 기본 생성자 직접 추가 Point1() {} 
		// 2. Point3D1(int x, int y, int z)의 첫줄에 super()가 아닌 Point1(int x, int y)=> super(x, y)를 호출한다. 
		
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() {
		return "x: " +  x + ", y : "+ y + ", z : " + z;
	}	
		
		
		

	
}
