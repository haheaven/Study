package service.board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import common.BoardService;
import common.ModelAndView;
import common.Page;
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
		
		int cnt =  BoardDao.getInstance().getCount();
		
		Optional<String> opt = Optional.ofNullable(request.getParameter("page"));
		int page = Integer.parseInt(opt.orElse("1"));
		
		Page p = new Page();
		p.setPageEntity(cnt, page);
		
		String pageEntity = p.getPageEntity("selectlist.do");
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("beginRecord", p.getBeginRecord());
		map.put("endRecord", p.getEndRecord());
		
		List<Board> list =  BoardDao.getInstance().selectlist(map);
		
		
		request.setAttribute("pageEntity", pageEntity);
		request.setAttribute("list",list);
		request.setAttribute("cnt", cnt);
		request.setAttribute("startNum", cnt-(page-1)*p.getRecordPerPage() );
		
		// 데이터 갖고 이동하기 
		return new ModelAndView("views/selectList.jsp", false);
	}

}
