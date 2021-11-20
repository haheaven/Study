package service.member;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.ModelAndView;
import dao.MemberDao;
import dto.Member;

public class MemberJoinService implements MemberService {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String birthday = request.getParameter("year")+request.getParameter("month")+request.getParameter("day");
		String gender = request.getParameter("gender");
		
		Member member = new Member();
		member.setId(id);
		member.setPw(pw);
		member.setName(name);
		member.setGender(gender);
		member.setEmail(email);
		member.setPhone(phone);
		member.setBirth(birthday);
		
		int result = MemberDao.getInstance().join(member);
		
		PrintWriter out = response.getWriter();
		if( result > 0 ) {
			out.println("<script>");
			out.println("alert('회원가입 성공')");
			out.println("location.href='index.jsp'");
			out.println("</script>");
			out.close();
			
		} else {
			out.println("<script>");
			out.println("alert('회원가입 실패')");
			out.println("history.back();");
			out.println("</script>");
			out.close();
		}
		return null;
	}	

}
