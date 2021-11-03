package naver.api;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 세번 틀리면 자동방지 떠야함 
		
		// 키 값 받기 
		String key = GetKey.getKey();   // 같은 패키지내에 있으므로 임포트없으며 getKey는 스태틱이므로 객체 생성없이 사용 가능 --> getKey()의 반환은 key
		request.setAttribute("key",key);
		// 이미지 받기 
		GetImage.getImage(key,request);
		
		request.getRequestDispatcher("daum_login2.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
