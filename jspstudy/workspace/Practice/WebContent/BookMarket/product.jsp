<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="dto.Book" %>
<jsp:useBean id="bookDAO" class="dao.BookRepository" scope="session" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>상품 상세 정보</title>
</head>
<body>
	<jsp:include page="menu.jsp"/>
	<div class="jumbotron">
		<div class="container">	
			<h1 class="display-3">상품정보</h1>
		</div>
	</div>
	<% 
		String id=request.getParameter("id");
		Book book = bookDAO.getBookById(id);
	%>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<h3><%=book.getName() %></h3>
				<p><%=book.getDescription() %>
				<p> <b>도서 코드</b> : <span class= "badge badge-danger">
				<%=book.getBookId() %></span></p>
				<p> <b>출판사</b> : <%=book.getPublisher() %></p>
				<p> <b>저자</b> : <%=book.getAuthor() %></p>
				<p> <b>재고수</b> : <%=book.getUnitInStock() %></p>
				<p> <b>총 페이지수</b> : <%=book.getTotalPages() %></p>
				<p> <b>출판일</b> : <%=book.getReleaseDate() %></p>
				<h4><%=book.getUnitPrice() %>원</h4>
				<p> <a href="#" class="btn btn-info">도서주문 &raquo;</a>&nbsp;&nbsp;
				<a href="products.jsp" class="btn btn-secondary">도서목록 &raquo;</a></p>
			</div>
		</div>
		<hr>
	</div>	
	<footer class="container">
		<p>&copy; BookMarket</p>
   </footer>
	

</body>
</html>