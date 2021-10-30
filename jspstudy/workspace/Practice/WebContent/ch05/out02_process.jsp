<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<%
	out.println("아이디 : "+request.getParameter("userId")+"<br>");
	out.println("비밀번호 : "+request.getParameter("userPw"));

%>