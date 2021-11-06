<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%-- 예외 발생시 이동할 에러페이지 작성 --%>
<%@ page errorPage="quiz02_error.jsp" %>



	<%
	   request.setCharacterEncoding("utf-8");
		int age = request.getParameter("age").isEmpty() ? 0 : Integer.parseInt(request.getParameter("age"));
	   
		String result1="";
		String result2="";
	   if( age < 20){
		   result1 = "미성년자";
		   result2 = "불가능";
	   } else {
		   result1 = "성인";
		   result2 = "가능";
	   }
		session.setAttribute("result1", result1);
		session.setAttribute("result2", result2);
		
		request.getRequestDispatcher("quiz02c.jsp").forward(request, response);
	%>
	
	
	

