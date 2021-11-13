package model;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import common.ModelAndView;
import dao.bBoardDao;
import dto.bBoard;

public class InsertService implements bBoardService {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String writer = request.getParameter("writer");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		bBoard board = new bBoard();
		board.setWriter(writer);
		board.setTitle(title);
		board.setContent(content);
		
		int result = bBoardDao.getInstance().insert(board);
		
		JSONObject obj = new JSONObject();
		obj.put("result", result);
		
		response.setContentType("application/json");
		
		PrintWriter out = response.getWriter();
		out.println(obj);
		out.close();
			

		return null;
	}

}
