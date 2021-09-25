package chapter14;


@FunctionalInterface
interface MyFunction1 {
	void myMethod();  //public abstract void myMethod();
}

class LambdaEx2 { 
	public static void main(String[] args) {
	//람다식으로 MyFunction run() 구현 
		MyFunction1 f = () -> {};
		Object obj =  (MyFunction)(() -> {}); //Object 타입으로 형변환 
     	String str = ((Object)(MyFunction)(()->{})).toString();
		
     	System.out.println(f);
     	System.out.println(obj);
     	System.out.println(str);
 //    	System.out.println(()->{});
     	System.out.println((MyFunction)(()->{}));
 //    	System.out.println((MyFunction)(()->{})).toString());
     	System.out.println(((Object)(MyFunction)(()->{})).toString());
     	
}}
