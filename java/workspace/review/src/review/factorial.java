package review;

class fac{
public void factorialtest(int n) {
	int p =1;
	
	for(int i=1; i<=n; i++) {
		p = p * i;
		
	}System.out.println(p);
 }
}

public class factorial {

	public static void main(String[] args) {
		 fac f1 = new fac();
		 f1.factorialtest(5);
	}
}
