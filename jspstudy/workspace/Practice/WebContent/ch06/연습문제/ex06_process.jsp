<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>선택한 과일</h3>
	<c:forEach var="fruit" items="${paramValues.fruits}">
		${fruit}&nbsp;
	 </c:forEach>
	
</body>
</html>