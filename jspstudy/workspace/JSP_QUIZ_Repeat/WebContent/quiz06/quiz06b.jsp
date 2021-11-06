<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.net.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	label {
		display:inline-block;
		width:100px;
		}
</style>
</head>
<body>
	<% 	request.setCharacterEncoding("UTF-8"); 
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
	
	
		Cookie c1 = new Cookie("id", URLEncoder.encode(id, "utf-8"));
		c1.setMaxAge(60*60);
		response.addCookie(c1);
		Cookie c2 = new Cookie("pw",URLEncoder.encode(pw, "utf-8"));
		c2.setMaxAge(60*60);
		response.addCookie(c2);
		Cookie c3 = new Cookie("name",URLEncoder.encode(name, "utf-8"));
		c3.setMaxAge(60*60);
		response.addCookie(c3);
	
	%>
		<h2>연락처를 입력하세요</h2>
		<form action="quiz06c.jsp" method="post">
			<label for="addr">주소 </label>
			<input type="text" name="addr" id="addr"><br>
			<label for="tel">전화번호 </label>
			<input type="text" name="tel" id="tel"><br>
			<label for="email">이메일 </label>
			<input type="text" name="email" id="email"><br>
			<button>확인</button>
		</form>
</body>
</html>