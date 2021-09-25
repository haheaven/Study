package Chapter7;




class Ex7_31 {
	class InstanceInner {
	 int iv = 10;
	 static int cv = 100;
	 final static int CONST = 100; 
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 200;
		
	}
	void myMethod() {
		class LocalInner{         //지역 내부 클래스의 static 상수는 해당 메서드 내에서만 사용 가능 
			int iv = 300;
			static int cv = 300;
			static final int CONST =300;
		}
		int i = LocalInner.CONST; //ok
	}
 public static void main(String[] args) {
	 System.out.println(InstanceInner.CONST);
	 System.out.println(StaticInner.cv);
//	 System.out.println(LocalInner.CONST);     //에러, 지역 내부클래스는 메서드 내에서만 사용가능 
 }}