<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--  선언문 태그에 문자형 전역변수를 선언하여 '~~' 저장하기 
		  문자형 변수 값을 반환하는 전역 메소드 작성 
		  전역메소드 호출해서 문자형 변수 값 출력 	
	 -->
	 <%! // 선언문 태그 
		String greeting = "Hello, Java Server Pages";
	    public String getString(){
	    	return greeting;
	    }
	 %>
	 <h3><%=getString()%></h3>
</body>
</html>