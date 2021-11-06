<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.net.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<%!

		// 함수를 정의해서 쿠키 정보를 갖고온다.. 쿠키가 많으므로 쿠키이름을 하나씩 비교하며 값을 갖고 오는 방법보다 함수를 이용하는 것이 더 효율적임 
		public String  getCookieValue(Cookie[] cookies, String Cookiename){
			String result = null;
			
			try {
				 if ( cookies != null || cookies.length!=0){  // 쿠키 있을때만 갖고오기 
					 for(Cookie cookie : cookies){
						 if(cookie.getName().equals(Cookiename)){
							 result = URLDecoder.decode(cookie.getValue(), "UTF-8");
						 }
					 }
				 }
			} catch(Exception e){
				
			} 
			return result;	
		}
		%>
		<% Cookie[] cookies = request.getCookies();  	%>
		
		
		<h3>가입내용</h3>
		<ul> 
			<li>아이디  : <%=getCookieValue(cookies, "id") %></li>
			<li>비밀번호 : <%=getCookieValue(cookies, "pw") %></li>
			<li>이름 : <%=getCookieValue(cookies, "name") %></li>
			<li>주소 : <%=getCookieValue(cookies, "addr") %></li>
			<li>전화번호 : <%=getCookieValue(cookies, "tel") %></li>
			<li>이메 : <%=getCookieValue(cookies, "email") %></li>
			<li>생년월일 : <%=getCookieValue(cookies, "birth") %></li>
			<li>결혼여부 : <%=getCookieValue(cookies, "marriage") %></li>
			<li>직업     : <%=getCookieValue(cookies, "job") %></li>
		</ul>
		<a href="quiz06f.jsp">쿠키 당장 지우러가기</a>
</body>
</html>