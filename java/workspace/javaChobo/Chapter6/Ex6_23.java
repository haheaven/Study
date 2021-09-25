package Chapter6;

public class Ex6_23 {

	public static void main(String[] args) {


   Data1 d1 = new Data1();
   Data2 d2 = new Data2(11);
   System.out.println(d1.x);
   System.out.println(d2.xx);
}

}
class Data1 {
  int x;
  Data1(){} //기본생성자 : 없어도 컴파일러 자동으로 만들어서 호출가능 
  
}
class Data2 {
  int xx;
  
  Data2(int xxx){
	  xx = xxx;   
  }
}
