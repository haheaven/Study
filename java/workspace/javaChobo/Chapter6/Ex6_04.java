package Chapter6;

public class Ex6_04 {

	public static void main(String[] args) {
	Tv[] tvarr =new Tv[3];//객체가 3인 Tv객체 배열 
	
	//Tv객체 생성해서 Tv객체 배열의 각 요소에 저장 
	for(int i=0; i<tvarr.length; i++) {
		tvarr[i] =new Tv();
		tvarr[i].channel = i+10;
	}
	for(int i=0; i<tvarr.length; i++) {
		tvarr[i].channelUp();
		System.out.printf("tvarr[%d].channel = %d%n", i, tvarr[i].channel);
	}
  }
}
 


