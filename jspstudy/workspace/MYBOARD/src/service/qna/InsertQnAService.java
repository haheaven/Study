package service.qna;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.ModelAndView;
import dao.QnADao;
import dto.QnA;

public class InsertQnAService implements QnAService {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String writer = request.getParameter("writer");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String category = request.getParameter("category");  //추가 select
		
		QnA qna = new QnA();
		qna.setWriter(writer);
		qna.setTitle(title);
		qna.setContent(content);
		qna.setCategory(category);
		
		int result = QnADao.getInstance().insert(qna);
		
		
		// 결과 확인하기
		PrintWriter out = response.getWriter();
		if( result > 0) {
			out.println("<script>");
			out.println("alert('qna 등록 성공')");
			out.println("location.href='selectAllList.qna'");
			out.println("</script>");
			out.close();
		} else {
			out.println("<script>");
			out.println("alert('qna 등록 실패')");
			out.println("history.back();");
			out.println("</script>");
			out.close();
		}
		
		return null;
	}

}
