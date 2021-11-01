<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<%
			Cookie[] cookies = request.getCookies();
			if( cookies != null && cookies.length!=0){
				for(Cookie cookie : cookies){
					if( cookie.getName().equals("id")){
						session.setAttribute("id", cookie.getValue());
					}
					if( cookie.getName().equals("name")){
						session.setAttribute("name", cookie.getValue());
					}
				}
			}
		
		%>
		<h2>${userName}님 환영합니다. </h2>
	<br>
      <a href="daum_login.jsp">로그아웃</a>


</body>
</html>