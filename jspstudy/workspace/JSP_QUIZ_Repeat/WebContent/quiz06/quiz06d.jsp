<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.net.*" %>

	<%
	request.setCharacterEncoding("UTF-8"); 
	
	String year = request.getParameter("year");
	String day = request.getParameter("day");
	String month = request.getParameter("month");
	String marriage = request.getParameter("marriage");
	String job = request.getParameter("job");
	
	
	
	Cookie c7 = new Cookie("birth", URLEncoder.encode(year +"년" +month+"월"+day+"일", "UTF-8"));
	c7.setMaxAge(60*60);
	response.addCookie(c7);
	Cookie c8 = new Cookie("marriage",marriage);
	c8.setMaxAge(60*60);
	response.addCookie(c8);
	Cookie c9 = new Cookie("job",URLEncoder.encode(job, "UTF-8"));
	c9.setMaxAge(60*60);
	response.addCookie(c9);

	response.sendRedirect("quiz06e.jsp");

%>
	
	
		
