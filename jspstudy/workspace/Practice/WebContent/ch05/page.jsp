<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Insert title here</title>
	<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
</head>
<body>
	<h1>page 객체</h1>			<!--  page와 pageContext 차이 알아보기 위한 jsp  -->
		<%= this.getServletInfo() %>   <!--  jsp 패이지 객체 정보 반환(자기자신의 객체)하기 때문에 this 사용가능  -->
	
	<hr>
	
	<h1>pageContext 객체</h1>      <!--  페이지를 구성함  -->
		<%
			pageContext.setAttribute("name", "하혜빈");
			pageContext.setAttribute("age", 26);
		%>
		<p>이름 : <%=pageContext.getAttribute("name")%></p>
		<p>나이 : <%=pageContext.getAttribute("age")%></p>
</body>
</html>