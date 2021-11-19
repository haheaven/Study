package service.reply;

import java.io.PrintWriter;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;

import common.BoardService;
import common.ModelAndView;
import dao.ReplyDao;
import dto.Reply;

public class ReplyListService implements BoardService {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		Optional<String> opt = Optional.ofNullable(request.getParameter("idx"));
		Long idx = Long.parseLong(opt.orElse("0"));
		
		// db로부터 목록을 받아옴 
		List<Reply> list =  ReplyDao.getInstance().selectListReply(idx);
		
		// list를 JSON데이터로 변경 후 반환 
		JSONArray arr = new JSONArray(list);
		
		// 결과 반환 
	    response.setContentType("application/json; charset=UTF-8");
	    PrintWriter out = response.getWriter();
	    out.println(arr); //arr이 ajax success로 넘기는 데이터 
	    out.close();
		
	    // 페이지 이동을 막기 위해서 null 반환
		return null;
		
	}

}
