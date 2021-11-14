package model;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.ModelAndView;
import dao.aStudentDao;

public class DeleteService implements aStudentService {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		Long stuNo = Long.parseLong(request.getParameter("stuNo"));
		
		int result = aStudentDao.getInstance().delete(stuNo);
		
		PrintWriter out = response.getWriter();
		if(result > 0) {
			out.println("<script>");
			out.println("alert('삭제성공')");
			out.println("location.href='/Practice4/selectList.do'");
			out.println("</script>");
			out.close();
		} else {
			out.println("<script>");
			out.println("alert('삭제실패')");
			out.println("history.back()");
			out.println("</script>");
			out.close();
		}	
		return null;
	}

}
