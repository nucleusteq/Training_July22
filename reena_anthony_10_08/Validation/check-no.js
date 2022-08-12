function phonenumber(inputtxt)
{
  var phoneno = /^[6789]\d{9}$/;
  if(inputtxt.value.match(phoneno))
  {
      alert("A valid Phone Number")   
      return true;
  }
  else
  {
     alert("Not a valid Phone Number");
     return false;
  }
  }