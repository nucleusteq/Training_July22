  function validate() {
  var num= document.getElementById("phone_no").value;
  var phoneno = /^[6789]\d{9}$/;
  var password= document.getElementById("pass").value;
  var type= /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9])(?!.*\s).{8,15}$/;
    if( document.myForm.name.value == "" ) {
       alert( "Please Enter your name!" );
      
       return false;
    }
    if( document.myForm.username.value == "" ) {
       alert( "Please Enter your username!" );
    
       return false;
    }
    if( document.myForm.email.value == "" ) {
       alert( "Please Enter your Email!" );
       
       return false;
    }
    if( document.myForm.phone_no.value == "" || !num.match(phoneno )) {
       alert( "Please Enter your valid phone number!" );
       
       return false;
    }
    if( document.myForm.pass.value == "" || !password.match(type) ) {
       alert( "Please Enter Valid password" );
       
       return false;
    }if( document.myForm.conpass.value == "" || document.myForm.conpass.value == document.myForm.pass.value) {
       alert( "Password not matched! Try Again..." );
      
       return false;
    }if( document.myForm.radio1.value == checked|| document.myForm.radio2.value ==checked ||document.myForm.radio3.value==checked) {
       alert( "Please select gender" );
       
       return false;
    }
    
 }