<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% request.setCharacterEncoding("utf-8"); %>
	<h3>이 파일은  paramA.jsp</h3>
	아이디와 이름 파라미터 전달하고 포함하는 include+param
	<jsp:include page="paramB.jsp">
		<jsp:param value="admin" name="id"/>
		<jsp:param value="관리자" name="name"/>
	</jsp:include>
	<p>Java Server Page</p>
</body>
</html>