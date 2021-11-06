<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	label{
		display: inline-block;
		width:100px;
	}
</style>
<title>Insert title here</title>
</head>
<body>
		<form action="quiz10b.jsp" method="post">

		<label for="title">제목</label> <input type="text" name="title" id="title"><br>
		<label for="writer">작성자</label> <input type="text" name="writer" id="writer"><br>
		<label for="content">내용</label> <input type="text" name="content" id="content"><br>
			
			
		<button>전송 </button>
		</form>


</body>
</html>