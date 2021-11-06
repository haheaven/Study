<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.net.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8"); 
		
		String addr = request.getParameter("addr");
		String tel = request.getParameter("tel");
		String email = request.getParameter("email");
	
		Cookie c4 = new Cookie("addr", URLEncoder.encode(addr, "utf-8"));
		c4.setMaxAge(60*60);
		response.addCookie(c4);
		Cookie c5 = new Cookie("tel", URLEncoder.encode(tel, "utf-8"));
		c5.setMaxAge(60*60);
		response.addCookie(c5);
		Cookie c6 = new Cookie("email", URLEncoder.encode(email, "utf-8"));
		c6.setMaxAge(60*60);
		response.addCookie(c6);
	
	
	%>

	<h2>추가정보를 입력하세요</h2>
		<form action="quiz06d.jsp" method="post">
			<label for="year">생년월일 </label>
			<input type="text" name="year" id="year" size="5" maxlength="4"> 
			<select name="month">
				<c:forEach var="month" begin="1" end="12" step="1">
					<option value="${month}">${month}</option>
				</c:forEach>
			</select>
			<select name="day">
				<c:forEach var="day" begin="1" end="31" step="1">
					<option value="${day}">${day}</option>
				</c:forEach>
			</select><br>
			결혼여부 
			<input type="radio" name="marriage" value="미혼" checked>미혼 
			<input type="radio" name="marriage" value="기혼">기혼<br>
			
			직업
			<select name="job">
				<option value="developer">개발자</option>
				<option value="teacher">선생님</option>
				<option value="designer">디자이너</option>
				<option value="doctor">의사</option>
			</select><br>
			<button>확인</button>
		</form>


</body>
</html>