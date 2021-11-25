package service.qna;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import common.ModelAndView;
import common.Page;
import dao.QnADao;
import dto.QnA;

public class ListQnAService implements QnAService {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		HttpSession session = request.getSession();
	
		if( session.getAttribute("open") != null) {
			session.removeAttribute("open");
		}
		
		// 페이징 1 전체 공지사항 수 
		int cnt = QnADao.getInstance().getCount();
		
		// 페이징2 번호에 대한 처리
		Optional<String> opt = Optional.ofNullable(request.getParameter("page"));
		int page = Integer.parseInt(opt.orElse("1"));
		
		// 페이지3 객체
		Page p = new Page();
		p.setPageEntity(cnt, page);
		
		// 페이징4. String으로 < 1 2 3 4 5 > 만들기
		String pageEntity = p.getPageEntity("selectAllList.qna");
		
		//beginRecord ~ endRecord 목록 가져오기
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("beginRecord", p.getBeginRecord());
		map.put("endRecord", p.getEndRecord());
		
		List<QnA> list =QnADao.getInstance().selectlist(map);

		request.setAttribute("id", request.getParameter("writer"));
		request.setAttribute("pw", request.getParameter("pw"));
		
		request.setAttribute("list", list);
		request.setAttribute("startNum", cnt-(page-1)*p.getRecordPerPage() );
		request.setAttribute("pageEntity", pageEntity);
		request.setAttribute("cnt", cnt);
		
		// 데이터 갖고 이동하기 
		return new ModelAndView("qna/selectList.jsp", false);
	}

}
