package CollectionFramework;

import java.util.*;

public class SetLotto {
	public static void main(String[] args) {
		
		

	     
	     
	     Map<String, Object> staff1 = new HashMap<String, Object>();
	     staff1.put("사원번호",1000);
	     staff1.put("사원명","김자바");
	     staff1.put("부서명","개발부");
	     
	     Map<String, Object> staff2 = new HashMap<String, Object>();
	     staff2.put("사원번호",1001);
	     staff2.put("사원명","박이클");
	     staff2.put("부서명","개발부");
	     
	      Map<String, Object> staff3 = new HashMap<String, Object>();
	     staff3.put("사원번호",1002);
	     staff3.put("사원명","이스프링");
	     staff3.put("부서명","개발부");
	     
	     //HashMap에 추가한 staff들 List에 담기 
	     List< Map<String, Object>> staffs = Arrays.asList(staff1, staff2, staff3);
	     
	     for( Map<String, Object> staff : staffs){
	       for( Map.Entry<String, Object> entry : staff.entrySet() ){
	          System.out.println(entry.getKey() + ": " + entry.getValue());
	          } 
	      }  

	     

		}
	}


