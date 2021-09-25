package CollectionFramework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Map_MainClass {

	public static void method1() {
		//생성 
       Map<String, Integer> sungjuk = new HashMap<String, Integer>();
       sungjuk.put("국어", 100);
       sungjuk.put("수학", 100);
       sungjuk.put("영어", 90);
       
       System.out.println(sungjuk);
       
       sungjuk.remove("영어");
       System.out.println(sungjuk);
				
	}
	
	public static void method2() {
       Map<String, Object> staff = new HashMap<String, Object>();
		 
		 staff.put("staffNo", 1000);
		 staff.put("name", "천송이 ");
		 staff.put("dept", "전략");
		 
		 System.out.println(staff);
		 System.out.println(staff.get("staffNo"));
		 System.out.println(staff.get("name"));
		 System.out.println(staff.get("dept"));
	}

	
	public static void method3() {
	  Map<String, Object> staff = new HashMap<String, Object>();
		 
		 staff.put("사원번호", 1000);
		 staff.put("사원명", "천송이 ");
		 staff.put("부서명", "전략");
		 
		 //key 값빼서value 알아내기
		 Set<String> key =  staff.keySet();
		 for(String k : key) {
			 System.out.println(k+": "+staff.get(k)); 
		  }
		 for(Map.Entry<String, Object> k : staff.entrySet()) {
			 System.out.println(k.getKey() + k.getValue() );
		 }
		 
	}	 
		 
	public static void main(String[] args) {
		method3();

	}

}
