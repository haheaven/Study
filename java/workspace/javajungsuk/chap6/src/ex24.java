package chap6;
//23. 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
public class ex24 {
  static int abs(int value) {
	  if(value < 0) {
		  return Math.abs(value);    //음수일 경우에만 양수로 리턴 
	  }
	  return value;  // 양수면 그냥 리턴 
	  
	  // return value >=  0 ? value : - value;
  }
	public static void main(String[] args) {
	   int value = 5;
	   System.out.println(value+"의 절대값:" +abs(value));
	   value = -10;
	   System.out.println(value+"의 절대값:" +abs(value));
	   
	}
	

}
