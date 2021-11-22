package service.qna;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import common.ModelAndView;
import dao.QnADao;
import dto.QnA;

public class SelectQnAService implements QnAService {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		HttpSession session = request.getSession();
	
		QnA qna =  (QnA)(session.getAttribute("qna"));
	
	 	String strIdx = request.getParameter("idx");
		Long idx = Long.parseLong(strIdx);
		  
		  
		// 상세보기 첨  열기 
		if(qna == null) {
			// 조회수 증가 db 다녀오기 
			QnADao.getInstance().hit(idx);
			
			// 증가된 조회수 게시글 가져오기
			qna = QnADao.getInstance().select(idx);
			 
			// 객체 저장을 세션에 하기
			session.setAttribute("qna",qna);
			System.out.println("저장");

		    } 
		
		// 세션 저장 있으면 
		if (qna != null) {
			// 조회수증가 안한 게시글 가져오기		
			qna = QnADao.getInstance().select(idx);
		   request.setAttribute("qna", qna);
		   System.out.println("삭제");
			
		}

		return new ModelAndView("qna/selectQnA.jsp", false);
	}

}
