<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
 <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
 <link rel="stylesheet" type="text/css" href="css/header.css">
 <script>
 	$(document).ready(function(){
 		fnSubmit();
 		fnIdCheck();
 		fnPwCheck();	
 	});
	let idResult = false;
	let PwResult = false;
 		function fnIdCheck(){
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
 		//	console.log(idResult);
 	 		return idResult;
 		 }) 	
	}
 			
 		function fnPwCheck(){
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
 				if( idResult == false ){
 					event.preventDefault();  
 		            return false;    
 				} else if (	PwResult == false ) {
 					 event.preventDefault();  
 		            return false;    
 				}
 				return true;
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
 	#login_form {
 		width : 500px;
 		margin: 0 auto;
 	}
 	.login_btn { margin-left: 130px;	}
	a{ color : black; text-decoration: none; }
		#logout_link {
		text-align: right;
	}
 </style>
</head>
<body>
 <%@ include file="layout/header.jsp" %>


	<c:if test="${user != null}">
	   <div id="login_success_box">
			<h3>${user.id}님 반갑습니다.</h3>
		</div>
	</c:if>
	
	 <c:if test="${user == null}">
		<form method="post"  action="login.member" id="login_form" >
			 <div class="mb-3">
				<label for="writer" class="form-label">아이디</label> 
				<input type="text" name="id" placeholder="id" class="form-control" id="id" autofocus>
				<span id="id_check"></span><br>
			</div>
			 <div class="mb-3">
				<label for="pwd"  class="form-label">비밀번호</label>
				<input type="password" name="pw"  placeholder="pw" id="pw" class="form-control" aria-describedby="passwordHelpBlock">
				<span id="pw_check"></span><br>
			</div>
			
			<div class="btn">
				<button class="btn btn-primary login_btn"  >로그인</button>&nbsp;
				<input class="btn btn-primary" type="button" value="회원가입" onclick="location.href='/MYBOARD/joinForm.member'">
			</div>	
		</form>
	</c:if>
	
 
</body>
</html>