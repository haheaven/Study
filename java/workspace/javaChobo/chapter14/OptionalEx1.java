package chapter14;

import java.util.Optional;

public class OptionalEx1 {

	public static void main(String[] args) {
		 int[] arr = {};
		 // int[] arr = new int[0];
		 System.out.println("arr.length : "+arr.length);
		 
		// Optional<String> opt = null; //Ok, 하지만 바람직하지는 않는다.
		  Optional<String> opt = Optional.empty();
	//	  Optional<String> opt = Optional.of("abc");
		  System.out.println("opt : " + opt);
		// System.out.println("opt = "+opt.get());
		  
		  String str = "";
		
//		  try {
//			str = opt.get();
//		} catch (Exception e) {
//			str="";  //예외가 발생하면 빈문자열로("")로초기화 
//		} //예외발생 
		  
	//	  str = opt.orElse("EMPTY"); //Optional에 저장된 값이 null이면 ""반환 
	//	  str = opt.orElseGet(() -> "EMPTY"); 
		  //위코드랑 동일
	//	  str = opt.orElseGet(() -> new String()); 
		  str = opt.orElseGet(String::new);
		  System.out.println("str:"+str);
		  
		  
	}

}
