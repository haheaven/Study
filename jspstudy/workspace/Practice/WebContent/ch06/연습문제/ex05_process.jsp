<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.io.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 


	request.setCharacterEncoding("utf-8");
	/* /* Enumeration paramNames = request.getParameterNames();
	while( paramNames.hasMoreElements()){
		String name = (String)paramNames.nextElement();
		out.print("<p>" +name +": " );
		String paramValue = request.getParameter(name);
		out.println(paramValue + "</p>");
	
	} */ 
	
	Enumeration pName = request.getParameterNames();
	while(pName.hasMoreElements()){
		String name = (String)pName.nextElement();
		out.print("<p>"+name + ": ");
		String value = request.getParameter(name);
		out.print(value + "</p>");
	}
	
	
	
%>





</body>
</html>