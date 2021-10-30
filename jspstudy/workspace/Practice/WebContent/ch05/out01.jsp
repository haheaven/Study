<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	out.println("오늘 날짜 및 시각 : "+ "<br>");
	out.println(java.util.Calendar.getInstance().getTime());
%>