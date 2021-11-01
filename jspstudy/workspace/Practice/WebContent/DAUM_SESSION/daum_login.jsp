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
    
    <script>
    

    $(document).ready(function(){
        let regId = /^[a-zA-Z0-9_-]{5,12}$/;
        let regPw = /^[a-zA-Z0-9!@#$%^&*()_-]{8,16}$/;
        let loginBox = $('.login_box'); // 배열 
        let msg_err = $('.msg'); // 베열
    

            // 아이디 클릭이벤트
            $(loginBox[0]).on('click',function(){
                $(this).css('border','1px solid #5b94fd');
                $('#userId').css('backgroundColor','#fafcff');
            });
            $('#userId').on('blur',function(){
                $(this).css('backgroundColor','white');
                $(loginBox[0]).css('border',' 1px solid #ececec');
                // 아이디 정규식 
                if($(this).val()==''){
                    $(msg_err[0]).text('필수입력입니다.');
                    
                } else if(   regId.test( $(this).val()) ==false   ){
                    $(msg_err[0]).text('잘못된 아이디 형식입니다.');
                    
                } else 
                    $(msg_err[0]).text('');
                    
                
            });
            // 비밀번호  클릭 이벤트 
            $(loginBox[1]).on('click',function(){
                $(this).css('border','1px solid #5b94fd');
                $('#userPw').css('backgroundColor','#fafcff');
            });
            $('#userPw').on('blur',function(){
                $(this).css('backgroundColor','white');
                $(loginBox[1]).css('border',' 1px solid #ececec');

                // 비밀번호 정규식 
                if($(this).val()==''){
                    $(msg_err[1]).text('필수입력입니다.');
                } else if(   regId.test( $(this).val()) ==false   ){
                    $(msg_err[1]).text('잘못된 비밀번호 형식입니다.');
                } else 
                    $(msg_err[1]).text('');
            });


            // 로그인상태 유지 
            $('#login_retain').on('click',function(){
                if(   $('#login_retain').is(':checked') == true ) {
                $('.login_retain_img').addClass('login_retain_img_ch');
                } else {
                    $('.login_retain_img').removeClass('login_retain_img_ch');
                }
                
            });
            // ip 상태
            $('#ip_secure').on('click',function(){
                if(   $(this).is(':checked') == false ) {
                $('.ip_secure_img').addClass('ip_secure_img_unch');
                } else {
                    $('.ip_secure_img').removeClass('ip_secure_img_unch');
                }
                
            });
            
            // submit 
            $('#login_form').on('submit',function(event){
                if( $('#userId').val()=='' || $('#userPw').val()==''){
                    event.preventDefault();
                    return false;
                } else if(   regId.test( $('#userId').val()) ==false  ||   regId.test( $('#userPw').val()) ==false      ){
                    event.preventDefault();
                    return false;
                } else{
                    alert("로그인 성공!")
                    return true;
                }
                
            });
   

    });
    
    </script>
    <style>
		    *{
		    padding: 0;
		    margin: 0;
		    box-sizing: border-box;
		}
		ul, li { list-style-type: none; }
		a {
		    text-decoration: none;
		    color: black;
		}
		body {  background-color: #ececec;  }
		.login_container {
		    margin: 0 auto;
		    max-width: 700px;
		    height: 900px;
		    background-color: white;
		}
		/* header */
		.header{  padding: 60px 0; }
		.logo{
		    display: block;
		    width: 145px;
		    height: 61px;
		    background-image: url(https://t1.daumcdn.net/id/logins/2021/retina/logo_daum.png);
		    background-repeat: no-repeat;
		    background-size: 145px 61px;
		    margin: 0 auto;  
		}
		/* 메인 섹션 */
		.login_wrapper {
		    max-width: 450px;
		    padding-top: 30px;
		    margin: 0 auto;
		}
		.relogin{
		    width: 100%;
		    height: 24px;   
		}
		.relogin_img{
		    display: inline-block;
		    width: 14px;
		    height: 12px;
		    background-image: url(https://t1.daumcdn.net/id/logins/2021/retina/ico_login.png);
		    background-position: -70px 0;
		    background-repeat: no-repeat;
		    background-size: 200px 100px;
		    margin-left: 280px;
		    margin-right: 9px;  
		}
		.login_box {
		    width: 100%;
		    height: 46px;
		    border: 1px solid #ececec;
		    margin-top: 10px;
		}
		.login_box input{
		    width: 100%;
		    height: 40px;
		    padding: 12px;
		    font-size: 15px;
		    border: none;
		    outline:none;
		}
		#login_btn{
		    display: block;
		  
		    margin-bottom: 25px;
		    width: 100%;
		    height: 46px;
		    text-align: center;
		    color: white;
		    font-size: 17px;
		    font-weight: 700;
		    background-color: #4c87ee;
		    border: none;
		    cursor: pointer;
		}
		.msg{
		    display: block;
		    color: red;
		    font-size: 13px;
		    padding-top: 2px;
		    padding-bottom: 5px;
		}
		/* 로그인 상태유지 */
		.login_stay{  
		     display: inline-block;
		     margin: 20px 0 0 0;
		     height: 40px;  
		     position: relative;
		}
		.login_stay label:first-child span:nth-child(3){
		    display: inline-block;
		    margin-left: 32px;
		    margin-right: 200px;
		    height: 22px;
		}
		#login_retain{  display: none;}
		#ip_secure{ display:  none;}
		.login_retain_img{
		    display: inline-block;
		    width: 22px;
		    height: 22px;
		    background-image: url(https://t1.daumcdn.net/id/logins/2021/retina/ico_login.png);
		    background-repeat: no-repeat;
		    background-size: 200px 100px;
		    background-position: -90px 0;
		    margin-right: 5px;
		    position: absolute;
		    top: -6px
		}
		.login_retain_img_ch{
		    background-position: -120px 0;
		}
		.ip_secure_img{
		    display: inline-block;
		    width: 32px;
		    height: 13px;
		    background-image: url(https://t1.daumcdn.net/id/logins/2021/retina/ico_login.png);
		    background-repeat: no-repeat;
		    background-size: 200px 100px;
		    background-position: -30px -40px;
		    margin-left: 8px;
		}
		.ip_secure_img_unch{
		    background-position: -30px -20px;
		}
		
		/* 아이디 비밀번호 찾기 */
		.search_box {
		    display: flex;
		    justify-content: center;
		}
		.search_box .line {
		    display: inline-block;
		    margin-right: 7px;
		    color: #666;
		}
		.id_search, .pw_search { 
		    width: 100px;
		    text-align: center;
		}
		.id_search a{
		    display: inline-block;
		    font-size: 16px;
		    color: #666;
		}
		.pw_search a{
		    display: inline-block;
		    font-size: 16px;
		    color: #666;
		}
		/* 배너 */
		.banner{
		    margin-top: 70px;
		    margin-bottom: 50px;
		    width: 100%;
		    height: 126px;
		}
		.banner img{
		    display: block;
		    width: 100%;
		    height: 126px;
		}
		/* footer */
		.footer{
		    width: 100%;
		    padding-top: 30px;
		    text-align: center;
		    border-top: 1px solid #ececec;
		}
		.footer span, .footer a{
		    color: #767676;
		    font-size: 14px;
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
 