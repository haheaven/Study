package model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.ModelAndView;
import dao.bBoardDao;

public class SelectService implements bBoardService {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

	  String strIdx = request.getParameter("idx");
	  Long idx = Long.parseLong(strIdx);
	  
	  String strread = request.getParameter("readCount");
	  Long readCount = Long.parseLong(strread);
	  
	  request.setAttribute("readCount", readCount);
	  request.setAttribute("board", bBoardDao.getInstance().select(idx));
	  request.setAttribute("hit",bBoardDao.getInstance().hit(idx));
		
		
		return new ModelAndView("views/selectboard.jsp", false);
	}

}
