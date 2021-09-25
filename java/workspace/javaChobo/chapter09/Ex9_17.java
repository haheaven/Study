package chapter09;

public class Ex9_17 {

	public static void main(String[] args) {
		String fullName = "Hello.java";
		
		//fullName 에서 . 의 위치 찾는다.
		int index = fullName.indexOf('.');
		
		//fullName의 0번째 부터 '.'있는 곳까지문자열추출
		String fileName = fullName.substring(0,index);
		
		// '.'의 다음 문자부터 시작해서 문자열의 끝까지 추출 
		//fullName.substring(index+1, fullName.length()); 의 결과와 같다.
		String ext = fullName.substring(index+1);
		
		System.out.println(fullName + "의 확장자를 제외한 이름은 " + fileName);
		System.out.println(fullName + "의 확장자는 " +ext);

	}

}
