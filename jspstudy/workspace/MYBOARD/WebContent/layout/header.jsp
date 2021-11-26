<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
	<header class="header_nav">
		<h1><a href="index.do">JSP 게시판</a></h1>
		<c:if test="${user != null}">
				<a id="logout_link" href='logout.member'>LOGOUT</a>
		</c:if>
		
		<nav>
			<ul id="header_ul">
		
				<li>REVIEW</li>
				<li><a href="selectAllList.qna">QnA</a></li>
				<li><a href="selectAllList.do">공지사항</a></li>
			</ul>
		</nav>
		
		
	</header>
	