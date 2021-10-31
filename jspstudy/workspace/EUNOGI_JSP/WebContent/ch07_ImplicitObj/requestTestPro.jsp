<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	String no = request.getParameter("no");
	String name = request.getParameter("name");
	String grade = request.getParameter("grade");
	String subject = request.getParameter("subject");
%>
	<h2>학생정보</h2>
	<table>
		<tr>
			<td>학번</td>
			<td><%=no %></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><%=name %></td>
		</tr>
		<tr>
			<td>학년</td>
			<td><%=grade %></td>
		</tr>
		<tr>
			<td>선택과목</td>
			<td><%=subject %></td>
		</tr>
	</table>





</body>
</html>