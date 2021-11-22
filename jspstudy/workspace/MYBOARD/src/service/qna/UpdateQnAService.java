package service.qna;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import common.ModelAndView;
import dao.QnADao;
import dto.QnA;

public class UpdateQnAService implements QnAService {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String strIdx = request.getParameter("idx");
		Long idx = Long.parseLong(strIdx);
		  
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		QnA qna = new QnA();
		qna.setIdx(idx);
		qna.setTitle(title);
		qna.setContent(content);
		
		int result = QnADao.getInstance().updateQnA(qna);
		
		
		JSONObject obj = new JSONObject();
		obj.put("result", result);
		
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println(obj);
		out.close();
	
		return null;
	}

}
