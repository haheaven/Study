let msg = document.getElementsByClassName('msg');

let userEmail = document.getElementById("userEmail");
let regEmail= /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i;

//아이디
userEmail.addEventListener('click',function(){
   this.style.backgroundColor = "white";
   this.style.outline = "2px solid black";
});
userEmail.addEventListener('keyup', function(){
   if(regEmail.test(this.value)){
       msg[0].textContent = '사용 가능한 아이디입니다.';
    } else{
        msg[0].textContent = '아이디는 이메일 형식입니다.';  
        if(this.value.length==0){
            msg[0].textContent ='이메일 아이디를 입력해주세요'; 
        }
    }
});

//비밀번호
let userPw = document.getElementById("userPW");
let regPw = /^[a-zA-Z0-9!@#$%^&*()-_+=??'"[}{}]{8,16}$/;
    userPw.addEventListener('click', function(){
        userPw.style.backgroundColor = "white";
        userPw.style.outline = "2px solid black";

    });
    userPw.addEventListener('keyup', function(){
    let regPwCheck = /[a-z]/.test(userPw.value) +
                     /[0-9]/.test(userPw.value) +
                     /[A-Z]/.test(userPw.value) +
                     /[^a-zA-Z0-9]/.test(userPw.value);

    if(regPw.test(userPw.value) && (regPwCheck>=3)){
        msg[1].textContent = "사용가능한 비밀번호입니다.";
    } else if(userPw.value.length < 8 || userPw.value.length > 16){
        msg[1].textContent = "8자~16자로 입력해주세요."
    } else if(regPw.test(userPw.value) && (regPwCheck<3)){
        msg[1].textContent = '영문, 숫자, 특수문자를 모두 사용하여 입력해주세요.';
    } 
    
    if(/[0-9]{3}/.test(userPw.value)) {
        msg[1].textContent = "같은 글자 또는 숫자를 3번 연속 입력하실 수 없습니다.";
    }
 
    f1(userPw, userPwConfirm);
    userPw.addEventListener('blur', function(){
            if (this.value.length >=8 && this.value.length<=16 ){
                if( regPwCheck==4) {
                msg[1].textContent =  "사용가능한 비밀번호입니다.";
                }
            }
        
    });
    });


function f1(userPw, userPwConfirm){
    if(userPw.value == userPwConfirm.value){
        msg[2].textContent ='';
    } else{
        msg[2].textContent = "비밀번호가 일치하지 않습니다."
    }
}

//비밀번호 재확인
let userPwConfirm = document.getElementById("userPwConfirm");
    
    userPwConfirm.addEventListener('click', function(){
    userPwConfirm.style.backgroundColor = "white";
    userPwConfirm.style.outline = "2px solid black";
    });

    userPwConfirm.addEventListener('keyup', function(){
        f1(userPw, userPwConfirm);
    });


// name
let userName = document.getElementById("userName");
let regName = /^[가-힣a-zA-Z]/;
userName.addEventListener('click', function(){
    userName.style.backgroundColor = "white";
    userName.style.outline = "2px solid black";
});
userName.addEventListener('keyup', function(){
    if(regName.test(userName.value)==false){
        msg[3].textContent = '이름에는 숫자나 특수문자가 포함되지 않습니다.';
        if(userName.value.length==0){
            msg[3].textContent = '';    
        }
    } else {
        msg[3].textContent = '';
    }
});
