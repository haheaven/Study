package service.board;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import common.BoardService;
import common.ModelAndView;
import dao.BoardDao;
import dto.Board;

public class UpdateBoardService implements BoardService {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String strIdx = request.getParameter("idx");
		Long idx = Long.parseLong(strIdx);
		  
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		Board board = new Board();
		board.setIdx(idx);
		board.setTitle(title);
		board.setContent(content);
		
		int result = BoardDao.getInstance().updateboard(board);
		
		
		JSONObject obj = new JSONObject();
		obj.put("result", result);
		
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println(obj);
		out.close();
	
		return null;
	}

}
