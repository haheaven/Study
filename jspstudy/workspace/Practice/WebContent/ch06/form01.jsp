<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	label {
	   display : inline-block;
	   width:80px;  
	}


	.phone{
		width:50px;
	}
</style>
</head>
<body>
	<h2>회원가입</h2>
	<form action="form02.jsp" name="member" method="post">
	
	<label for="id">아이디</label> : <input type="text" name="id" id="id">
								   <input type="button" value="아이디중복검사"><br>
	<label for="pwd">비밀번호</label>  : <input type="text" name="pw" id="pwd"><br>
	<label for="name">이름</label> : <input type="text" name="name" id="name"><br>	
	<p>연락처 : <select name="phone1" class="phone">
				<option value="010">010</option>
				<option value="011">011</option>
				<option value="016">016</option>
			 </select>
	-  <input maxlength="4" size="5" class="phone" type="text" name="phone2"> 
	- <input type="text"  size="5" maxlength="4" name="phone3" class="phone"></p>
	<p>성별: <input type="radio" name="gender" value="W">여성 <input type="radio" name="gender" value="M">남성</p>
	<p>취미 : 독서<input type="checkbox" name="hobbies" value="독서">
	 		운동<input type="checkbox" name="hobbies" value="운동">
	  		영화<input type="checkbox" name="hobbies" value="영화">
    </p>
    <p>
		<textarea name="content" cols="20" rows="3" placeholder="가입인사를 적어주세요"></textarea>
    </p>
    <button>가입하기</button>&nbsp;<input type="reset" value="다시쓰기">
	
	
	
	
	</form>


</body>
</html>