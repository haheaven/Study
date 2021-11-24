package service.qna;

import java.io.PrintWriter;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import common.ModelAndView;
import dao.QnADao;
import dto.QnA;

public class SelectQnAService implements QnAService {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

	
	
		Optional<String> strIdx = Optional.ofNullable(request.getParameter("idx"));
		Long idx = Long.parseLong(strIdx.orElse("0"));
		  
		HttpSession session = request.getSession();
		
		if(session.getAttribute("open") == null ) {
			// 세션없으면 세션 저장
			session.setAttribute("open", true);
			// 조회수 증가 
		    QnADao.getInstance().hit(idx);
			
		}  
		
		QnA qna =  QnADao.getInstance().select(idx);
		
		
		
		// 세션 저장 있으면 
		if (qna != null) {
			// 조회수증가 안한 게시글 가져오기		
		//	qna = QnADao.getInstance().select(idx);
		   request.setAttribute("qna", qna);
		   System.out.println("qna session 삭제");
		   return new ModelAndView("qna/selectQnA.jsp", false);
			
		} else {
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('일치하는 qna이 없습니다. 다시 시도하세요')");
			out.println("history.back()");
			out.println("</script>");
			out.close();
			return null;
		}
		

	}

}
