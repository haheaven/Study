package ch4.com.dao;

public class GuGuDan {
	
	public String process(int n) {
		String result ="";
		for(int i=1; i<=9; i++) {
		  result += n +"X"+i+"="+ (n*i)+"<br>";
		}
		return result;
}
	}
