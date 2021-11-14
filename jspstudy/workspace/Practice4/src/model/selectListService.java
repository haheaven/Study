package model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.ModelAndView;
import dao.aStudentDao;

public class selectListService implements aStudentService {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		
		request.setAttribute("list", aStudentDao.getInstance().selectlist());
		request.setAttribute("count", aStudentDao.getInstance().getCount());
		
		
		return new ModelAndView("views/studentlist.jsp", false);
	}

}
