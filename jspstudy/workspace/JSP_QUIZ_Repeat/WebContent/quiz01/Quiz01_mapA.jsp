<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<%
			Map<String, String> sites = new HashMap<>();
			sites.put("구글", "https://www.google.com");
			sites.put("네이버", "https://www.naver.com");
			sites.put("다음", "https://www.daum.net");
			sites.put("네이트", "https://www.nate.com");
		%>
		<h3>1. 이동하고자 하는 사이트 명을 선택하고 확인 버튼을 누르세요</h3>
		<form action="Quiz01b.jsp">
	사이트명 : <select name="sites">
			  <% for(Map.Entry<String, String> site : sites.entrySet() ){ %>
				  <option value="<%=site.getValue()%>"><%=site.getKey()%></option>  
			<% }  %>
			  
			</select>
			<button>확인</button>
	     </form>	

		
		
		
		
</body>
</html>