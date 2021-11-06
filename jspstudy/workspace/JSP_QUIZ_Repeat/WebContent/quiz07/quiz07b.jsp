<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<% 	request.setCharacterEncoding("utf-8");
	
		session.setAttribute("writer", request.getParameter("writer"));
		session.setAttribute("talent", request.getParameter("talent"));
	
	%>

	<form action="quiz07c.jsp" method="post">
		<h3>2. 좋아하는 운동선수는 누구인가요?</h3>
	     <input type="text" name="sport">
	
	     <button>결과보기</button>
	</form>
</body>
</html>