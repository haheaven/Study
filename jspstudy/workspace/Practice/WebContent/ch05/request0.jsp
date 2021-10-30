<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="process01.jsp" method="get">
	<p> 이름 : <input type="text" name="name"></p>
	<p> 나이 : <input type="text" name="age"></p>
		<input type="submit" value="전송">
	</form>
	
	
	<%
	/* request에 속성 저장하기 */
	request.setAttribute("name2", "hahyebin");
	request.setAttribute("age2", "26");
	
	/* request를 전달하는 forward */
	RequestDispatcher dispatcher = request.getRequestDispatcher("process01.jsp");   //-- 이 속성으로 form건너뛰게됨.. 
	dispatcher.forward(request, response);  // 2. --> 1번에서 저장한 name,age를 B에게 넘김
%>
	


</body>
</html>