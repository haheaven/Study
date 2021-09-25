package chapter14;


@FunctionalInterface
interface MyFunction2 {
	void myMethod();  //public abstract void myMethod();
}
class Outer {
	int val = 10;
	
	class Inner {
		int val = 20;
		
		void method(int i) {
			int val =30;
	//		i = 10;
			
			MyFunction2 f =() -> {
				System.out.println("            i : " + i);
		     	System.out.println("          val : " + val);
		     	System.out.println("      this.val: " + this.val);
		     	System.out.println("outer.this.val: " + this.val);
		     
			};
			f.myMethod();
		}
	}
}

class LambdaEx3 { 
	public static void main(String[] args) {
	//람다식으로 MyFunction run() 구현 
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.method(100);
}}
