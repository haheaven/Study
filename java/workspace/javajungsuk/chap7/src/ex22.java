package chap7;
// 22. 아래는 도형을 정의한 Shape클래스이다.
//이 클래스를 조상으로 하는 Circle클래 스와 Rectangle클래스를 작성하시오. 
//이 때, 생성자도 각 클래스에 맞게 적절히 추가해야 한다.
abstract class Shape {
	Point p;
	
	Shape(){
		this(new Point(0,0));
	}
	Shape(Point p){
		this.p = p;
	}
	
	abstract double calcArea();
	
	Point getPostion() {
		return p;
	}
	void setPosition(Point p) {
		this.p =p;
	}
}

// 추상클래스를 가진 조상을 상속하는 경우에는 추상메서드 구현꼭하고 구현없는 경우 
// 자식클래스에 abstract 추가하기 
class Circle extends Shape{
	// 필드
	double r;
	// 추상메서드 구현 
	double calcArea() {
		return Math.PI*r*r;
	}
	
    Circle(double r) {   // 상속 경우  자손생성자의 첫줄에 부모의 기본생성자 존재!
		this(new Point(0,0), r);	// 직접 객체 생성 
	}
	// 생성자 
	Circle(Point p, double r){    // 참조변수 이용 
		super(p);
		this.r =r;
	}
}

class Rectangle extends Shape{
	//필드
	double width;
	double height;
	
	
	// 추상메서드 구현 
	double calcArea() {
		return width*height;
	}
	// 정사각형 확인 
	boolean isSquare(){
		if(width==height && width*height!=0 ) {   // 너비 높이 같으면 트루   //     너비 높이에 대한 유효성검사 추가하기!
		  return true;
		}
		return false;       // 아니면 거짓 	
	}
	
	Rectangle(double width, double height){
	   this(new Point(0,0), width, height);
	}
	//생성자 
	Rectangle(Point p, double width, double height){
		super(p);
		this.width = width;
		this.height = height;
	}
}


class Point{
	int x;
	int y;
	
	Point(){
		this(0,0);
	}
	Point(int x, int y){
		this.x = x;
		this.y=y;
	}
	
	public String toString() {
		return "["+x+","+y+"]";
	}
}






public class ex22 {
	public static void main(String[] args) {
		
	}

}
