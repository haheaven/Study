package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.ModelAndView;
import service.member.AdminBoardList;
import service.member.MemberJoinService;
import service.member.MemberLoginService;
import service.member.MemberService;


@WebServlet("*.member")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public MemberController() {
        super();
     
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length()+1);
		
		ModelAndView mav = null;
		MemberService ms = null;
		
		switch(command) {		
		case "login.member":   // 로그인 - 세션저장하기
			ms = new MemberLoginService();
			break;
		case "joinForm.member":
			mav = new ModelAndView("views/join.jsp", false);
			break;
		case "join.member":
			ms = new MemberJoinService();
			break;
		case "selectAdminList.member":
			ms = new AdminBoardList();
			break;
	
		}
		
		
		
		if( ms != null ) {
			try {
				mav = ms.execute(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if( mav == null )return;
		
		if( mav.isRedirect()) {
			response.sendRedirect(mav.getView());
		} else {
			request.getRequestDispatcher(mav.getView()).forward(request, response);
		}
		
		
		
		
		
		
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
