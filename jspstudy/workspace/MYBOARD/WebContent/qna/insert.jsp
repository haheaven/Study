<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
	 <link rel="stylesheet" type="text/css" href="css/header.css">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	 <link rel="stylesheet" type="text/css" href="css/Board.css">
</head>
<body>
 <%@ include file="/layout/header.jsp" %>
<h3>QnA 작성</h3>
	<form id="f1"  method='post' action="insert.qna">
		<table class="bInsert" >
				<tr>
					<td>카테고리</td>
					<td id="td">
					
						<select name="category" id="category" >
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
					<td>
						<input type="text" name="writer" value="${user.id}" readonly>
					</td>
				</tr>
				<tr>
					<td>내용</td>
					<td><textarea name="content" cols="65" rows="14"> </textarea></td>
				</tr>
				<tr>
					<td colspan="3" class="btn_td">
						<button>등록</button>
						<input  id="reset" type="reset" value="다시 작성">
						<input  id="go_login"  type="button" value="로그아웃" onclick="location.href='logout.member'">
					</td>
				</tr>
		</table>
	</form>
</body>
</html>