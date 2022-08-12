function check_Password() {
    let Password= document.getElementById("in").value;
    let reg = /^[apple Apple]\d{@ # % }$/;
    if (Password.match(reg)) {
        alert("Hurray.It is a Valid Password.")
    }
    else {
        alert("Please enter a valid Password.")
    }
}