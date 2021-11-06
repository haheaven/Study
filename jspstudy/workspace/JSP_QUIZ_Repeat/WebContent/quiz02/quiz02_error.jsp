<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		요청을 처리하는 과정에서 오류가 발생했습니다.<br>
		예외타입 : <%=exception.getClass().getName() %><br>
		예외메시지 : <%=exception.getMessage() %><br>
		<a href="메일">오류 신고하기</a><br>
		<a href="quiz02a.jsp">처음부터 다시하기</a>
	
	</div>


</body>
</html>