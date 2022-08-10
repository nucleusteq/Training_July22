
   //  ^     #Match the beginning of the string
   // [789] #Match a 7, 8 or 9
   // \d    #Match a digit (0-9 and anything else that is a "digit" in the regex engine)
   // {9}   #Repeat the previous "\d" 9 times (9 digits)
   // $     #Match the end of the string
    
   function validate() {
      var num= document.getElementById("phone_no").value;
    var phoneno = /^[789]\d{9}$/;
    var password= document.getElementById("pass").value;
    var type= /^[a-zA-Z0-9]*$/;
      if( document.myForm.name.value == "" ) {
         alert( "Please provide your name!" );
        
         return false;
      }
      if( document.myForm.username.value == "" ) {
         alert( "Please provide your username!" );
      
         return false;
      }
      if( document.myForm.email.value == "" ) {
         alert( "Please provide your Email!" );
         
         return false;
      }
      if( document.myForm.phone_no.value == "" || !num.match(phoneno )) {
         alert( "Please provide your phone number!" );
         
         return false;
      }
      if( document.myForm.pass.value == "" || !password.match(type) ) {
         alert( "Please enter password" );
         
         return false;
      }if( document.myForm.conpass.value == "" || document.myForm.conpass.value == document.myForm.pass.value) {
         alert( "Password doesnot match" );
        
         return false;
      }if( document.myForm.radio1.value == checked|| document.myForm.radio2.value ==checked ||document.myForm.radio3.value==checked) {
         alert( "Please select anyone gender." );
         
         return false;
      }
      
   }