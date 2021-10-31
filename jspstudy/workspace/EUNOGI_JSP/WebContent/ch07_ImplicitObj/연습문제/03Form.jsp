<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> 정보입력 </h2>
	<form action="03Test.jsp">
	
	학번 : <input type="text" name="no"><br>
	이름 : <input type="text" name="name"><br>
	전공 : <select name="major">
		<option value="" selected>=선택하기=</option>
		<option value="컴퓨터공학" selected>컴퓨터공학</option>
		<option value="전자공학" selected>전자공학</option>
		<option value="기계공학" selected>기계공학</option>
	</select><br>
	<button>입력완료</button>
	
	
	</form>
</body>
</html>