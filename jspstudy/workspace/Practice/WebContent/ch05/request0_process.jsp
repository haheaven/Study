<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
</head>
<body>

	<%
	   request.setCharacterEncoding("UTF-8");
	   String name = request.getParameter("name");
	   String age = request.getParameter("age");
	   if ( name == null || name.isEmpty()){
		   name = "hyebin";
	   }
	   if( age == null || age.isEmpty()){
		   age = "26";
	   }
	%>
	일반 form에 있는 parameter로 받기 
	<p>이름은 <%=name %></p>
	<p>나이는 <%=age %></p>
	<hr>
	<%
	  String name2 = (String)request.getAttribute("name2");
	  String age2 = (String)request.getAttribute("age2");
	 	
	%>
	attr로 속성 지정해서 받기 -> el 사용 
	<p>이름은 ${name2}</p>
	<p>나이는 ${age2}</p>


</body>
</html>