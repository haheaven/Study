<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>selectOne</title>
<style>
	label, #gender_box {
		display: inline-block;
		width: 150px;
	}
	#f{
	width:50px;
		display: inline-block;
	}
 	.red_msg {
 		color : red;
 		font-size : 12px;
 	}
	
	
	
</style>
 <script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<script type="text/javascript">
	$(document).ready(function(){
		fnCheckSubmit();             // 모든 함수 확인 후 서브밋넘기기
		fnbirth();                     // 생년월일 삽입
		
		fnIdCheck();				 
		fnPwCheck();				   
		fnPwDoubleCheck();
		fnNameCheck();
		fnEmailCheck();
		fnPhoneCheck();
		fnResetBtn();
	}); 
	
	// 서브밋
	 function  fnCheckSubmit(){
	    $('#join_form').on('submit',function(event){
	      if( confirm('가입하시겠습니까?') == false){
	    	  event.preventDefault(); 
	          return false;
	      } else if (  fnIdCheck()==false ) {
	            event.preventDefault();  
	            return false;    
           } else if (  fnPwCheck()==false ) {
                event.preventDefault(); 
                return false;  
            } else if (  fnPwDoubleCheck()==false ) {
                event.preventDefault();  
                return false;  
            } else if (  fnNameCheck()==false ) {
                event.preventDefault();  
                return false;  
            } else if (  fnEmailCheck()==false ) {
                event.preventDefault();
                return false;  
            }else if (  fnPhoneCheck()==false ) {
               event.preventDefault(); 
               return false;  
            } else 
            	return true;
            
	      
	        });
	    } //   function fnCheckSubmit()
	    
	
	
	// 아이디 체크
<%--	function fnIdDoubleCheck(){
		let idDouble = false;
			$("#id").on('keyup',function(){
	
				$.ajax({
					url : 'idCheck.member',
					type : 'post',
					data : 'id=' + $('#id').val(),
					dataType: 'json',               // 받아올 데이터 타입
					success : function(resData){
						 if( resData.result == true ){
							 $('#id_check').text('사용 가능한 아이디');
							 $('#id_check').removeClass('red_msg');
							 idDouble = true;
						 }else {
							 $('#id_check').text('이미 사용중인 아이디');
							 $('#id_check').addClass('red_msg');
							 idDouble = false;
						 }
					},
					error : function(xhr, ajaxOptions, thrownError) {
				       alert(xhr.responseText);
				//		console.log(xhr.status);
				  //      console.log(thrownError);
					}
					
				}) // ajax
			}); // id
				 return idDouble;
	} // fnIdDoubleCheck   --%>
	

	// 생년월일 삽입
	function fnbirth(){
		let year = '';
		year +=  '<option value="year">년도</option>';
		for(let i=2007; i>=1907; i--){
		    year += '<option value="'+i+'">'+i+'</option>';
		}
		 $('#birthday').html(year);
		
		let month = '';
		month +=  '<option value="month">월</option>';
		for(let i=1; i<=12; i++){
		    month += '<option value="'+i+'">'+i+'</option>';
		}
		 $('#month').html(month);
		 
		 let day ='';
		 day += '<option value="day">일</option>';
		 for(let i=1; i<=31; i++){
		     day += '<option value="'+i+'">'+i+'</option>';
		 }
		  $('#day').html(day);	 
	}
 
    // 아이디
     let regId = /^[a-zA-Z0-9_-]{4,}$/;
     // 비밀번호
     let regPwd = /^[a-zA-Z0-9!@$%^&*()]{8,20}$/;
     // 이름
     let regName = /^[a-zA-Z가-힣]{1,30}$/;
     // 이메일
      let regEmail = /^[0-9a-zA-Z-_]+@[a-zA-Z0-9]+([.][a-zA-Z]{2,}){1,2}/;
      // 핸드폰 번호
      let regPhone = /^((01[1|6|7|8|9])[1-9]+[0-9]{6,7})|(010[1-9][0-9]{7})$/;

    function fnIdCheck(){   
        let id_result = false;
        $('#id').on('blur',function(){
            if ( $('#id').val() == '' ){
                $('#id_check').text('입력 필수입니다.');
                $('#id_check').addClass('red_msg');
                id_result = false;
            }else if( regId.test( $('#id').val() ) == false  ) {
                $('#id_check').text("아이디는 소문자/숫자 4자 이상 사용 가능합니다.");
                $('#id_check').addClass('red_msg');
                id_result = false;
            } else if ( regId.test($('#id').val() )  ){
                $('#id_check').text('');
                $('#id_check').removeClass('red_msg');
                id_result = true;
            }
        }) // blur
            
            
            $("#id").on('keyup blur',function(){
            	
				$.ajax({
					url : 'idCheck.member',
					type : 'post',
					data : 'id=' + $('#id').val(),
					dataType: 'json',               // 받아올 데이터 타입
					success : function(resData){
						 if( resData.result == true ){
							 $('#id_check').text('사용 가능한 아이디');
							 $('#id_check').removeClass('red_msg');
							 id_result = true;
						 }else {
							 $('#id_check').text('이미 사용중인 아이디');
							 $('#id_check').addClass('red_msg');
							 id_result = false;
						 }
					},
					error : function(xhr, ajaxOptions, thrownError) {
				       alert(xhr.responseText);
				//		console.log(xhr.status);
				  //      console.log(thrownError);
					}
					
				}) // ajax
				 console.log("id: "+id_result);
				  return id_result;	 
			}); // id
           
    } // fnId
        
      
      // 비밀번호 정규식 
      function fnPwCheck(){
          let pw_result = false;
         $('#pw').on('blur keyup', function(){
            if( regPwd.test( $("#pw").val())){    
                $("#pw_check").text("사용가능한 비밀번호입니다.");
                $('#pw_check').removeClass('red_msg');
                pw_result = true;
            } else if (    $('#pw').val() == '' ){
                $("#pw_check").text('입력은 필수입니다.') 
                $('#pw_check').addClass('red_msg');
                pw_result = false;
            }    else {
                $("#pw_check").text("비밀번호는 8~20자의 영문 대/소문자, 숫자, 특수문자 등 3종류 이상으로 조합해주세요.");
                $('#pw_check').addClass('red_msg');
                pw_result = false;
            }
           
         console.log("pw: "+pw_result);
            return pw_result;
         }); 
      
      } // fnPwCheck
      
      
      
   // 비밀번호 재확인 일치 
         function fnPwDoubleCheck(){
            let pw_double_result = false;
          $('#pwCheck').on('blur keyup', function(){     
                if($('#pw').val() !=  $("#pwCheck").val() ){
                    $("#pw_doubleCheck").text(  '비밀번호가 일치하지 않습니다.');
                    $('#pw_doubleCheck').addClass('red_msg');
                    pw_double_result = false;
                } else{
                    $("#pw_doubleCheck").text(''); 
                    $('#pw_doubleCheck').removeClass('red_msg');
                    pw_double_result = true;
                }  
          console.log("pw2 : "+pw_double_result);
          return pw_double_result;
            });
      }
          
      // 이름 정규식
        function fnNameCheck() {  
            let name_result = false;
           $('#name').on('blur', function(){
               if( regName.test( $(this).val())){    
                 $('#name_check').text('');
                 $('#name_check').removeClass('red_msg');
                 name_result = true;
               } else if (  $('#name').val() == '' ){
                   $('#name_check').text('이름은 필수입니다.');
                   $('#name_check').addClass('red_msg');
                   name_result = false;
               }  else if( regName.test( $(this).val()) == false){    
                   $('#name_check').text('잘못된 이름 형식입니다.'); 
                   $('#name_check').addClass('red_msg');
                   name_result = false;
               }
           console.log(name_result);
               return name_result;
           });
         
          } // fnName
          
        // 이메일    
      function  fnEmailCheck(){
        let email_result = false;
         $('#email').on('blur', function(){
                  if( regEmail.test( $('#email').val())){    
                      $('#email_check').text('');
                      $('#email_check').removeClass('red_msg');
                      email_result = true;
                   } else{
                       $('#email_check').text('잘못된 이메일 형식입니다.');
                       $('#email_check').addClass('red_msg');
                       email_result = false;
                  }
         console.log(email_result);
                  return email_result;
           });
         }
     
          // 핸드폰
      function	fnPhoneCheck() {
        let phone_result = false;
           $('#phone').on('blur', function(){
               if( regPhone.test( $('#phone').val())){    
                   $('#phone_check').text('');
                   $('#phone_check').removeClass('red_msg');
                   phone_result = true;
               } else if ($('#phone').val() == '' ){
                   $('#phone_check').text('핸드폰번호는 필수입니다.');
                   $('#phone_check').addClass('red_msg');
                   phone_result = false;
               } else {
                   $('#phone_check').text('잘못된 형식입니다.');
                   $('#phone_check').addClass('red_msg');
                   phone_result = false;
               }
               return phone_result;
           });
    }  // fnPhone
    
  // reset_btn 클릭시 msg 없애기
  function fnResetBtn(){
    $('#reset_btn').on('click',function(){
    	$('#id_check').text('');
    	$('#pw_check').text('');
    	$('#pw_double_check').text('');
    	$('#name_check').text('');
    	$('#email_check').text('');
    	$('#phone_check').text('');
    })
   }
</script>
</head>
<body>
   <h2>회원가입 페이지</h2>
	<form action="/MYBOARD/join.member" method="post" id="join_form">
	<div>
		<label for="id">아이디</label><input type="text" id="id" name="id">
		<span id="id_check"></span>
	</div>
	<div>
		<label for="pw">비밀번호</label><input type="text" id="pw" name="pw">
		<span id="pw_check"></span>
	</div>
	<div>
		<label for="pw">비밀번호 재확인</label><input type="text" id="pwCheck" >
		<span id="pw_doubleCheck"></span>
	</div>
	<div>
		<label for="name">이름</label><input type="text" id="name" name="name">
		<span id="name_check"></span>
	</div>
	<div>
		<label for="email">이메일</label><input type="text" id="email" name="email" >
		<span id="email_check"></span>
	</div>
	<div>
		<label for="phone">번호</label><input type="text" id="phone" name="phone" placeholder="-표시 없이 입력해주세요">
		<span id="phone_check"></span>
	</div>
		<label for="birthday">생년월일</label>
		 <select id="birthday" name="year">
		 	
		 </select>
		  <select id="month" name="month">
		 	<option value="월"></option>
		 </select>
		  <select id="day" name="day">
		 	<option value="일"></option>
		 </select>
		<div>		
		 <span id="gender_box">성별</span>
		  <input type="radio" name="gender" value="f" id="female" checked>
                        <label id="f" for="female">여성</label>
                        <input type="radio" name="gender" value="m" id="male">
                        <label id="m"  for="male">남성</label>
        </div>
        <button>회원가입</button>                 
        <input type="reset" value="다시작성" id="reset_btn">                
                        
	</form>




</body>
</html>