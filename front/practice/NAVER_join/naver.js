$(document).ready(function(){

        // 아이디 정규식
        let regId = /^[a-z0-9_-]{5,20}$/;
        // 같은 형식의 아이디 비번 재확인 이름 이메일 휴대전화 배열임 
        let errorMsgs = $('.msg'); //배열 
        console.log(errorMsgs[0]);
       
        // Id event
        $('#user_id').on('blur', function(){
        if($('#user_id').val() == ''){
            $(errorMsgs[0]).text('필수 입력입니다.');
            $(errorMsgs[0]).removeClass('pass');   
        }
        else if(regId.test($('#user_id').val())){
            $(errorMsgs[0]).addClass('pass');
            $(errorMsgs[0]).text('멋진 아이디네요');
 
        }
        else if (regId.test($('#user_id').val()) == false ){
            $(errorMsgs[0]).removeClass('pass');
            $(errorMsgs[0]).text(' 5~20자의 영문 소문자, 숫자와 특수기호(_),(-)만 사용 가능합니다');
        }                    
        });

      
        //  pw 정규식 
        let regPw = /^[a-zA-Z0-9!@#$%^&*()+=<>?'";{}'|]{8,16}$/;     
        //let errorMsgs = $('.msg'); //배열                 
        let same_box = $('.same_box_size') // 배열 아이디 비번 비번 재확인 이름 -- 인덱스 0번인 아이디에는 클릭이벤트없음!
        // pw 이벤트
        $(same_box[1]).on('click',function(){
        $(this).css('border','1px solid #03c75a ');
        });

        $('#user_pw').on('blur', function(){
        if($('#user_pw').val() == ''){
            $(errorMsgs[1]).text('필수 입력입니다.');
          
        }else if( regPw.test($('#user_pw').val()) ){
            $(errorMsgs[1]).addClass('pass');
            $($(errorMsgs[1]).text(""));
           
            $('.input_pw').css('backgroundPosition','-54px 0');
        }else if (regPw.test($('#user_pw').val()) == false ){
            $(errorMsgs[1]).removeClass('pass');  
            $(errorMsgs[1]).text('8~16자 영문 대 소문자, 숫자, 특수문자를 사용하세요.');
         
            }

        $(same_box[1]).css('border', 'solid 1px #dadada');
        });
        


        // pw 확인 이벤트 
        $(same_box[2]).on('click',function(){
        $(this).css('border','1px solid #03c75a ');
        });
        $('#user_pw_ch').on('blur', function(){
        if($('#user_pw').val() == ''){
            $(errorMsgs[2]).text('필수 입력입니다.');
        } else if($('#user_pw').val() != $(this).val()){
            $(errorMsgs[2]).text('비밀번호가 일치하지 않습니다.');
            $(errorMsgs[2]).removeClass('pass');
            $('.input_pw_ch').css('backgroundPosition','-27px 0')
        }
        else {
            $(errorMsgs[2]).addClass('pass');
            $($(errorMsgs[2]).text(""));
            $('.input_pw_ch').css('backgroundPosition','-81px 0');
            }
        $(same_box[2]).css('border', 'solid 1px #dadada');
        });


        // 이름 이벤트
        $(same_box[3]).on('click',function(){
        $(this).css('border','1px solid #03c75a');
        });
        $('#user_name').on('blur', function(){
            if($('#user_name').val() == ''){
                $(errorMsgs[3]).text('필수 정보입니다.');
                $(errorMsgs[3]).removeClass('pass');
            }
            else {
                $(errorMsgs[3]).addClass('pass');
                $($(errorMsgs[3]).text(""));
            }
        $(same_box[3]).css('border', 'solid 1px #dadada');
        });





        // 생년월일의 월 옵션 추가 
        for(let i=1; i<=12; i++){
        $('#month_select').append('<option value='+i+'>'+i+'</option>');
        }
        let birth_box = $('.birth_box');
        // 클릭시 초록색 테두리 이벤트 
        birth_box.on('click',function(){
        $(this).css('border','1px solid #03c75a ');
        })
        // blur 이벤트  birth_box
        let regYear = /^[0-9]{1,4}$/;
        $('#user_year').on('blur',function(){
        if( $('#user_year').val() == ''){
            $(errorMsgs[4]).text('태어난 년도 4자리를 정확하게 입력하세요.');
        } else if (regYear.test($('#user_year').val())){
            $(errorMsgs[4]).text('태어난 월을 선택하세요');
        }    
        $('.birth_box').css('border','1px solid #dadada');
        });
        $('#month_select').on('blur',function(){
        $(errorMsgs[4]).text('태어난 일(날짜) 2자리를 정확하게 입력하세요.');
        $('.birth_box').css('border','1px solid #dadada');
        });
        let regDay = /^[0-9]{1,2}$/;
        $('#user_day').on('blur',function(){
        if( $('#user_day').val() == ''){
            $(errorMsgs[4]).text('태어난 일(날짜) 2자리를 정확하게 입력하세요.');
        } else if (regYear.test($('#user_year').val()) && $('#user_day').val()>=1 && $('#user_day').val()<=31){
            $(errorMsgs[4]).text('');
        } else if (regYear.test($('#user_year').val()) || $('#user_day').val()<1 || $('#user_day').val()>31){
            $(errorMsgs[4]).text('태어난 일(날짜) 2자리를 정확하게 입력하세요.');
        }
        $('.birth_box').css('border','1px solid #dadada');
        });




        // 성별 이벤트
        //클릭시 초록색 테두리 
        $(same_box[4]).on( 'click',function(){
            $(same_box[4]).css('border','1px solid #03c75a');
        });
        // 벗어나면 회색
        $('#gender').on( 'blur',function(){
            $(same_box[4]).css('border','1px solid #dadada');
        });


        //이메일 이벤트 
        // 이메일 메시지 추가 
        let regEmail = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;

        //클릭시 초록색 테두리 
        $(same_box[5]).on('click', function(){
            $(same_box[5]).css('border','1px solid #03c75a');  
        })

        $('#user_email').on('blur', function(){
        $(same_box[5]).css('border','1px solid #dadada');   
            if(regEmail.test($('#user_email').val())==false){
                $(errorMsgs[6]).text('이메일 주소를 다시 확인해주세요.');
            } else {
                $(errorMsgs[6]).text('')
            } 
        });   


        // 휴대전화
        // 휴대전화 국가 코드 넣기 
        let country_code_arr = [
                '대한민국 +82', '가나 +223', '덴마크 +45',
                '일본 +81','영국 +44','미국 +1','태국 +66'
            ];
            console.log(country_code_arr[0]);
        for(let i=0; i<country_code_arr.length; i++){
            $('#county_code').append('<option>'+country_code_arr[i]+'</option>');
        }

        $('.phone_country').on('click', function(){
            $('.phone_country').css('border','1px solid #03c75a');
        });
        $('#county_code').on('blur', function(){
            $('.phone_country').css('border','1px solid #dadada');
        });

        // 전화번호 입력란

        let regPhone = /^010[0-9]{8}$/;
        $('#user_phone').on('click', function(){
            $('#user_phone').css('border','1px solid #03c75a');
        });
        $('#user_phone').on('blur', function(){
            $('#user_phone').css('border','1px solid #dadada');
            if(  $('#user_phone').val()==''){
                $(errorMsgs[7]).text('형식에 맞지 않는 번호입니다.'); 
            } else if( regPhone.test($(this).val()) == false){
                $(errorMsgs[7]).text('형식에 맞지 않는 번호입니다.'); 
            } else {
                $(errorMsgs[7]).text(''); 
            }
        });
}); // 로드 함수
