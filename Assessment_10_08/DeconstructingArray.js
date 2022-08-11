//Destructuring Array with Functions
{
    function getArray() {
    return ["Hello", "I" , "am", "Yuvraj"];
} 
let [var1,var2] = getArray();

console.log(var1);
console.log(var2);
}
{
//Skipping Items in an Array
let [var1,,,var2] = ["Hello", "I" , "am", "Yuvraj"];

console.log(var1);
console.log(var2);
}
{
//Declaring Variables before Assignment
let var1, var2;
[var1, var2] = ["Hello", "I" , "am", "Yuvraj"];

console.log(var1);
console.log(var2);
}
{
//Basic Array Destructuring
let introduction = ["Hello", "I" , "am", "Yuvraj"];
let [var1, var2] = introduction;

console.log(var1);
console.log(var2);
}