package chapter11;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Ex11_30 {
	
public static void main(String[] args) {
   HashMap map = new HashMap();
   map.put("myid","1234");
   map.put("myidid","1111");
   map.put("myidid","1234");
   
   Scanner c = new Scanner(System.in);
   
   while(true) {
	   System.out.println("id pwd를 입력하세요 > ");
	   System.out.println("id : ");
	   String id = c.nextLine().trim();
	   
	   System.out.println("password : ");
	   String pwd = c.nextLine().trim();
	   System.out.println();
	   
	   if(!map.containsKey(id)) {
		  System.out.println("입력하신 id는 없습니다."+"다시입력해주세요");
	      
		  continue;
	   }
	   if(!(map.get(id).equals(pwd))) {
		   System.out.println("비밀번호가 일치하지 않습니다. ");
       } else {
	   System.out.println("id와 pwd가 일치합니다. ");
	   break;
        }
   
      }
	}
}