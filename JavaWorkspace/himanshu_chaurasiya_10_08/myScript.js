function check_num() {
    let phn = document.getElementById("valid").value;
    if (phn%2 == 0) {
        x= "Its even"
    }
    else {
        x= "Its odd"
    }
    document.getElementById("num_id").innerHTML=x;
    
}