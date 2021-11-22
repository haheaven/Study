package service.qna;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import common.ModelAndView;
import dao.QnADao;
import dto.QnA;

public class ListQnAService implements QnAService {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
	HttpSession session = request.getSession();
		
		QnA qna =  (QnA)(session.getAttribute("qna"));
		// 리스트로 되돌아와서 게시글 있으면 세션삭제하고 다시 시작
		if (session.getAttribute("qna") != null) {
			session.invalidate();
		}
		request.setAttribute("id", request.getParameter("writer"));
		request.setAttribute("pw", request.getParameter("pw"));
		
		request.setAttribute("list", QnADao.getInstance().selectlist());
		request.setAttribute("cnt", QnADao.getInstance().getCount());
		
		// 데이터 갖고 이동하기 
		return new ModelAndView("qna/selectList.jsp", false);
	}

}
