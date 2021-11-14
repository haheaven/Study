package model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.ModelAndView;
import dao.aStudentDao;
import dto.aStudent;

public class SelectService implements aStudentService {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		Long stuNo = Long.parseLong(request.getParameter("stuNo"));
		
		aStudent student = aStudentDao.getInstance().selectone(stuNo);
		
		request.setAttribute("student", student);
		
		return new ModelAndView("views/studentdetail.jsp", false);
	}

}
