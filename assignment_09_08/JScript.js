function check_num() {
    let phn = document.getElementById("in").value;
    let reg = /^[789]\d{9}$/;
    if (phn.match(reg)) {
        alert("Congratulation Buddy!! Awesome Number")
    }
    else {
        alert("Please Enter a valid number.")
    }
}