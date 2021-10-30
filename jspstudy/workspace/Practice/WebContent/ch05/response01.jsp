<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<script type="text/javascript">
  $(document).ready(function(){
		$("#log_form").on("submit", function(event){	
		if( $("#id").val() == ""){
			alert("아이디를 입력하세요.");
			 $("#id").focus();
				event.preventDefault();
				return false;
		}
		else if ( $("#pw").val() == ""){
			alert("비밀번호를 입력하세요.");
			  $("#pw").focus();	
				event.preventDefault();
				return false;
		  }
		return true;
		});
	});
</script>
</head>
<body>
	<form action="response01_process.jsp" method="post" id="log_form">
		<p> 아이디 <input type="text" name="userId" id="id"></p>
		<p> 비밀번호 <input type="password" name="userPw" id="pw"></p>
		<button>로그인</button>
	</form>
</body>
</html>