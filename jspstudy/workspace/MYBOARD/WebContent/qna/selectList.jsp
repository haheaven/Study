<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
	 <link rel="stylesheet" type="text/css" href="css/header.css">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	 <link rel="stylesheet" type="text/css" href="css/Board.css">
<script type="text/javascript">
$(document).ready(function(){
	console.log('${page}');
})
</script>
<style type="text/css">
 #f {  width:900px;
 }
	a{ color : black; text-decoration: none; }
		#insert_link {  
			color: black;
			text-align: right;
		 }
	
</style>
</head>
<body>
 <%@ include file="/layout/header.jsp" %>

	<h2 id="board"><a href="selectAllList.qna">QnA</a></h2>
	
	
	<form id="f" method="post"> 
	 	<c:if test="${user != null }">
			<a id="insert_link" href="insertForm.qna">글등록</a>
		</c:if>
	 	<span id="count" >게시물 수 : ${cnt}</span> 
		<table class="table table-hover">
			<thead>
				<tr id="first_tr">
					<td>글번호</td>	
					<td>제목</td>
					<td>글쓴이</td>
					<td>카테고리</td>
					<td>조회수</td>
					<td>등록일</td>
				</tr>
			</thead>
			<tbody>
				<c:if test="${empty list}">
					<tr>
						<td colspan="5">게시물 없습니다.</td>
					</tr>
				</c:if>
				<c:if test="${not empty list}">
					<c:forEach var="qna" items="${list}">
						<tr>
							<td>${qna.idx}</td>	
						<!--<td><a id="a_link" href="/Practice3/select.do?idx=${board.idx}&readCount=${board.readCount+1}">${board.title}</a></td>  -->	
						<td><a id="a_link" href="select.qna?idx=${qna.idx}">${qna.title}</a></td>
							<td>${qna.writer}</td>
							<td>${qna.category}</td>
				            <td>${qna.readCount}</td>
							<td>${qna.register}</td>
						</tr>
					</c:forEach>
				</c:if>
			</tbody>
			<tfoot>
				<tr>
					<td colspan="6" id="page_section">${pageEntity}
					
					</td>
				</tr>
			</tfoot>
		</table>
			
	</form>
	
	<!--  검색 부분  -->
	<div id="search_wrap">
		<form action="search.qna">
			<select name="column">
				<option value="TITLE">제목</option>
				<option value="WRITER">글쓴이</option>
				<option value="CONTENT">내용</option>
				<option value="ALL">제목+글쓴이+내용</option>
			</select>
				<input type="text" name="query">
				<button>SEARCH</button>
		</form>
	</div>
	
	<hr>
	
	
		
</body>
</html>