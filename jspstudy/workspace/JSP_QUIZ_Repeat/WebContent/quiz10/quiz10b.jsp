<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="quiz10.Board" %>
<%@ page import="java.sql.*" %>
<%@page import="java.time.LocalDate"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
			Board board = new Board();
			board.setTitle(request.getParameter("title"));
			board.setWriter(request.getParameter("writer"));
			board.setContent(request.getParameter("content"));
			
			Date date = Date.valueOf(LocalDate.now()); 
			board.setDate(date);	
			
			pageContext.setAttribute("board", board);
	%>
	
	제목 : ${board.title} <br>
	작성 : ${board.writer}<br>
	내용 : ${board.content}<br>
	게시 : ${board.date}



</body>
</html>