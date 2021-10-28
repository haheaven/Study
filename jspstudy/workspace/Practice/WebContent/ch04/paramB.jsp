<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	 <h3>이 파일은 includeB.jsp 입니다,</h3>
     <p>아이디 : <%= request.getParameter("id") %></p> 
     <p>이 름 : <%= request.getParameter("name") %></p> 
     <p><%=new java.util.Date() %> </p>
</body>
</html>