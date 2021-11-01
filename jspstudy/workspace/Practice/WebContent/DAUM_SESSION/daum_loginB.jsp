<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="daum_login.Member" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

			<%
				 request.setCharacterEncoding("utf-8");
				 String userId = request.getParameter("userId");
				 String userPw = request.getParameter("userPw");
				 String loginKeep = request.getParameter("loginKeep");
				out.println(loginKeep);        
				 Member member = new Member();
				 member.setUserId(userId);
				 member.setUserPw(userPw);
				 
				 Member userMem = null;
				 // id는heaven pw은 1234면 로그인성공(db에 있다고 생각..)
				 if ( member.getUserId().equals("heaven") && member.getUserPw().equals("abcd123")){
					 // 만약 받아온 데이터의 값과 db와 일치한다고 가정 
					 userMem = new Member();
					 userMem.setUserId("heaven");
					 userMem.setUserPw("abcd123");
					 userMem.setUserName("하프로");
					 out.println( userMem.getUserId());
					 out.println( userMem.getUserPw());
					 out.println( userMem.getUserName());
					 
					// 세션(브라우저 저장)원하면 로그인기억하기 체크 
					// 닫으면 사라지기 때문에 쿠키에 저장하고 값을 받아야함 .
					if( loginKeep != null ){
						Cookie cookie1 = new Cookie("userId", userMem.getUserId());
						cookie1.setMaxAge(60*60); // 10분간저장 
						response.addCookie(cookie1);
						
						
						Cookie cookie2 = new Cookie("userName", userMem.getUserName());
						cookie2.setMaxAge(60*60); // 10분간저장
						response.addCookie(cookie2);
						out.println(cookie2.getName()); 
					} else { // 그냥 일반 브라우저에 저장하는 세션만 사용 ( 브라우저 끌시 자동로그인 안됨)
					 	session.setAttribute("userId", userMem.getUserId());
					 	session.setAttribute("userName", userMem.getUserName());
					 	
					}
					 
				 }
				 
			 response.sendRedirect("daum_loginC.jsp");
			%>
			


</body>
</html>