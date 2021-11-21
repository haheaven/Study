package service.member;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import common.BoardService;
import common.ModelAndView;
import dao.MemberDao;
import dto.Member;
import service.member.MemberService;

public class AdminBoardList implements MemberService {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		Member member = new Member();
		member.setId(id);
		member.setPw(pw);
		
		Member admin = MemberDao.getInstance().selectAdmin(member);
		
		// 일치회원 있으면 세션 저장 하기 
		if ( admin != null ) {
			HttpSession session = request.getSession();
			session.setAttribute("admin", admin);
			
			// 로그인 기록 남기기..!!!
			MemberDao.getInstance().loginLog(id);
			
			return new ModelAndView("index.jsp", false);
			
		}
		// 일치하는 회원 없으면 
		else {
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('관리자 정보가 없습니다.')");
			out.println("history.back()");
			out.println("</script>");
			out.close();
			return null;
		}
		
		
	
	}

}
