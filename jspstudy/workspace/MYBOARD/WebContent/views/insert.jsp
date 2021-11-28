<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>selectOne</title>
 <link rel="stylesheet" type="text/css" href="css/BoardDetail.css">
	 <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
 	 <link rel="stylesheet" type="text/css" href="css/header.css">
 <script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <%@ include file="/layout/header.jsp" %>
	<h2 id="board"><a href="selectAllList.do">공지사항 등록</a></h2>


	<c:if test="${user.id == 'admin'}">

		<form id="f1"  method='post' action="insert.do">
			<table class="bInsert">
					<tr>
						<td>카테고리</td>
						<td id="td">
						
							<select name="category"   id="category" >
								<option value="배송">배송</option>
								<option value="교환">교환</option>
								<option value="환불">환불</option>
								<option value="기타">기타</option>
							</select>
						</td>
					</tr>	
					<tr>
						<td>제목</td>
						<td><input type="text" name="title" id="title"></td>
					</tr>	
					<tr>
						<td>글쓴이</td>
							<td><input type="text" name="writer" value="${user.id}" readonly></td>
					</tr>
					<tr>
						<td>내용</td>
						<td><textarea name="content" cols="65" rows="14"> </textarea></td>
					</tr>
					<tr>
						<td colspan="3" class="btn_td">
							<button id="insert_btn">등록</button>
							<input  id="reset" type="reset" value="다시 작성">
						</td>
					</tr>
			</table>
		</form>
	  </c:if>
	  
</body>
</html>