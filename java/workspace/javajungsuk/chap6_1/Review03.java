package chap6_1;
// 참조변수의 반환타입 : ex6_14 (P.268)

class Data3 { int x; }

public class Review03 {
	public static void main(String[] args) {
// 1) d객체 생성 (0x100)
	Data3 d = new Data3();
	d.x = 10;            // 0x100의 x = 10;
	
// 2)-1
	Data3 d2 = copy(d);     // 2)-3    d2(0x200)

//3)
	System.out.println("d.x = "+d.x);
//4)
	System.out.println("d2.x = "+ d2.x);
	
	}
// 2)-2	
	static Data3 copy(Data3 d) { // 반환 타입이 Data3이며  copy(참조형 매개변수 )
		Data3 tmp = new Data3();    // tmp 객체생성 ( 0x200)
		tmp.x = d.x;  				// 0x200의 x = 10;
		
		return tmp;					// copy(d)의 반환은 0x200(x=10)  후 스택에서 사라짐 
	}
	
}

// 반환타입이 '참조형'이라는 것은 메서드가 '객체의 주소'를 반환하는 것을 의미한다. 
