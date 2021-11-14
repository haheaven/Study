package cotroller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.ModelAndView;
import model.DeleteService;
import model.InsertService;
import model.SelectService;
import model.UpdateService;
import model.aStudentService;
import model.selectListService;

@WebServlet("*.do")
public class aStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public aStudentController() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length()+1);
		
		ModelAndView mav = null;
		aStudentService ass = null;
		
		switch(command) {
		case "selectList.do":
			ass = new selectListService();   // 전체리스트
			break;
		case "insert.do":                    // 입력
			ass = new InsertService();
			break;
		case "select.do":                   // 상세
			ass = new SelectService();
			break;
		case "update.do":                  //  수정
			ass = new UpdateService();
			break;
		case "delete.do":                 // 삭제
			ass = new DeleteService();
			break;
		}
		
		if( ass != null )
			try {
				mav = ass.execute(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		if(mav  == null) return;
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
