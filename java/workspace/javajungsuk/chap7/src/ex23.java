package chap7;
// 23. 문제7-22에서 정의한 클래스들의 면적을 구하는 메서드를 작성하고 테스트 하시 오.
abstract class Shape2 {
	Point2 p;
	
	Shape2(){
		this(new Point2(0,0));
	}
	Shape2(Point2 p){
		this.p = p;
	}
	
	abstract double calcArea();
	
	Point2 getPostion() {
		return p;
	}
	void setPosition(Point2 p) {
		this.p =p;
	}
}

// 추상클래스를 가진 조상을 상속하는 경우에는 추상메서드 구현꼭하고 구현없는 경우 
// 자식클래스에 abstract 추가하기 
class Circle2 extends Shape2{
	// 필드
	double r;
	// 추상메서드 구현 
	double calcArea() {
		return Math.PI*(r*r);
	}
	
	
	// 생성자 
	Circle2(double r){   
		 this.r =r;
	}
}
class Rectangle2 extends Shape2{
	//필드
	double width;
	double height;
	
	
	// 추상메서드 구현 
	double calcArea() {
		return width*height;
	}
	// 정사각형 확인 
	boolean isSquare(){
		if(width==height) {   // 너비 높이 같으면 트루 
		  return true;
		}
		return false;       // 아니면 거짓 
	}
	//기본생성자 
		Rectangle2(){}
		//생성자 
		Rectangle2(double width, double height){
			this.width = width;
			this.height = height;
		}
}


class Point2{
	int x;
	int y;
	
	Point2(){
		this(0,0);
	}
	Point2(int x, int y){
		this.x = x;
		this.y=y;
	}
	
	public String toString() {
		return "["+x+","+y+"]";
	}
}


public class ex23 {
	// 언제든 불러와야하므로 static 
	static double sumArea(Shape2[] arr) {
		// 합을 위한 필드 
		double sum=0;
		// 매개변수 한개씩 받아 더하기 
		for(int i=0; i<arr.length; i++) {
			sum += arr[i].calcArea();
		}
		return sum;
	}

	public static void main(String[] args) {
		Shape2[] arr = {new Circle2(5.0), new Rectangle2(3,4), new Circle2(1)}; 
		System.out.println("면적의 합:"+sumArea(arr));
	}
}
