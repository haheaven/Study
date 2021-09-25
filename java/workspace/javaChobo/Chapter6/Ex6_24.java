package Chapter6;

public class Ex6_24 {

	public static void main(String[] args) {
     Car c1 = new Car("white", 1234, 4);   
     System.out.printf("c1의 색상은 %s, 번호는 %d, 문은 %d개",c1.color, c1.num, c1.door);
	}
}

    // 클래스 
   class Car{
	   //필드 
	   String color;
	   int num;
	   int door;
	   //메서드
	   Car(String c, int n, int d){  //매개변수가 있는 생성자 
		   color = c;
		   num = n;
		   door = d;
	   }
   }