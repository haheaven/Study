<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="java.net.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	Cookie[] cookies = request.getCookies(); 
		
	String[] cookiename= {"id","pw","name","email","tel","addr","birth","job","marriage"};

	for( int i=0; i<cookiename.length; i++){
	 for(Cookie cookie : cookies){
		 if(cookie.getName().equals(cookiename[i])){
			cookie.setMaxAge(0);
			response.addCookie(cookie);
		 }
	 }
}
	
	boolean isCookie = true;  // 만약 쿠키가 있으면 false 없으면 true 
	if(cookies == null){
		isCookie = true;
	} else { isCookie = false; }

		%>
		
		<script>
			if( <%=isCookie%> ){ 
				alert("쿠키가 삭제되지않았습니다.");
			    history.back();
			} else {
				alert("쿠키가 모두 삭제되었습니다.");
				location.href="quiz06a.jsp";
				
			}
		</script>
	
		


</body>
</html>