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

		// 결과 확인하기
		PrintWriter out = response.getWriter();
		if( result > 0) {
			out.println("<script>");
			out.println("alert('공지사항 등록 성공')");
			out.println("location.href='selectAllList.do'");
			out.println("</script>");
			out.close();
		} else {
			out.println("<script>");
			out.println("alert('공지사항 등록 실패')");
			out.println("history.back();");
			out.println("</script>");
			out.close();
		}
		
		return null;

	}

}
