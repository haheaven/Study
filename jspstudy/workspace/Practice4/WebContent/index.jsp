<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Insert title here</title>
	<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
	<link href="css/index.css" rel="stylesheet" type="text/css">
<script>
	$(document).ready(function(){
		$('form').on('submit',function(event){
			if( $('#admin').val() != 'admin' || $('#pwd').val() != '1111'){
				alert("관리자가 아닙니다.");
				event.preventDefault();
				return false;
			} else {
				return true;
			}
			
		});
	});
</script>

</head>
<body>
   <!--  로그인 후 리스트로  -->
   <h2>관리자 로그인</h2>
   <form action="/Practice4/selectList.do" method="post">
   	<label for="admin">관리자 </label>
   		<input type="text" placeholder="관리자"	name="admin" id="admin">
    <label for="pwd">비밀번호 </label>
   		<input type="password" placeholder="관리자비번"	name="pwd" id="pwd">
    <button>학생리스트확인</button>
   </form>
   
</body>
</html>