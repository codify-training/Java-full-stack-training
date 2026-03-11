
// arrays are used to store multiple values in a single variable
const arr = [5, 12, 8, "hello", 44];
console.log(arr);

// getting length of array
console.log(arr.length);

// negative indexing method for array
console.log(arr.at(-1)); // 44
console.log(arr.at(-2)); // hello
console.log(arr.at(-3)); // 8
console.log(arr.at(-4)); // 12
console.log(arr.at(-5)); // 5

// without for loop line by writing one by one, we can access the array elements using index numbers
console.log(arr[0]); 
console.log(arr[1]); 
console.log(arr[2]); 
console.log(arr[3]); 
console.log(arr[4]);  

// with for loop, no need to write one by one, we can access the array elements using index numbers
for (let index = 0; index < arr.length; index++) {
    const element = arr[index];
    console.log("index number: " + index + " => " + element);
}

// this is for of loop, we can access the array elements without using index numbers
const animals = ["dog","cat","rabiit","snake"];
for(const item of animals){
    console.log(item);
}

// variable naming
const username = "naveen";
const userPassword = "*****";
const fullName = "";
const emailAddress = "";


// funcation naming
// good parctice
// Syntax: 
function functionName(parameters) {
    // code to be executed on function call
}

// bad practice
function a(parameters) {
    // code to be executed on function call
}


// old way of declaring varibles
var details = "details";
details = 10;
details = 10;
// console.log(details);

// block scope means anywhere  outside the function 
let userData = "none";
userData = "hello";
// console.log(userData);


function getUserDetails() {

    // function level variables are only accessible inside the function, we cannot access outside the function    
    const animal = "";
    let userData = "none";
    userData = "hello";
    console.log(userData);

}

// calling the function to execute the code inside the function
getUserDetails();


// -------------------------------------------------


// Javascript built-in Methods
const str1 = "my name is";
const str2 = "naveen";

console.log(str1+str2);

// concatenation method => adding of two variables with string data type
console.log(str1.concat(str2));

// getting length of variable
console.log(str1.length);

// indexing method for javascript
console.log(str1.at(0));

// return boolean value as result, whether given data is present in the variable or not
console.log(str1.includes("naveen"));

// return boolean value as result, whether given data is ending with the variable 
console.log(str1.endsWith("is"));