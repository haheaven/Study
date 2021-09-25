package Chapter6;

public class Ex6_06 {

	public static void main(String[] args) {
		Mymath mm = new Mymath();
		long result1 = mm.add(3l, 5l);
		long result2 = mm.substract(3l, 5l);
		long result3 = mm.multiply(3l, 5l);
		double result4 = mm.divide(3l, 5l);
		long result5 = mm.max(3l,  5l);
		long result6 = mm.min(4l,  3l);
		
		System.out.println("add의 메소드 결과 " + result1);
		System.out.println("substract의 메소드 결과 " + result2);
		System.out.println("mutiply의 메소드 결과 " + result3);
		System.out.println("divide의 메소드 결과 " + result4);
		System.out.println("max의 메소드 결과 " + result5);
		System.out.println("min의 메소드 결과 " + result6);
		

	}

}

 class Mymath {
	 long add(long a, long b) {
		 return a + b;
	 }
	 long substract(long a, long b) {
		 return a-b;
	 }
	 long multiply(long a, long b) {
		 return a*b;
	 }
	 double divide(long a, long b) {
		 return a/b;
	 }
	 // 
	 long max(long a, long b) {
		 long result;
		 if(a>b) {
			 result = a; 
		 } else {
			 result = b;
		 } return result; 
	 }
	 long min(long a, long b){
		return a<b ? a:b;
	 }

	 
 }
