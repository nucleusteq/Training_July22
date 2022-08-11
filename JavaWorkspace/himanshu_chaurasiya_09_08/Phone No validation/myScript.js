function check_num() 

{
    let phn = document.getElementById("valid").value;
    let reg = /^[789]\d{9}$/;
    if (phn.match(reg)) {
        alert("SUCCESS! Nice Number.")
    }
    else {
        alert("Please enter a valid number.")
    }

    let passw = document.getElementById("pass").value;
    let co_pass = document.getElementById("conf_pass").value;
    let pass_reg = /[0-9]{1,}[A-Z a-z]{1,}/;
    if (passw.match(pass_reg)) {

        passw == co_pass ? alert("SUCCESS! Nice Password.") : alert("Your Password Does Not Match!");
    }
    else {
        alert("Please enter a valid password.");
    }
}