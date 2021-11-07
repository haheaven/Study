<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	label {
		display : inline-block;
		width:100px;
	}
</style>
</head>
<body>
<form action="ex05_process.jsp" method="post">
		<label for="name">이름</label><input type="text" name="name" id="name"><br>
		<label for="addr">주소</label><input type="text" name="address" id="addr"><br>
		<label for="email">이메일</label><input type="text" name="email" id="email"><br>
		<button>전송</button>
	</form>
</body>
</html>