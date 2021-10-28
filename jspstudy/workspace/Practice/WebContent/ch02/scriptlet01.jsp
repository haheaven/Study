<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 
		스크립틀릿 태그를 이용해서 java util date 형 지역변수에 현재 날짜 저장
		현재 날짜 출력하기 
	 -->
	 <% // 스크립틀릿태그!(일반 자바로직)
	   java.util.Date date = new java.util.Date();
	   out.println(date);
	 %>
</body>
</html>