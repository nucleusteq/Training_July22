const string="alpha06"
const regex = new RegExp(/^(?=.*[a-zA-Z])(?=.*[0-9])[A-Za-z0-9]+$/);
console.log(regex.test(string))