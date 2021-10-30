<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="request01_process.jsp" method="post">
		<p> 아이디 <input type="text" name="userId"></p>
		<p> 비밀번호 <input type="text" name="userPw"></p>
		<button>로그인</button>
	</form>
	
<% 
	/* request.setAttribute("id","관리자");
	request.setAttribute("pw","1234");
	request.getRequestDispatcher("request01_process.jsp").forward(request, response);
	// --> 폼 입력 없이 바로 건너뛰기 때문에 주석 처리 
 */
%>

</body>
</html>


