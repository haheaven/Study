package Chapter6;

public class Ex6_21 {

	public static void main(String[] args) {
        Calculator1 cal1 = new Calculator1();
        System.out.println("cal1.add(3,4) : " + cal1.add(3,4));
        System.out.println("cal1.add(3,4l) : " + cal1.add(1,4l));
        System.out.println("cal1.add(3,4) : " + cal1.add(6l,4));
        System.out.println("cal1.add(3,4) : " + cal1.add(3l,3l));
        int[] a = {10, 20, 100};
        System.out.println("cal1.add(a) : " + cal1.add(a));
	}

}
 class Calculator1{
	      int add(int a, int b) {
	    	  System.out.print("int add(int a, int b)- ");
	    	  return a+b;
	      }
	      long add(int a, long b) {
	    	  System.out.print("long add(int a, long b)- ");
	    	  return a+b;
	      }
	      long add(long a, int b) {
	    	  System.out.print("long add(long a, int b)- ");
	    	  return a+b;
	      }
	      long add(long a, long b) {
	    	  System.out.print("long add(long a, long b)- ");
	    	  return a+b;
	      }
	      int add(int[] a) {
	    	 System.out.print("int add(int[] add)- ");
	    	 int result = 0;
	    	 for(int i=0; i<a.length; i++) {
	    	   result += a[i];
	      }
	    	  return result;
	      }
 }