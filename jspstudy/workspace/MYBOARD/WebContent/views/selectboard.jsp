<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>selectOne</title>
 <script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
 <link rel="stylesheet" type="text/css" href="css/BoardDetail.css">
 <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
 <link rel="stylesheet" type="text/css" href="css/header.css">
<script>
	$(document).ready(function(){
		fnSelectReply();
		fnInsertReply();
		fnUpdateInsertBoard();
		
		if( '${user.id}' == '${board.writer}'){
			$("#content").removeAttr('readonly');
			$("#title").removeAttr('readonly');
		}
		
	}); // load
	
	
	// 게시글 수정 
	function fnUpdateInsertBoard() {
		$('#update').on('click',function(){
				$.ajax({
					url : "update.do",
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
			})		
	}
	// 댓글삽입
	function fnInsertReply(){	
		$('#f1').on('submit',function(event){	
			if( $("#comment_writer").val() == '' ){
				alert('로그인 후 이용가능합니다');
				$("#comment_content").val('');
				return false;
			}		
			// 빈값 서브밋금지  -->  writer는 로그인한 사람 적용시키기!!!
				if( $("#comment_content").val() == '' ){
					alert('입력은 필수입니다.');
					$("#comment_content").focus();
					event.preventDefault();
					return false;
			}  
				$.ajax({
					url : 'insertReply.do',
					type : 'post',
					data : $('#f1').serialize(),  // 폼의 모든 요소를 파라미터로 넘김 
					dataType : 'json',
					success : function(resData){   
						if( resData.result > 0){
							alert('댓글 등록 성공');      
							fnSelectReply();	
						}else{
							aler('댓글등록실패')
						}
					},
					error : function(xhr, ajaxOptions, thrownError){
							 console.log(xhr.status);
					        console.log(thrownError);
					}
				});
		  });
	} // function	
	
	// 댓글 리스트  - 각 게시물에 맞는 댓글을 가져와야하므로 게시글 번호 데이터 전송하기
	function fnSelectReply(){
			
			$.ajax({
				url : "listReply.do",
				type:"post",
				dataType:'json',
				data: 'idx='+ $("#comment_idx").val(),
				success: function(resData){
					if(resData.length  == 0 ){                   
							$('<tr>')
							.append( $('<td colspan="3">').text('댓글이 없습니다'))
							.appendTo("#tbody");
						} else {
							for(let i=0; i<resData.length; i++){
							$('<tr>')
							.append( $('<td class="comment_writer">').text(resData[i].writer) )
							.append( $('<td class="comment_content">').text(resData[i].content) )
							.append( $('<td class="comment_register">').text(resData[i].register) )
							.appendTo("#tbody");
						  } //for
					} // else
				},
				error:  function(xhr, ajaxOptions, thrownError) {
			        console.log(xhr.status);
			        console.log(thrownError);
				}
			}); // ajax			
		} // funciotn
</script>
<style type="text/css">
	a{ color : black; text-decoration: none; }
	#reset, #realupdate, #delete{
		width: 120px;
		height: 30px;
	}
	
</style>
</head>
<body>
 <%@ include file="/layout/header.jsp" %>

<h2><a href="selectAllList.do">공지사항</a></h2>
	<form  method="post">
	
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
						<td>
							<input type="text" name="writer" value="${board.writer}" readonly>
							<input type="hidden" name="idx" value="${board.idx}">
							<input type="hidden" id="pw" value="${user.pw}">
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
					 <c:if test="${user.id == board.writer}">
						<input class="btn1 btn btn-primary" id="update" type="button" value="수정하기" >
						<input class="btn btn-primary" id="reset" type="reset" value="다시 작성">
						<input class="btn btn-primary" id="delete" type="button" value="삭제" onclick="location.href='delete.do?idx=${board.idx}'">
					</c:if>
					</td>
				</tr>
		</table>
	</form>
	

	<!--  댓글 구역이다.  -->
	
	
	<br><br>
	<div>
		<table id="comment_table">
			<thead>
				<tr>
					<th class="comment_writer">작성자</th>
					<th class="comment_content">댓글</th>
					<th class="comment_register">날짜</th>
				</tr>
			</thead>
		<tbody id="tbody">
			
		</tbody>
		
		</table>
	</div>
	<br>
	<div id="comment">
	
		<form id="f1" method="post">
			<input type="text" placeholder="작성자" name="writer" id="comment_writer" style="width:70px;" value="${user.id }">
		    <input type="text" placeholder="댓글을 입력주세요" name="content" id="comment_content" >
			<input type="hidden" name="idx" value="${board.idx}" id="comment_idx">
			<button>입력</button>
		</form>
	</div>	
</body>
</html>