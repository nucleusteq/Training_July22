function check_num() {
    let Num = document.getElementById("valid").value;
    if (Num%2 == 0) {
        x= "Even"
    }
    else {
        x= "Odd"
    }
    document.getElementById("num_id").innerHTML=x;
    
}
