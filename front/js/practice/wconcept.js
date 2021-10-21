onload = function(){

let msg = document.getElementsByClassName('msg');
let userEmail = document.getElementById("userEmail");
let regEmail= /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i;

//아이디
userEmail.addEventListener('click',function(){
   this.style.backgroundColor = "white";
   this.style.outline = "2px solid black";
});
userEmail.addEventListener('keyup', function(){
    if(this.value == ''){
        msg[0].textContent ='이메일 아이디를 입력해주세요'; 
    }
   else if(regEmail.test(this.value)){
       msg[0].textContent = '사용 가능한 아이디입니다.';
    } else{
        msg[0].textContent = '아이디는 이메일 형식입니다.';  
        return false;
    }
});
userEmail.addEventListener('blur',function(){
    userEmail.style.backgroundColor = "#f2f2f2";
    userEmail.style.outline = 'none';
})

//비밀번호
let userPw = document.getElementById("userPW");
let regPw = /^[a-zA-Z0-9!@#$%^&*()-_+=?'"[}{},.]{8,16}$/;
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
        return false;
    } else if(regPw.test(userPw.value) && (regPwCheck<3)){
        msg[1].textContent = '영문, 숫자, 특수문자를 모두 사용하여 입력해주세요.';
        return false;
    } 
    
    if(/[0-9]{3}/.test(userPw.value)) {
        msg[1].textContent = "같은 글자 또는 숫자를 3번 연속 입력하실 수 없습니다.";
        return false;
    }
 
    f1(userPw, userPwConfirm);
    userPw.addEventListener('blur', function(){
            if (this.value.length >=8 && this.value.length<=16 ){
                if( regPwCheck==4) {
                msg[1].textContent =  "사용가능한 비밀번호입니다.";
                }
            }
        });
        return true;
    });
    userPw.addEventListener('blur', function(){
        userPw.style.backgroundColor = "#F2F2F2";
        userPw.style.outline = 'none';
    });

function f1(userPw, userPwConfirm){
    if(userPw.value == userPwConfirm.value){
        msg[2].textContent ='';
        
    } else{
        msg[2].textContent = "비밀번호가 일치하지 않습니다."
        return false;
    }
    return true;
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
    userPwConfirm.addEventListener('blur', function(){
        userPwConfirm.style.backgroundColor = "#F2F2F2";
        userPwConfirm.style.outline = 'none';
    });

// 이름확인하기
let userName = document.getElementById("userName");
let regName = /^[가-힣a-zA-Z]+/;
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
        return false;
    } else {
        msg[3].textContent = '';
    }
});

userName.addEventListener('blur', function(){
    userName.style.backgroundColor = "#F2F2F2";
    userName.style.outline = 'none';
});


// 생'년'월일  채우기
let yearList = document.getElementById('year');
let year = '';
year +=  '<option value="year">년도</option>';
for(let i=2007; i>=1907; i--){
    year += '<option value="'+i+'">'+i+'</option>';
}
document.getElementById('year').innerHTML= year;


// 생년'월'일채우기
let monthList = document.getElementsByClassName('month');
let month = '';
month +=  '<option value="month">월</option>';
for(let i=1; i<=12; i++){
    month += '<option value="'+i+'">'+i+'</option>';
}
document.getElementById('month').innerHTML = month;


// 생년월 '일' 채우기 
let dayList = document.getElementById('day');
let day ='';
day += '<option value="day">일</option>';
for(let i=1; i<=31; i++){
    day += '<option value="'+i+'">'+i+'</option>';
}
dayList.innerHTML = day;








////////////////////// 동의 관련 이벤트///////////////////////////////////


// 1). 전체 동의 누를때
let agreeAllBox = document.getElementById('agreeAllbox');
let agreeAllCheck = document.querySelector("#agreeAllbox > input");
let agreeAllimg = document.querySelector('#agreeAllbox span');
let agreeListimg = document.querySelectorAll('.agreeList span'); //배열
let agreeCheckbox = document.getElementsByClassName('checkbox'); //배열
// 전체동의 함수 
function fn_allAgree(){
if(agreeAllCheck.checked){   // 전체 동의 클릭했을 때 이미지 및 체크속성 트루
    for(let i=0; i<agreeCheckbox.length; i++){
        agreeCheckbox[i].checked = true;
        agreeListimg[i].className = 'checked';
        agreeAllimg.className = 'checked';
    }
} else {                   //전체 동의 취소하면 아이들이랑 부모 언체크로 바뀜 
    for(let i=0; i<agreeCheckbox.length; i++){
        agreeCheckbox[i].checked = false;
        agreeListimg[i].className = 'unchecked';
        agreeAllimg.className = 'unchecked';
    }
 }
}

 // 전체동의 클릭 이벤트 
agreeAllCheck.addEventListener('click', fn_allAgree);

// 2). 개별 동의 누를 때 
// 개별 동의 관련 함수 
function fn_agreeList() {
    for(let i=0; i<agreeCheckbox.length; i++){
        if(agreeCheckbox[i].checked ==false){   
            agreeListimg[i].className = 'unchecked';  
            agreeAllCheck.checked = false;
            agreeAllimg.className = "unchecked";   
        } else {                    // 아니면 이미지 언체크
            agreeListimg[i].className = 'checked';
            agreeAllCheck.checked = true;
            agreeAllimg.className = "checked";  
        }
    } // for문
} 
// 개별 클릭 이벤트 
// for(let j=0; j<agreeCheckbox.length; j++){
//     agreeCheckbox[j].addEventListener('click', fn_agreeList);
// }

for(let j=0; j<agreeCheckbox.length; j++){
    agreeCheckbox[j].onclick = function(){
        for(let i=0; i<agreeCheckbox.length; i++){
            if(agreeCheckbox[i].checked == false){   
                agreeListimg[i].className = 'unchecked';  
                agreeAllCheck.checked = false;
                agreeAllimg.className = "unchecked"; 
                return; 
            } else {
                agreeListimg[i].className = 'checked';
            }
            agreeListimg[i].className = 'checked';
        }
        agreeAllCheck.checked = true;
        agreeAllimg.className = "checked";  
       }
    }

}