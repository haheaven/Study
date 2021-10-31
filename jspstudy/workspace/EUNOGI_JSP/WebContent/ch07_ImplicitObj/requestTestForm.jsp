<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>학번 학년 학년 선택과목을 입력하는폼</h1>
	<form action="requestTestPro.jsp">
	<label>학번 : <input type="text" name="no"> </label><br>
	<label>이름 : <input type="text" name="name"> </label><br>
	학년 : 
	<input type="radio" name="grade" value="1" checked>1학년&nbsp;
	<input type="radio" name="grade" value="2" checked>2학년&nbsp;
	<input type="radio" name="grade" value="3" checked>3학년&nbsp;
	<input type="radio" name="grade" value="4" checked>4학년<br>
	선택과목 : 
	<select name="subject" >
		<option value="JAVA">JAVA</option>
		<option value="JSP">JSP</option>
		<option value="SERVLET">SERVLET</option>
	</select><br>
	
	<button>입력완료</button>
	</form>



</body>
</html>