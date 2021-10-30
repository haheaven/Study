<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<script>
	$(document).ready(function(){
		$("form").on("submit",function(event){
			if( $("input[name=id]").val() == ''){
				alert("아이디 입력하세요");
				$("input[name=id]").focus();
				event.preventDefault();
				return false;
			}
			else if ( $("input[name=pw]").val() == ''){
				alert("비밀번호 입력하세요");
				$("input[name=pw]").focus();
				event.preventDefault();
				return false;
			}
			return true;		
		});
	});
</script>
</head>
<body>

	<form action="request_process.jsp" method="get">
	<label>아이디 : <input type="text" name="id"></label><br><br>
	<label>비밀번호 : <input type="password" name="pw"></label><br><br>
	<button>전송</button>
	</form>

</body>
</html>