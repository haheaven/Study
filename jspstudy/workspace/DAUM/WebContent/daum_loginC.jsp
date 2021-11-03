<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<title>Insert title here</title>
</head>
<body>
		<%
			Cookie[] cookies = request.getCookies();
			if( cookies != null && cookies.length!=0){
				for(Cookie cookie : cookies){
					if( cookie.getName().equals("userId")){
						session.setAttribute("userId", cookie.getValue());
						out.println(cookie.getValue());
					}
					if( cookie.getName().equals("userName")){
						session.setAttribute("userName", cookie.getValue());
					}
				}
			}
			
			
		
		%>
		<h2>${userName}님 환영합니다. </h2>
		
	<br>
      <a href="daum_loginD.jsp">로그아웃</a>


</body>
</html>