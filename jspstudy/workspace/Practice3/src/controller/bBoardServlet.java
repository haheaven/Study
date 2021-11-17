package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.ModelAndView;
import model.InsertService;
import model.Page;
import model.SelectAllList;
import model.SelectService;
import model.BBoardService;
import model.DeleteService;
import model.UpdateService;


@WebServlet("*.do")
public class bBoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public bBoardServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length()+1);
		
		ModelAndView mav = null;
		BBoardService bs = null;
		switch(command) {
		case "selectAllList.do":
			bs = new SelectAllList();
			break;
		case "insert.do":
			bs = new InsertService();
			break;
		case "select.do":
			bs = new SelectService();
			break;
		case "update.do":
			bs= new UpdateService();
			break;
		case "delete.do":
			bs = new DeleteService();
			break;
		case "page.do":
			bs = new Page();
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
