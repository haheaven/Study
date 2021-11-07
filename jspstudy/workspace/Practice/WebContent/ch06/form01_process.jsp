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
	
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String phone1 = request.getParameter("phone1");
		String phone2 = request.getParameter("phone2");
		String phone3 = request.getParameter("phone3");
		String gender = request.getParameter("gender");
		String[] hobbies = request.getParameterValues("hobbies");
		String content = request.getParameter("content");
		
	%>
	<p>아이디 : <%=id %></p>
	<p>비밀번호 : <%=pw %></p>
	<p>이름 : <%=name %> </p>
	<p>연락처 : <%=phone1 %> <%=phone2 %> <%=phone3 %> </p>
	<p>성별 :  <%=gender %></p>
	<p>취미: 
	<% 
	if(hobbies != null){
		for(String hobby : hobbies)
			out.println(hobby+" ");
		} 
	
		%>

	
	
	
	</p>
	<p>가입 인사 :  <%=content %></p>



</body>
</html>