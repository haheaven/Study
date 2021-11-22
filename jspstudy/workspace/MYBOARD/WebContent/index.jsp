<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
 <link rel="stylesheet" type="text/css" href="css/index.css">
 <script>
 	$(document).ready(function(){
 		fnIdCheck();
 		fnPwCheck();	
 		fnSubmit();
 	});
 	
 		function fnIdCheck(){
 			let idResult = false;
 		 $('#id').on('blur',function(){
 			if( $('#id').val() == ''){
 				$('#id_check').text('아이디는 필수입력입니다.');
 				$('#id_check').addClass('red_msg');
 				 $('#id').focus();
 				 idResult = false;
 			}	else if ( $('#id').val().length > 0){
 				$('#id_check').text('');
 				$('#id_check').removeClass('red_msg');
 				idResult = true;
 			}
// 			console.log(idResult);
 	 		return idResult;
 		 })
 		
 		}
 			
 		function fnPwCheck(){
 			let PwResult = false;
 		 $('#pw').on('blur',function(){
 		    if ( $('#pw').val() == ''){
 				$('#pw_check').text('비밀번호는 필수입력입니다.');
 				$('#pw_check').addClass('red_msg');
 				 $('#pwd').focus();
 				 PwResult = false;
 			} else {
 				PwResult = true;
 			}
 		 //console.log(PwResult);
			return PwResult;
 		 });
 		
 		}
 		
 		function fnSubmit(){
 			$('#login_form').on('submit',function(event){
 				if( fnIdCheck() == false ||  fnPwCheck() == false ){
 					event.preventDefault();
 	 				return false;
 				} return true;
 		   });
 		}
 	
 
 </script>
 <style>
 	.red_msg {
 		color : red;
 		font-size : 12px;
 	}
 	#login_success_box{
 	   width: 300px;
 	   margin: 0 auto;
 	}
 	#qna_btn, #move_btn {
 		width: 120px;
 	}
 
 </style>
</head>
<body>
	<h3>로그인 PAGE</h3>
	<c:if test="${user != null}">
	   <div id="login_success_box">
			<h3>${user.name}님 반갑습니다.<input type="button" value="로그아웃" onclick="location.href='logout.member'"></h3>
			<input type="button" value="Q&A 이동" id="qna_btn" onclick="location.href='/MYBOARD/selectAllList.qna'">
			<input type="button" value="공지사항으로 이동" id="notice_btn" onclick="location.href='selectAllList.do'">

		</div>
	</c:if>
	
	
	
	 <c:if test="${user == null}">
		<form method="post"  action="login.member" id="login_form">
			 <div class="login_box">
				<label for="writer" >아이디</label> <input type="text" name="id" placeholder="id" id="id" autofocus><br>
				<span id="id_check"></span><br>
				<label for="pwd" >비밀번호</label> <input type="password" name="pw"  placeholder="pw" id="pw"><br>
				<span id="pw_check"></span><br>
			</div>
			<div class="btn">
				<button>로그인</button>&nbsp;
				<input type="button" value="회원가입" onclick="location.href='/MYBOARD/joinForm.member'">
			</div>	
		</form>
	</c:if>
	
	
</body>
</html>