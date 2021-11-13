package model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.ModelAndView;
import dao.bBoardDao;

public class SelectAllList implements bBoardService {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
	//	request.setAttribute("hit", request.getParameter("hit"));
		request.setAttribute("id", request.getParameter("writer"));
		request.setAttribute("pwd", request.getParameter("pwd"));
		
		request.setAttribute("list", bBoardDao.getInstance().selectlist());
		request.setAttribute("cnt", bBoardDao.getInstance().getCount());
		
		// 데이터 갖고 이동하기 
		return new ModelAndView("views/bselectlist.jsp", false);
	}

}
