<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="java.lang.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Date date = new Date();
		int a =5;   // 스크립트랩 -> 변수 선언 가능 
	%>
	<p>현재 날짜: <%=date%></p>
	<p>5의 제곱: <%=Math.pow(a,2)%></p>
</body>
</html>