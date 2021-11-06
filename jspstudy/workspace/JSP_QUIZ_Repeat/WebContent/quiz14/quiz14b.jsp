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
	<% request.setCharacterEncoding("utf-8"); %>
	<h3>일반 forEach연습</h3>
	<c:forEach var="num" begin="${param.minNum}" end="${param.maxNum}" step="1">
		<font size="${num}">폰트사이즈 : ${num}</font><br>
	</c:forEach>
	<br><br>
	<h3>향상 forEach연습</h3>
	<ul>
		<c:forEach var="food" items="${paramValues.foods}"  varStatus="v">
			<li> ${v.count}번째 음식 : ${food} </li>
	</c:forEach>
	</ul>
</body>
</html>