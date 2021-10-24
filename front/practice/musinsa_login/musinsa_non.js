  $(document).ready(function(){


  
  
  // 비회원 주문조회 클릭시 보더 변경 
  $('#no_exist').on('focus',function(){
    $('#exist').css('border-bottom',' 2px solid #b3b3b3');
    $('#exist').css('color','#b3b3b3');
    $(this).css('border-bottom','3px solid black');
    $(this).css('color','black');
 });
 let login_box2 =  $('.login_box');


 let regName = /^[a-zA-Z가-힣]{5,20}$/;
 let regOrder = /^[0-9]{12}$/;
 let err_msg2 = $('.msg');
 
 // 이름과 주문번호에 정규식 검사하기 + blur 테두리변경
 $('#userName').on('blur',function(){
     $(login_box2[0]).css("border","1px solid #e5e5e5");
    
     if( $(this).val()==''  ){
        $(err_msg2[0]).text('필수입력입니다.');
      } else if(  (regName.test($(this).val())==false)){
        $(err_msg2[0]).text('주문자명을 다시 입력해 주세요.');
      } else {
        $(err_msg2[0]).text('');
      }
    });

    $('#userOrderNo').on('blur',function(){
        $(login_box2[1]).css("border","1px solid #e5e5e5");

        if( $(this).val() == '') {
            $(err_msg2[1]).text('필수 입력입니다.');
        }
        else if( (regOrder.test( $(this).val()) ==false)){
            $(err_msg2[1]).text('주문번호를 다시 입력해주세요. 숫자 12자리입니다. ');
        } else {
            $(err_msg2[1]).text('');
        }
    
    });
    
    $('#formNonMember').on('submit',function(event){
      if( ($('#userName').val()=='') ||  ($('#userOrderNo').val()=='') ){
            event.preventDefault();
            return false;
        } else if ( (regName.test( $('#userName').val())==false) ||(regOrder.test( $('#userOrderNo').val()) ==false)){
            event.preventDefault();
            return false;
        } else 
            return true;
    });

}); // onload
  