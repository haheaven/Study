package service.board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.BoardService;
import common.ModelAndView;
import dao.BoardDao;
import dto.Board;

public class SearchBoardSerivce implements BoardService {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String column = request.getParameter("column");
		String query = request.getParameter("query");
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("column", column);
		map.put("query", "%"+query+"%");    // 어떤 검색어든 검색될수 있게 앞 뒤로 만능문자 주어 가능하게 한다.
		
		List<Board> list = BoardDao.getInstance().searchBoard(map);
		
		Logger logger =  Logger.getLogger(SearchBoardSerivce.class.getName());
	    logger.info("검색 : "+list.toString());
		
		request.setAttribute("list", list);
		request.setAttribute("cnt", BoardDao.getInstance().getSearchCount(map));
		
		return new ModelAndView("views/selectList.jsp", false);
	}

}
