package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.BoardService;
import common.ModelAndView;
import service.board.DeleteBoardService;
import service.board.InsertBoardService;
import service.board.ListBoardService;
import service.board.SelectBoardService;
import service.board.UpdateBoardService;
import service.reply.ReplyInsertService;
import service.reply.ReplyListService;


@WebServlet("*.do")
public class BoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public BoardServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length()+1);
		
		ModelAndView mav = null;
		// 보드
		BoardService bs = null;
		
		
		switch(command) {
		case "selectAllList.do":             // 게시판 전체리스트
			bs = new ListBoardService();
			break;
		case "insert.do":                    // 게시판 등록
			bs = new InsertBoardService();
			break;
		case "select.do":                   // 게시판 상세
			bs = new SelectBoardService();
			break;
		case "update.do":                  // 게시판 수정
			bs = new UpdateBoardService();
			break;
		case "delete.do":                  // 게시판 삭제
			bs = new DeleteBoardService();
			break;
		case "listReply.do":             // 댓글리스트
			bs = new ReplyListService();
			break;
		case "insertReply.do":           // 댓글삽입
			bs = new ReplyInsertService();
			break;
		}
		
		if( bs != null ) {
			try {
				mav = bs.execute(request, response);
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
