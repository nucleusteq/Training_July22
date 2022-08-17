function reverseString() {
    const stringtext = document.getElementById("str").value;
    let newString = "";
    for (let i = stringtext.length - 1; i >= 0; i--) {
        newString += stringtext[i];
    }
    console.log(newString)
}
