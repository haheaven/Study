$(document).ready(function(){



         let login_box = $('.login_box');
         let msg_err = $('.msg');
         // 아이디 박스 누를 때 벗어날 때 이벤트 
         let regId = /^[a-zA-Z0-9_-]{4,}$/;
         let regPwd = /^[a-zA-Z0-9!@$%^&*()]{8,20}$/;
   
 

        $(login_box[0]).on('click',function(){
            $(login_box[0]).css("border","1px solid gray");
        });

        $('#userId').on('blur',function(){
            $(login_box[0]).css("border","1px solid #e5e5e5"); 
            if($(this).val() == ''){
                $(msg_err[0]).text('아이디를 입력해주세요');  
            } else if(regId.test($('#userId').val())==false){
                $(msg_err[0]).text('잘못된 형식의 아이디입니다.');
            } else
                 $(msg_err[0]).text('');
             
            
        });

        // 비밀번호 
        $(login_box[1]).on('click',function(){
            $(login_box[1]).css("border","1px solid gray")
        });

        $('#userPw').on('blur',function(){
            $(login_box[1]).css("border","1px solid #e5e5e5");

            if($(this).val() == ''){
                $(msg_err[1]).text('비밀번호를 입력해주세요'); 
            } else if(regPwd.test($('#userPw').val())==false){
                $(msg_err[1]).text('잘못된 형식의 비밀번호입니다.'); 
            } else{
                $(msg_err[1]).text('');
            }
        });
        // 자동로그인 체크  
        $('#check_click').on('click', function(){
            if( document.getElementById('auto_check').checked == false ){
                $('.check_img').addClass('check_img2');
            } else if(document.getElementById('auto_check').checked == true){
                $('.check_img').removeClass('check_img2')
            }
        });
       
        // 빈값이나 정규식 만족못할시 막기 
        $('#formLogin').on('submit', function(evnet){
            if(  ($('#userId').val() == '') || ($('#userPw').val() == '')) {
                alert("로그인 실패");
                event.preventDefault();
                return false;
            } else if( regPwd.test($('#userPw').val())==false || regId.test($('#userId').val())==false){
                alert("로그인 실패");
                event.preventDefault();
                return false;
            }
            else {
            alert('로그인시도');
            return true;
            }
          }); //submit

        });


