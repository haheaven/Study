<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<title>Insert title here</title>
</head>
<body>
  <% 
  //파일 읽기 
    String filename = (String)session.getAttribute("filename");
	String realpath = request.getServletContext().getRealPath("archive2");
	
	File file = new File(realpath, filename);
	
	BufferedReader br = new BufferedReader(new FileReader(file));
	StringBuilder sb =new StringBuilder();
	String text = null;
	
	while( (text = br.readLine()) != null){
		sb.append(text+"<br>");
	}
	if( br != null){
		br.close();
	}
    String result = sb.toString();
%>
  

	<h3>가입되었습니다. </h3>
	
	<h4>가입 내용</h4>
	<%=result%>
	
	<form action="quiz08f.jsp" method="post">
	<button>탈퇴</button>
	<input type="hidden" name="filename" value="<%=filename%>">
	</form>
	
	<script>
		$('form').on("submit",function(event){
		  if(confirm('정말 탈퇴하시겠습니까?')==false){
			  alert("취소되었습니다.")
			  event.preventDefault();
			  return false;
		  } else {
			 return true;
		  }
		});
	</script>
</body>
</html>