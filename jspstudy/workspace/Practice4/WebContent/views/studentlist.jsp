<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<link href="css/list.css" rel="stylesheet" type="text/css">
	<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
	<script>
	   $(document).ready(function(){
	
			$("#f1").on('submit',function(event){
				if( $('#name').val() == '' ){
					alert('이름은 필수입니다.');
					
					$('#name').focus();
					event.preventDefault();
					return false;	
				} else if( isNaN($('#grade').val() ) || $('#grade').val() == '' ||  $('#grade').val()  < 0 ||  $('#grade').val() > 4 ){
					alert('학년은 1~4까지 입력 가능합니다.');
					$('#grade').focus();
					event.preventDefault();
					return false;	
				} else if( $('#major').val() == '' ){
					alert('전공은 필수입니다.');
					$('#major').focus();
					event.preventDefault();
					return false;
				} 
				
				else {

					$.ajax({
						url : "/Practice4/insert.do",
						dataType : 'json',
						type: 'post',
						data : $('form').serialize(),
						success: function(resData){
							alert('등록성공');
						},
						error :function(xhr, ajaxOptions, thrownError) {
					        console.log(xhr.status);
					        console.log(thrownError);
						}
						
					}) // ajax
			
				
				return true;  // event가 true
			  }		
				
			}) // f1	    
	   }); // end of load
	   

	</script>


<title>Insert title here</title>
</head>
<body>
<form id="f">
	<h2>관리자 시스템</h2>
		<h4>학생 리스트</h4>
		<p>학생 수 : ${count}</p>
		<table class="t1">
			<thead>
				<tr>
					<td>학번</td>
					<td>이름</td>
					<td>학년</td>
					<td>전공</td>
					<td>성적</td>
				</tr>
			</thead>
			<tbody>
				<c:if test="${count eq 0}">
				<tr>
					<td colspan="5">학생이 없습니다.</td>
				</tr>
				</c:if>
				<c:if test="${count gt 0}">
					<c:forEach var="student" items="${list}">
						<tr>
							<td><a href="/Practice4/select.do?stuNo=${student.stuNo}">${student.stuNo}</a></td>
							<td>${student.name}</td>
							<td>${student.grade}</td>
							<td>${student.major}</td>
							<td>${student.score}</td>
						</tr>
					</c:forEach>
				</c:if>
			</tbody>
		</table>
</form>	
	
	<h2>학생 등록</h2>
	<form id="f1">
		<table id="t2">
		
		<tbody>
			<tr>
				<td><label for="name">이름</label><td>
				<td><input type="text" name="name" id="name"></td>		
			</tr>
			<tr>
				<td><label for="grade">학년</label><td>
				<td><input type="text" name="grade" id="grade"></td>		
			</tr>
			<tr>
				<td><label for="addr">주소</label><td>
				<td><input type="text" name="addr" id="addr"></td>		
			</tr>
			<tr>
				<td><label for="email">이메일</label><td>
				<td><input type="text" name="email" id="email"></td>		
			</tr>
			<tr>
				<td><label for="score" >성적</label><td>
				<td><input type="text" name="score" id="score" size="3"></td>		
			</tr>
			<tr>
				<td><label for="major" >전공</label><td>
				<td><input type="text" name="major" id="major" ></td>		
			</tr>
		
		</tbody>
		</table>
			<button>등록</button>
	</form>

</body>
</html>