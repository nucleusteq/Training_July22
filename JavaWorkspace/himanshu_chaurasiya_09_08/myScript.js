function check_num() {
    let phn = document.getElementById("in").value;
    let reg = /^[789]\d{9}$/;
    if (phn.match(reg)) {
        alert("SUCCESS! Nice Number.")
    }
    else {
        alert("Please enter a valid number.")
    }
}