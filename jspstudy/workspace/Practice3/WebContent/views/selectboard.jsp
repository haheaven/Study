<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>selectOne</title>
 <link rel="stylesheet" type="text/css" href="css/bBoard1.css">
 <script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<script>
	$(document).ready(function(){
		$('#update').on('click',function(){
			if( confirm('수정이 가능합니다.')){
				$('#reset').show();
				$('#realupdate').show();
				$('#delete').show();
				$(this).hide();
				$("#title").removeAttr("readonly");
				$("#content").removeAttr("readonly");
		
			$('#realupdate').on('click',function(){
				$.ajax({
					url : "/Practice3/update.do",
					type:"post",
					dataType:'json',
					data: $('form').serialize(),
					success: function(resData){
							alert('수정성공');
					},
					error:  function(xhr, ajaxOptions, thrownError) {
				        console.log(xhr.status);
				        console.log(thrownError);
					}
				}); // ajax		
			 });//real
			}; // if
		})	
	})

</script>
</head>
<body>
<h2>게시판</h2>
	<form >
	
		 <table>
		 	<tr>
		 	<td>조회수
				<input id="hit" type="text" name="readCount" value="${board.readCount}" readonly>
		 	</td>
		 	
		 	<td><span id="regi">등록일</span>
		 	<input  id="register" type="text" name="register" value="${board.register}" readonly></td>
		 	</tr>
		 
		 		<tr>
					<td>글쓴이</td>
						<td><input type="text" name="writer" value="${board.writer}" readonly>
						<input type="hidden" name="idx" value="${board.idx}">
						</td>
						
				</tr>
				<tr>
					<td>제목</td>
					<td colspan=2>
					   <input type="text" name="title" id="title" value="${board.title}" readonly >
					</td>
				</tr>	
		
				<tr>
					<td>내용</td>
					<td >
						<textarea name="content" readonly  cols="66" rows="14" id="content"> ${board.content} </textarea>
					</td>
				</tr>
				<tr>
					<td colspan="2" class="btn_td">
						<input class="btn1" id="update" type="button" value="수정하기" >
						<input  id="realupdate" type="button" value="수정완료">
						<input  id="reset" type="reset" value="다시 작성">
						<input  id="delete" type="button" value="삭제" onclick="location.href='/Practice3/delete.do?idx=${board.idx}'">
						<input class="btn1"  id="move" type="button" value="게시판 이동" onclick="location.href='/Practice3/selectAllList.do?hit=${hit}'">
					</td>
				</tr>
		</table>
	</form>
</body>
</html>