<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${param.writer}님의 선호도 조사결과 
	<ul>
		<li>좋아하는 연예인 : ${param.talent}</li>
		<li>좋아하는 운동선수 : ${param.sport}</li>
	
	</ul>
</body>
</html>