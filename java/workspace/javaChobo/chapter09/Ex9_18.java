package chapter09;

public class Ex9_18 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		System.out.println("sb1==sb2 >>" + (sb1==sb2));
		System.out.println("sb1.equals(sb2) >> "+ sb1.equals(sb2));
		
		//StringBuffer 를  String으로 변환 
        String s = sb1.toString();
        String ss = sb2.toString();
        
        System.out.println("s==ss >>" + (s==ss));
		System.out.println("s.equals(ss) >> "+ s.equals(ss));
        
	}

}
