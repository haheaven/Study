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
		$('.result').on('keyup',function(){
			if( isNaN( $('.result').val() )  ){
				alert('정수만 입력가능합니다.');
				$(this).val('');
				$(this).focus();
			}
		})
		
	})

</script>


</head>
<body>
	<%
		int a = (int)(Math.random()*9)+1;
		int b = (int)(Math.random()*9)+1;
		String[] op = {"+","-","x","/","%"};
		int idx = (int)(Math.random()*op.length);
		int answer = 0;
	    switch(op[idx]){
	    case "+": answer = a+b; break;
	    case "-": answer = a-b; break;
	    case "/": answer = a/b; break;
	    case "x": answer = a*b; break;
	    case "%": answer = a%b; break;
	    }
	%>


	<form action="quiz04b.jsp">
		<%=a%>  <%=op[idx] %> <%=b%> = <input type="text" name="result" size="5" class="result">
		
		<input type="hidden" name="a" value="<%=a%>" size="3">
		<input type="hidden" name="b" value="<%=b%>" size="3" >
		<input type="hidden" name="op" value="<%=op[idx] %>" size="3" >
		<input type="hidden" name="answer" value="<%=answer%>">
	
	<button>제출</button>
	</form>


</body>
</html>