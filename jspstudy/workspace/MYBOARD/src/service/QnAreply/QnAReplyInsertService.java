package service.QnAreply;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import common.ModelAndView;
import dao.QnAReplyDao;
import dto.QnAReply;
import service.qna.QnAService;

public class QnAReplyInsertService implements QnAService {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		Long idx = Long.parseLong(request.getParameter("idx"));
		
		QnAReply reply = new QnAReply();
		reply.setWriter(writer);
		reply.setContent(content);
		reply.setIdx(idx);
		
		int result = QnAReplyDao.getInstance().insertQnAReply(reply);
		
		JSONObject obj = new JSONObject();
		obj.put("result", result);
		
		response.setContentType("application/json; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		out.println(obj);
		out.close();
			

		return null;
	}

}
