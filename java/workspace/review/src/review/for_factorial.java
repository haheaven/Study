package review;


class Calculator{
	// void일때만 return;으로 할 수 있기 때문에 리턴값이 1이 되기 위해 result 변수 선언 
	   int factorial(int n) {
           if(n==0)
        	   return 1;
           return n * factorial(n-1); 
	  }
}
public class for_factorial {

	public static void main(String[] args) {
	   
	   Calculator c = new Calculator();
	  System.out.println( c.factorial(5)); 
		
		
		
	}

}
