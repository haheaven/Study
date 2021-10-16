package chap7;

public class ex08 {

	public static void main(String[] args) {
		//08. 다음 중 접근제어자를 접근범위가 넓은 것에서 좁은 것의 순으로 바르게 나열한 것은?
		//a. public-protected-(default)-private 
		//b. public-(default)-protected-private 
		//c. (default)-public-protected-private 
		//d. private-protected-(default)-public

		
		// 답 : public -> protected -> default -> private 
		// public : 제한x
		// protected : 같은 패키지, 다른 패키지의 자손클래스들 
		// default : 같은 패키지 
		// private : 같은 클래스 
		
		// class 앞에는 public 과 default만 가능 
	}

}
