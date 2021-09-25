package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
class Member{
	private String id;
	private String pwd;

}

public class practice1 {
	public static void main(String[] args) {
		
		
		//ArrayList에 Member 3명 입력하기 
	    //Member 정보는 알아서 처리 
		
		List<Member> list = new ArrayList<Member>();
		
		list.add(new Member("user1","1234"));
		list.add(new Member("user2","1234"));
		list.add(new Member("user3","1234"));
		
		System.out.println(list);
				
				
		
	}

}
