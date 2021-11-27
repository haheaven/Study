package chap7_1;

public class Review02_2 {
	public static void main(String[] args) {
		Point3D p3 = new Point3D();            // 매개변수 없는 생성자 객ㅊㅔ 생성 
		System.out.println("p3.x= " + p3.x);
		System.out.println("p3.y= " + p3.y);
		System.out.println("p3.z= " + p3.z);
	}
}

class Point {
	int x = 10;
	int y = 20;
	
	Point(int x, int y){    //   ==>  생성자 첫줄에 호출이 없으면 컴파일러가 super(); 자동으로 삽입한다 (매개변수가 없는)
		                    //  즉 Point에서는 최고조상인 Object()의 super()호출한다. 
		this.x = x;
		this.y = y;
	}
}
class Point3D extends Point{
	int z = 30;
	
	Point3D(){
		this(100,200,300);         //  1. Point3D(int x, int y, int z) 호출 
	}
	
	Point3D(int x, int y, int z){  // 2. Point(int x, int y) 호출 (super()는 없지만 직접 만든(매개변수있는생성자) super(x, y) 를 첫줄에 삽입함 ) 
		super(x,y);
		this.z = z;
		
	}
	
}
