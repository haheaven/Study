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
	<%	request.setCharacterEncoding("utf-8"); %>
	<c:if test="${param.result==param.answer}">
		${param.a} 	${param.op} ${param.b}  = 	${param.result} 
		<br>정답입니다.
	</c:if>
		<c:if test="${param.result!=param.answer}">
		제출 : ${param.a} ${param.op} ${param.b}  = ${param.result} <br>
		정답 : ${param.a} ${param.op} ${param.b}  = ${param.answer} 
		
	</c:if>
	<br><a href="quiz04a.jsp">다시 풀기</a>

</body>
</html>