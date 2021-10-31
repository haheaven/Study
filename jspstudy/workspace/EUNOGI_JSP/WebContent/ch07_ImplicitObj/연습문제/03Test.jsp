<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
	String no = request.getParameter("no");
	String name = request.getParameter("name");
	String major = request.getParameter("major");
%>

학번 : <%=no %><br>
이름 : <%=name %><br>
전공 : <%=major %>
</body>
</html>