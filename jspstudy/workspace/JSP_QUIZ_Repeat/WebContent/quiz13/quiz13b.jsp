<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<% request.setCharacterEncoding("utf-8"); %>
	
	<ul>
		<li>국어 : ${param.kor }점</li>
		<li>영어 : ${param.eng}점</li>
		<li>수학 : ${param.mat}점 </li>
		
		<c:set var="avg" value="${(param.mat +param.kor+param.eng)/3 }"/>
		<li>평균 :${avg}점 </li>
		
		<li>학점 :
		<c:choose>
			<c:when test="${avg-90>0}">A학점</c:when>
			<c:when test="${avg-80>0}">B학점</c:when>
			<c:when test="${avg-70>0}">C학점</c:when>
			<c:when test="${avg-60>0}">D학점</c:when>
			<c:otherwise>F학점</c:otherwise>
		</c:choose>
		</li>
		<li>합격유무 :
		<c:if test="${avg-60>0}">합격</c:if>
		<c:if test="${avg-60<0}">불합격</c:if>
		</li>
		
	
	</ul>

</body>
</html>