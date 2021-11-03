<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Daum</title>
    <script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
   <link rel="stylesheet" href="assets/css/daum_login.css">
   <script src="daum_login.js"></script>
   <style>
   .captcha {margin-bottom : 20px;}
   #value {
   	display: inline-block;
   	height:23px;
   	margin-left:10px;
   	padding-left: 10px;
   	border: 1px solid gray;
   	outline: none;
   	font-size:13px;
    }
   
   </style>
</head>
<body>

	<% 
		boolean loginKeep = false;
		Cookie[] cookies = request.getCookies();
		if( cookies != null && cookies.length!=0){
			for(Cookie cookie : cookies ){
				if(cookie.getName().equals("userId")){
					 loginKeep=true;
					break;
				}
			}
		}
	
	%>

<% if ( loginKeep == false ) { %>
    <div class="login_container">
        <header class="header">
            <a href="#" class="logo"></a>
        </header>
        
        <section class="login_wrapper">
            <form action="daum_loginB.jsp" id="login_form" method="POST">
                <div class="relogin">
                    <a href="#"><span class="relogin_img"></span>다른 방법으로 로그인</a>
                </div>
                <div class="login_box">
                    <input type="text" name="userId" id="userId" placeholder="아이디">
                </div>
                <span class="msg"></span>
                <div class="login_box">
                    <input type="password" name="userPw" id="userPw" placeholder="비밀번호">
                </div>
                <span class="msg"></span>
              
           
            <div class="login_stay">
                <label>
                    <span class="login_retain_img"></span>
                    <input type="checkbox" id="login_retain" name="loginKeep">
                  
                    <span>로그인 상태 유지</span>
                </label>
                <label>
                    <span>IP보안</span><input type="checkbox" id="ip_secure" checked>
                    <span class="ip_secure_img"></span>
                </label> 
            </div>
            
            
            
            <div class="captcha">
             <img id="captchaimg" alt="캡쳐이미지"  style="opacity:1" src="${foldername}/${filename}">
         <%--    ${foldername}	${filename}	 --%>
	          <input type="text" name="value" placeholder="입력값" id="value" >
			 <input type="hidden" name="key" value="${key}" id="key" >
			 
		    </div>
			 
              <button id="login_btn">로그인</button>
               </form>
   
            <div class="search_box">
                <div class="id_search">
                    <a href="#">아이디 찾기</a>
                </div>
                <span class="line">|</span>
                <div class="pw_search">
                    <a href="#">비밀번호 찾기</a>
                </div>
            </div>
            <div class="banner">
                <a href="#"><img src="https://t1.kakaocdn.net/login/bridge/bnr_login.jpg"></a>
            </div>
        </section>

        <footer class="footer">
            <div>
                <a hreg="#">© Kakao Corp.</a>
                <span>&nbsp;&nbsp;|&nbsp;&nbsp;</span> 
                <a href="#">고객센터</a>
            </div>
        </footer>
    </div>
 <% } else { response.sendRedirect("daum_loginC.jsp"); } %>

</body>
</html>
 