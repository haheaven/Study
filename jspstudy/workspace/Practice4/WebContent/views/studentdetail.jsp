<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<link href="css/detail.css" rel="stylesheet" type="text/css">
<script>
	$(document).ready(function(){
		$('#update').on('click', function(){
			alert("입력란이 해제되었습니다.")
			$("#major").removeAttr('readonly');
			$("#addr").removeAttr('readonly');
			$("#email").removeAttr('readonly');
			$("#score").removeAttr('readonly');
			$("#update_check").show();
			$("#update").hide();
			
			$("#update_check").on('click',function(){
				$.ajax({
					url : "/Practice4/update.do",
					dataType: "json",
					type:'post',
					data: $('#f').serialize(),
					success: function(resData){
						alert("수정성공" );
					},
					error : function(xhr, ajaxOptions, thrownError) {
				        console.log(xhr.status);
				        console.log(thrownError);
					}
				}); // ajax
			})	
		})
		
		
	}) // load 
</script>

</head>
<body>
<h2>${student.name} 정보</h2>
	<form id="f">
	<table>
		<thead>
			<tr>
				<td class="no">학번</td>
				<td class="name">이름</td>
				<td class="grade">학년</td>
				<td>전공</td>
				<td>주소</td>
				<td>이메일</td>
				<td  class="grade_score" >성적</td>
				<td>입학일</td>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td class="no"><input class="line" type="text" id="stuNo" name="stuNo" readonly value="${student.stuNo}" size="10"></td>
				<td class="name"><input class="line"  type="text" name="name" readonly value="${student.name}" size="10"></td>
				<td class="grade_score" ><input class="line"   type="text" name="grade" readonly value="${student.grade}" size="4"></td>
				<td><input type="text" id="major" name="major" readonly value="${student.major}"></td>
				<td><input type="text" id="addr"  name="addr" readonly value="${student.addr}"></td>
				<td><input type="text" id="email"  name="email" readonly value="${student.email}"></td>
				<td  class="grade_score" class="line"  ><input type="text" id="score"  name="score" readonly value="${student.score}"  size="4"></td>
				<td><input type="text" name="register" class="line"  readonly value="${student.register}" size="10"></td>
			</tr>
		</tbody>
		<tfoot>
			<tr>
				<td colspan="8">
					<input  class="btn" id="update" type="button" value="수정하기">
					<input  class="btn" id="update_check" type="button" value="수정완료" style="display:none">
					<input  class="btn" id="delete"  type="button" value="삭제" onclick="location.href='/Practice4/delete.do?stuNo=${student.stuNo}'">
					<input  class="btn" id="reset"  type="reset" value="다시작성">
					<input  class="btn" id="list"  type="button" value="리스트" onclick="location.href='/Practice4/selectList.do'">
				</td>
			</tr>
		</tfoot>
	
	</table>
	</form>
</body>
</html>