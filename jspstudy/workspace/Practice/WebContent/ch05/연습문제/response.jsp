<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Calendar" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
           response.setIntHeader("Refresh", 5);

%>
	<p>현재 시간은 <%=java.util.Calendar.getInstance().getTime() %></p>
	<p><a href="response_data.jsp">구글 홈페이지로 이동하기</a></p>
</body>
</html>