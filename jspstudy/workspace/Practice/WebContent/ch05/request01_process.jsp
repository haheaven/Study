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
 	 request.setCharacterEncoding("UTF-8");
	 String userId = request.getParameter("userId");
	 String userPw = request.getParameter("userPw");
	
		if ( userId == null || userId.isEmpty()){
			userId ="admin";
		}
		if ( userPw == null || userPw.isEmpty()){
			userPw ="1234";
		}
		
	//request.getAttribute("id");
	//request.getAttribute("pw");
	%>

    <p>아이디 : <%=userId %></p>
    <p>비밀번호 : <%=userPw %></p>
	<hr>
	<%-- <p>아이디 : ${id}</p>
    <p>비밀번호 : ${pw}</p>
 --%>

</body>
</html>