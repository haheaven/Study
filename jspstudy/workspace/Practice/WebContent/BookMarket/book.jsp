<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="dto.Book" %>
<jsp:useBean class="dao.BookRepository" id="bookDAO" scope="session"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>

	<%@ include file="menu.jsp" %>
	
	<%!  String greeting = "도서 목록";  %>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">
				<%=greeting %>
			</h1>
		</div>
	</div>
		<%    ArrayList<Book> listOfBooks = bookDAO.getAllBooks();    %>
	<div class="container">
		
			<%
				for(int i=0; i<listOfBooks.size(); i++){
					Book book = listOfBooks.get(i);
			%>
			<div class="row" align="left" style="flex-direction: column" >
				<h3><%=book.getCategory() %> <%=book.getName() %></h3>				
				<p><%=book.getDescription() %></p>
				<p><%=book.getAuthor() %> | <%= book.getPublisher() %> | <%=book.getUnitPrice() %></p>
			</div><hr>
			<% } %>
	</div>
	
	<footer class="container">
		<p>&copy; BookMarket</p>
   </footer>
	



</body>
</html>