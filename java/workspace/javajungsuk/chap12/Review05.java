package chap12;

// 제네릭타입의 형변환 p.687


public class Review05 {
	public static void main(String[] args) {
		
		Box<Object> objBox = null; // 제네릭 타입의 objBox
		Box box = (Box) objBox;    // ok, 제네릭 타입 objBox -> 원시 타입 box 가능하지만 경고 발생
		objBox = (Box<Object>)box; // ok, 원시 타입 box-> 제네릭 타입 objBox 가능하지만 경고 발생
	  // 원시타입에는 제네릭 타입이 없기 때문에 가능 하지만 바람직한 코드는 아님 
		
		
		
//		Box<Object> objBox = null;
//		Box<String> strBox = null;

//		objBox = (Box<Object>) strBox; // 에러, Box<String> -> Box<Object>는 불가능 , 대입된 타입 불일치
//		strBox = (Box<String>) objBox; // 에러, Box<Object> -> Box<String>은 불가능 , 대입된 타입 불일
		
		//  제네릭 타입 불일치하기 때문에 불가능 
		
		
		Box<? extends Object> wBox = (Box<? extends Object>)new Box<String>(); 
		// ok , Box<String> -> Box<? extends Object> 가능, String은 Object의 자손 클래스이기 때문에 변환이 가능.

		Box<? extends Object> wBox2 = new Box<String>();//위 문장과 동일
		
		// 제네릭에 설정된 타입의 범위?에 따라서 형변환이 가능할수도 있다. 
		
		
		
		
	}
}	














