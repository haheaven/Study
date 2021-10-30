<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@page import="java.net.URLEncoder"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<% 
 	 request.setCharacterEncoding("UTF-8");
	 String userId = request.getParameter("userId");
	 String userPw = request.getParameter("userPw");
	
		if ( userId.equals("admin") && userPw.equals("1234")){
			response.sendRedirect("response01_success.jsp");
		}  else {
			
			response.sendRedirect("response01_fail.jsp?userId="+URLEncoder.encode(userId, "UTF-8")+"&userPw="+URLEncoder.encode(userPw, "UTF-8"));
		}
		
	%>

</body>
</html>