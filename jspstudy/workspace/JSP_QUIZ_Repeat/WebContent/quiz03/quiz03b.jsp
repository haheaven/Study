<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="quiz03c.jsp">
		<h3>2. 좋아하는 운동선수는 누구인가요?</h3>
	     <input type="text" name="sport">
	     <input type="hidden" name="talent" value="${param.talent}">
	     <input type="hidden" name="writer" value="${param.writer}">
	     <button>결과보기</button>
	</form>
</body>
</html>