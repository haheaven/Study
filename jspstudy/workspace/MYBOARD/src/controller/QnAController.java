package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.ModelAndView;
import service.QnAreply.QnAReplyInsertService;
import service.QnAreply.QnAReplyListService;
import service.qna.DeleteQnAService;
import service.qna.InsertQnAService;
import service.qna.ListQnAService;
import service.qna.QnAService;
import service.qna.SearchQnAService;
import service.qna.SelectQnAService;
import service.qna.UpdateQnAService;


@WebServlet("*.qna")
public class QnAController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public QnAController() {
        super();
     
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length()+1);
		
		ModelAndView mav = null;
		QnAService service = null;
		
		switch(command) {		
		case "selectAllList.qna":   // 로그인 - 세션저장하기
			service = new ListQnAService();
			break;
		case "insertForm.qna":				  // Q&A 등록하러가기
			mav = new ModelAndView("qna/insert.jsp",false);
			break;
		case "insert.qna":                    // Q&A 등록
			service = new InsertQnAService();
			break;
		case "select.qna":                    // Q&A 상세
			service = new SelectQnAService();
			break;
		case "update.qna":                   // Q&A 수정
			service = new UpdateQnAService();
			break;
		case "delete.qna":                   // Q&A 삭제
			service = new DeleteQnAService();
			break;
		case "listQnAReply.qna":             // 댓글리스트
			service = new QnAReplyListService();
			break;
		case "insertReply.qna":              // 댓글삽입
			service = new QnAReplyInsertService();
			break;
		case "search.qna" :				 	// qna 검색
			service = new SearchQnAService(); 
		    break;
		   
		}
		
		
		
		if( service != null) {
			try {
				mav = service.execute(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if( mav == null )return;
		
		if( mav.isRedirect()) {
			response.sendRedirect(mav.getView());
		} else {
			request.getRequestDispatcher(mav.getView()).forward(request, response);
		}
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
