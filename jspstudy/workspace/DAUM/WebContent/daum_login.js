/**
 * 
 */

  $(document).ready(function(){
        let regId = /^[a-zA-Z0-9_-]{5,12}$/;
        let regPw = /^[a-zA-Z0-9!@#$%^&*()_-]{8,16}$/;
        let loginBox = $('.login_box'); // 배열 
        let msg_err = $('.msg'); // 베열
		let count = 0;
    

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
                } else if(   regPw.test( $(this).val()) == false   ){
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
                    count++;
					//alert(count);
					event.preventDefault();
				    if (count >= 3){
				    location.href="/DAUM/LoginServlet";
					alert('3번 연속 틀렸습니다. 자동입력방지를 보고 입력칸을 적어주세요.');
 					
					
					event.preventDefault();
						}
                    return false;
                } else{
                 
                    return true;
                }

			

			

   		  });
			


});




