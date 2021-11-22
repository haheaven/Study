package service.qna;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

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
		
		JSONObject obj = new JSONObject();
		obj.put("result", result);
		
		response.setContentType("application/json");
		
		PrintWriter out = response.getWriter();
		out.println(obj);
		out.close();
			

		return null;
	}

}
