//console.log("Hello Js");

function reverseString(str) {
    var newString = "";
    for (var i = str.length - 1; i >= 0; i--) {
        newString += str[i];
    }
    document.write(newString);
}
// reverseString('hello');