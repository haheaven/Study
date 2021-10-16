package chap6;
//22.  다음과 같이 정의된 메서드를 작성하고 테스트하시오.
// 숫자 48~57
public class ex22 {
	static boolean isNumber(String str){
		boolean num = false;
		for(int i=0; i<str.length(); i++) {
		    char a = str.charAt(i);
			if('0' > a || a > '9') 
			    return num;
		}
		
		if(str == null || str.equals("") ) {  // 유효성 검사는 보통 앞에서 먼저 체크 !!
			return num;
		}
		
		
		return !num;   // if문 통과했으면 모두 숫자이므로 !num(=true)이므 반환 
	}
	public static void main(String[] args) {
		String str = "";
		System.out.println(str+"는 숫자입니까? "+isNumber(str)); 
		str = "123";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
	}

}
