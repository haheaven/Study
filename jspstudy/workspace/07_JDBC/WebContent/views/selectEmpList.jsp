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
 	<div>
 			<h1>전체 사원 목록</h1>
 			<table border="1">
 				<thead>
 					<tr>
 					<td>사원번호</td>
 					<td>사원명</td>
 					<td>삭제</td>
 					</tr>
 				</thead>
 				<tbody>
 					<c:forEach var="emp" items="${empList}">
 						<tr>
 							<td>${emp.num}</td>
 							<td>${emp.name}</td>
 							<td> x</td>
 						</tr>
 					</c:forEach>
 				</tbody>
 			</table>
 	</div>
</body>
</html>