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
	 	String strNum =request.getParameter("number");
		int num = Integer.parseInt(strNum);
		for(int i=1; i<=9; i++){
	%>
		<%=num%>*<%=i%>=<%=num*i%><br>
	<% } %>
</body>
</html>