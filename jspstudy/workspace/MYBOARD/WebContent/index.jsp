<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
 <link rel="stylesheet" type="text/css" href="css/index.css">
</head>
<body>
	<h3>로그인 PAGE</h3>
	 <c:if test="${user == null}">
		<form method="post"  action="login.member">
			 <div class="login_box">
				<label for="writer" >아이디</label> <input type="text" name="id" placeholder="id" id="writer" autofocus><br>
				<label for="pwd" >비밀번호</label> <input type="password" name="pw"  placeholder="pwd" id="pwd"><br>
			</div>
			<div class="btn">
				<button>로그인</button>&nbsp;
				<input type="button" value="회원가입" onclick="location.href='/MYBOARD/joinForm.member'">
			</div>	
		</form>
	</c:if>
	<c:if test="${user != null}">
	   <div>
			<h3>${user.name}님 반갑습니다.<input type="button" value="로그아웃" onclick="location.href='logout.member'"></h3>
			<input type="button" value="게시판으로 이동" id="move_btn" onclick="location.href='selectAllList.do'">
		</div>
	</c:if>
	
</body>
</html>