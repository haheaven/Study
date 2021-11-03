<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	session.invalidate();
	
	Cookie[] cookies = request.getCookies();
    if ( cookies != null && cookies.length != 0){
    	for(Cookie cookie : cookies){
    		if(cookie.getName().equals("userId") || cookie.getName().equals("userName")){
    			cookie.setMaxAge(0);
    			response.addCookie(cookie);
    		}
    	}
    }
	
	%>	


	<script>
	
	alert("로그아웃 되셨습니다.");
	location.href ="daum_login.jsp";
	
	</script>


</body>
</html>