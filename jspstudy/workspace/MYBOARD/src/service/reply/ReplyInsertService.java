package service.reply;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import common.BoardService;
import common.ModelAndView;
import dao.ReplyDao;
import dto.Reply;

public class ReplyInsertService implements BoardService {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		Long idx = Long.parseLong(request.getParameter("idx"));
		
		Reply reply = new Reply();
		reply.setWriter(writer);
		reply.setContent(content);
		reply.setIdx(idx);
		
		int result = ReplyDao.getInstance().insertReply(reply);
		
		JSONObject obj = new JSONObject();
		obj.put("result", result);
		
		response.setContentType("application/json; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		out.println(obj);
		out.close();
			

		return null;
	}

}
