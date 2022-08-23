function myFunction(x) {
         
    switch(x){
       case 'fname': validateFullName(x)
        break;
        case 'email':validateEmailId(x)
        break;
        case 'password':validatePassword(x)
        break;
        case 'phoneNumber':validatePhoneNumber(x)
        break;
        case 'userName':validateUserName(x)
        break;
        case 'confirmPassword':confirmPassword(x)
        break;
    }
   }

   function validateFullName(x){
    let pattern=/^[A-Za-z]+[A-Za-z\s]*$/
    let val=document.getElementById(x).value;
    if(pattern.test(val)){
        document.getElementById(x).style.outlineColor="green";
        document.getElementById(x).style.borderColor="green";
        document.getElementById(x).style.borderWidth="3px";
       document.getElementById("input-container1").removeAttribute('data-error');
    }
    else{
        document.getElementById(x).style.outlineColor="red";
        document.getElementById(x).style.borderColor="red";
        document.getElementById(x).style.borderWidth="3px";
        document.getElementById("input-container1").setAttribute('data-error','Full Name should have only alphabets');
        document.getElementById("formSubmit").disabled=true;
    }
   }
   function print(){
    console.log("Button Submit");
   }

   function validateEmailId(x){
    let pattern=/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    let val=document.getElementById(x).value;
    if(pattern.test(val)){
        document.getElementById(x).style.outlineColor="green";
        document.getElementById(x).style.borderColor="green";
        document.getElementById(x).style.borderWidth="3px";
        document.getElementById("input-container2"). removeAttribute('data-error');
    }
    else{
        document.getElementById(x).style.outlineColor="red";
        document.getElementById(x).style.borderColor="red";
        document.getElementById(x).style.borderWidth="3px";
        document.getElementById("input-container2").setAttribute('data-error','Invalid email address format');
    }
   }

   function validatePhoneNumber(x){
    let pattern=/\b(9|8|7|6)/;
    let val=document.getElementById(x).value;
    if(val.length == 10 && pattern.test(val)){
        document.getElementById(x).style.outlineColor="green";
        document.getElementById(x).style.borderColor="green";
        document.getElementById(x).style.borderWidth="3px";
        document.getElementById("input-container5"). removeAttribute('data-error');
    }
    else{
        document.getElementById(x).style.outlineColor="red";
        document.getElementById(x).style.borderColor="red";
        document.getElementById(x).style.borderWidth="3px";
        document.getElementById("input-container5").setAttribute('data-error','Invalid phone number');
    }
   }

   function validatePassword(x){
        let pattern=/^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9])(?!.*\s).{8,15}$/;
        let val=document.getElementById(x).value;
    if(pattern.test(val)){
        document.getElementById(x).style.outlineColor="green";
        document.getElementById(x).style.borderColor="green";
        document.getElementById(x).style.borderWidth="3px";
        document.getElementById("input-container3"). removeAttribute('data-error');
    }
    else{
        document.getElementById(x).style.outlineColor="red";
        document.getElementById(x).style.borderColor="red";
        document.getElementById(x).style.borderWidth="3px";
        document.getElementById("input-container3").setAttribute('data-error','Invalid Password');
    }
   }

   function validateUserName(x){
    let val=document.getElementById(x).value;
    if(!val.includes('-')){
        document.getElementById(x).style.outlineColor="green";
        document.getElementById(x).style.borderColor="green";
        document.getElementById(x).style.borderWidth="3px";
        document.getElementById("input-container4"). removeAttribute('data-error');
    }
    else{
        document.getElementById(x).style.outlineColor="red";
        document.getElementById(x).style.borderColor="red";
        document.getElementById(x).style.borderWidth="3px";
        document.getElementById("input-container4").setAttribute('data-error','User Name should not contain dash -');
    }
   }

   function confirmPassword(x){
    let password=document.getElementById('password').value;
    let confirmPassword=document.getElementById('confirmPassword').value;
    if(password === confirmPassword){
        document.getElementById(x).style.outlineColor="green";
        document.getElementById(x).style.borderColor="green";
        document.getElementById(x).style.borderWidth="3px";
        document.getElementById("input-container6"). removeAttribute('data-error');
    }
    else{
        document.getElementById(x).style.outlineColor="red";
        document.getElementById(x).style.borderColor="red";
        document.getElementById(x).style.borderWidth="3px";
        document.getElementById("input-container6").setAttribute('data-error','Does not match password');
    }
   }