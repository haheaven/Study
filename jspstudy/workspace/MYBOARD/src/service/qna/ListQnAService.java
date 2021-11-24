package service.qna;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import common.ModelAndView;
import common.Page;
import dao.QnADao;
import dto.QnA;

public class ListQnAService implements QnAService {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		HttpSession session = request.getSession();
	
		if( session.getAttribute("open") != null) {
			session.removeAttribute("open");
		}
		

		request.setAttribute("id", request.getParameter("writer"));
		request.setAttribute("pw", request.getParameter("pw"));
		
		request.setAttribute("list", QnADao.getInstance().selectlist());
		request.setAttribute("cnt", QnADao.getInstance().getCount());
		
		// 데이터 갖고 이동하기 
		return new ModelAndView("qna/selectList.jsp", false);
	}

}
