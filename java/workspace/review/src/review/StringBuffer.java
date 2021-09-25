package review;

public class StringBuffer {

	public static void main(String[] args) {
		 StringBuilder sb = new StringBuilder();
				 
	for(int i=0; i<6; i++) {
		sb.append((char)((int)(Math.random()*26)+'A'));
		
	}
	String code = sb.toString();
	System.out.println(code);
	}

}
