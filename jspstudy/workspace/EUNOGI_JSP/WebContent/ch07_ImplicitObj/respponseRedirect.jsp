<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

현재페이지는 <b>responseRedirect.jsp </b>

<%
response.sendRedirect("responseRedirected.jsp");
%>
</body>
</html>