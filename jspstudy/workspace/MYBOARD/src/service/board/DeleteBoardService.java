package service.board;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.BoardService;
import common.ModelAndView;
import dao.BoardDao;

public class DeleteBoardService implements BoardService {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		Long idx = Long.parseLong(request.getParameter("idx"));
		
		int result = BoardDao.getInstance().delete(idx);
		
		PrintWriter out = response.getWriter();
		if(result>0) {
			out.println("<script>");
			out.println("alert('삭제 성공')");
			out.println("location.href='selectAllList.do'");
			out.println("</script>");
			out.close();
		} else {
			out.println("<script>");
			out.println("alert('삭제 실패')");
			out.println("history.back()");
			out.println("</script>");
		}
		
		return null;
	}
}
