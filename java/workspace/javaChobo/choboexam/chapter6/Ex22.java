package chapter6;
import java.util.*;
public class Ex22 {
   public static boolean isNumber(String str) {
    	if(str==null || str=="") {
    		return false;
    	}
         for(int i=0; i<str.length(); i++) {
           char ch = str.charAt(i);
		   if('0'< ch || ch > '9')
			   return false;
         } 
         return true;
    	              }
    	
    
	
			
	
	
		public static void main(String[] args) {
	     String str = "123";
	     System.out.println(str+"은 숫자입니까? "+isNumber(str));
	     
	     str = "1234o";
	     System.out.println(str+"은 숫자입니까? " + isNumber(str));
		} 
			
			}
	