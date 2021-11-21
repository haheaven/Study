package test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import dao.MemberDao;
import dto.Member;

class memberTest {

//	@BeforeEach
//	void 멤버추가하기() {
//		Member member = new Member();
//		member.setId("aa");
//		member.setPw("aaaa1111");
//		member.setName("aaa");
//		member.setEmail("aa@naver.com");
//		member.setBirth("19991011");
//		member.setGender("f");
//		member.setPhone("01022222222");
//		
//		int result = MemberDao.getInstance().join(member);
//		 assertEquals(1, result, "등록오류");
//		
//		
//	}
	
	@Test
	void test() {
		Member member = MemberDao.getInstance().searchId("scott");
		assertNotNull(member, "회원이없습니다.");
	}

}
