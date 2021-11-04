package naver.api;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ValidationServlet")
public class ValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
     
    public ValidationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		boolean result = GetValidation.getValidation(request);  //ct 입력값과 실제key 비교 => true false 
		if(result) {
			out.println("<script>");
			//out.println("location.href='daum_loginC.jsp'");
		    request.getRequestDispatcher("daum_loginC.jsp").forward(request, response);
			out.println("</script>");
		} else {
			out.println("<script>");
			out.println("alert('문자를 잘못입력하셨습니다.')");
			out.println("location.href='LoginServlet'");
			out.println("</script>");
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
