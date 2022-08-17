function validate() {
    var num= document.getElementById("phone").value;
  var phoneno = /^[6789]\d{9}$/;
  var password= document.getElementById("pass").value;
  var type= /^[a-zA-Z0-9]*$/;
    if( document.myForm.name.value == "" ) {
       alert( "Name cannot be blank" );
      
       return false;
    }
    if( document.myForm.username.value == "" ) {
       alert( "Username cannot be blank" );
    
       return false;
    }
    if( document.myForm.email.value == "" ) {
       alert( "Email cannot be blank" );
       
       return false;
    }
    if( document.myForm.phone_no.value == "" || !num.match(phoneno )) {
       alert( "Phone number cannot be blank or invalid type" );
       
       return false;
    }
    if( document.myForm.pass.value == "" || !password.match(type) ) {
       alert( "Password cannot be blank" );
       
       return false;
    }if( document.myForm.conpass.value == "" || document.myForm.conpass.value == document.myForm.pass.value) {
       alert( "Password does not match" );
      
       return false;
    }if( document.myForm.radio1.value == checked|| document.myForm.radio2.value ==checked ||document.myForm.radio3.value==checked) {
       alert( "Select a gender" );
       
       return false;
    }
    
 }