<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="java.text.*" %>
<%@ page import="java.time.*" %>
<%@ page import="java.time.format.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

<title>Welcome</title>
</head>
<body>

	<%@ include file="menu.jsp" %>
	<%!
 		String greeting = "웹 쇼핑몰에 오신 것을 환영합니다.";
		String tagline = "Welcome to Web Market";
	%>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">
				<%=greeting %>
			</h1>
		</div>
	</div>
	<div class="container">
		<div class="text-center">
			<h3>
				<%= tagline %>
			</h3>
			<%
				/* long timestamp = System.currentTimeMillis();
				Date date = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat();
				sdf.applyPattern("h:mm:ss a");
				String now = sdf.format(date); */
				response.setIntHeader("Refresh",5);
				String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("h:mm:ss a"));
				out.println("현재 접속 시각: "+now);
			%>
		</div>
		<hr>
	</div>
	<%@ include file="footer.jsp" %>
		
		
</body>
</html>