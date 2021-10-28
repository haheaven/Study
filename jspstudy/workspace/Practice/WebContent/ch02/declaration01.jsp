<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%! // 선언문  
		int sum =0;
	%>
	<% // 일반 자바 코드
	
		for(int count=0; count<10; count++){
			sum += count;
		}
	%>
	<!-- 표현식은 결과 값만! -->
	<h1><%=sum%></h1>
</body>
</html>