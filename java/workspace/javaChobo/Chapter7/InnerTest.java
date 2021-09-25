package Chapter7;

class AA{    //BB는 AA의 내부클래스 
	int i =10;
	BB b = new BB();

   class BB{
	 void method() {
//	   AA a = new AA();
//	   System.out.println(a.i);
	   System.out.println(i);  // 내부클래스면 객체 생성없이 클래스의 멤버 접근가능 
	   }
	} 
}

//class CC{
//   BB b = new BB();
//}
//
//
//public class InnerTest {
//  public static void main(String[] args) {
//		BB b = new BB();
//		b.method();
//
//	}
//
//}
