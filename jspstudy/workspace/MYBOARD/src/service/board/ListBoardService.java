package service.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import common.BoardService;
import common.ModelAndView;
import dao.BoardDao;
import dto.Board;

public class ListBoardService implements BoardService {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
	HttpSession session = request.getSession();
		
		Board board =  (Board)(session.getAttribute("board"));
		// 리스트로 되돌아와서 게시글 있으면 세션삭제하고 다시 시작
		if (session.getAttribute("board") != null) {
			session.invalidate();
		}
		request.setAttribute("id", request.getParameter("writer"));
		request.setAttribute("pwd", request.getParameter("pwd"));
		
		request.setAttribute("list", BoardDao.getInstance().selectlist());
		request.setAttribute("cnt", BoardDao.getInstance().getCount());
		
		// 데이터 갖고 이동하기 
		return new ModelAndView("views/selectList.jsp", false);
	}

}
