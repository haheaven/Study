<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style> 
	label{
	  display : inline-block;
	  width : 100px;
}
</style>
</head>
<body>
	<% 	request.setCharacterEncoding("UTF-8"); %>
		<h2>신규 회원 정보를 입력하세요</h2>
		<form action="quiz05b.jsp" method="post">
			<label for="id">아이디 </label>
			<input type="text" name="id" id="id"><br>
			<label for="pwd">비밀번호 </label>
			<input type="text" name="pw" id="pw"><br>
			<label for="name">이름 </label>
			<input type="text" name="name" id="name"><br>
			<button>회원가입</button>
		</form>

</body>
</html>