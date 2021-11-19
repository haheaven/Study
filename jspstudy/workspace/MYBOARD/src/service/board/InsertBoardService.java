package service.board;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import common.BoardService;
import common.ModelAndView;
import dao.BoardDao;
import dto.Board;

public class InsertBoardService implements BoardService {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String writer = request.getParameter("writer");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String category = request.getParameter("category");  //추가 select
		
		Board board = new Board();
		board.setWriter(writer);
		board.setTitle(title);
		board.setContent(content);
		board.setCategory(category);
		
		int result = BoardDao.getInstance().insert(board);
		
		JSONObject obj = new JSONObject();
		obj.put("result", result);
		
		response.setContentType("application/json");
		
		PrintWriter out = response.getWriter();
		out.println(obj);
		out.close();
			

		return null;
	}

}
