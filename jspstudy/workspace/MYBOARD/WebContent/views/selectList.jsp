<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
	 <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	 <link rel="stylesheet" type="text/css" href="css/header.css">
	 <link rel="stylesheet" type="text/css" href="css/Board.css">
	<script type="text/javascript">
		$(document).ready(function(){
console.log('${page}');
			$('#insert_btn').on('click',function(){
				$('#title').focus();          // 글등록하기 누르면 글등록폼제목으로 포커스이동
			});
			
			$('#f1').on('submit',function(){   // f1서브밋 누르면 ajax실행
			  $.ajax({
				url : "insert.do",
				type : 'post',
				dataType: 'json',
				data : $('#f1').serialize(),
				success: function(resData) {
					alert("등록 성공 ");
				},
				error : function(xhr, ajaxOptions, thrownError) {
			        console.log(xhr.status);
			        console.log(thrownError);
				}
			}); // end of ajax
		}); // form
	}); // load

	</script>
<style>
	.table tbody tr td:nth-of-type(1) { width: 80px; padding-left: 10px; }
	.table tbody tr td:nth-of-type(2) { width: 350px; padding-left: 10px; }
	.table tbody tr td:nth-of-type(3) { width: 120px; padding-left: 10px; }
	.table tbody tr td:nth-of-type(4) { width: 100px; padding-left: 10px; }
	.table tbody tr td:nth-of-type(5) { width: 80px; padding-left: 10px; }
	.table tbody tr td:nth-of-type(6) { width: 100px; padding-left: 10px; }
</style>


</head>
<body>
 <%@ include file="/layout/header.jsp" %>
	<h2 id="board"><a href="selectAllList.do">공지사항</a></h2>
	
	<form id="f" method="post"> 
		<c:if test="${user.id == 'admin' }">
			<a id="insert_link" href="insertForm.do">글등록</a>
		</c:if>
	 	 <span id="count" >게시물 수 : ${cnt}</span> 
		<table  class="table table-hover">
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
				<c:if test="${ not empty list}">
					<c:forEach var="board" items="${list}">
						<tr>
							<td>${board.idx}</td>	
						<!--<td><a id="a_link" href="/Practice3/select.do?idx=${board.idx}&readCount=${board.readCount+1}">${board.title}</a></td>  -->	
						<td><a id="a_link" href="select.do?idx=${board.idx}">${board.title}</a></td>
							<td>${board.writer}</td>
							<td>${board.category}</td>
				            <td>${board.readCount}</td>
							<td>${board.register}</td>
						</tr>
					</c:forEach>
				</c:if>
				
			</tbody>
			<tfoot>	
				<tr>
					<td colspan="6" id="page_section">${pageEntity}</td>
				</tr>
			</tfoot>
			
		</table>
		
	</form>
	
	<div id="search_wrap">
		<form action="search.do" method="post" >
		    <select name="column" >
				<option value="TITLE">제목</option>
				<option value="CONTENT">내용</option>
				<option value="ALL">제목+내용</option>
			</select>
			<input type="text" name="query" style="width:350px; ">
			<button id="search_box">SERCH</button>
		</form>
	</div>	

  
	  
</body>
</html>