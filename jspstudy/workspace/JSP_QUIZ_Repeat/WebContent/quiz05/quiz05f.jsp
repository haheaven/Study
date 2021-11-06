<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.io.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		request.setCharacterEncoding("utf-8");
		String filename = request.getParameter("filename");
		String realpath = request.getServletContext().getRealPath("archive");
		File file = new File(realpath, filename);
		if(file.exists() ) {
			file.delete();
		}
		boolean isExist = file.exists();  // 진짜 있는지 없는지 확인하기  -> 삭제후 체크했으므로 false면 없는것 
		
	%>
	<script>
	 if(<%= isExist%>) {
		alert("탈퇴되지않았습니다. 파일이 남아있습니다.");
		history.back();
	 } else {
		 alert("탈퇴되었습니다.");
		 location.href="quiz05a.jsp";
	 }
	
	</script>

	
</body>
</html>