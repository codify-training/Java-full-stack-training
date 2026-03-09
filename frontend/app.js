// String : Stream of characters between double quotes.
const name = "naveen";

// number data types are all natural or whole numbers
const number = 3;

// Decimal data type like values ex: 5.55, 9.99 etc
const floatValue = 6.75;

// Boolean either true or false;
const isAccountActive = true;

// Ex: Variable is declared, but there is no data to it.
const data = null;

// Ex: If variable data values are there, but there is an exception or error getting we get undefiend issue.
const userData = undefined;

// Number data type values
const number1 = 2;


// Arithmetic Operations:

//  Addition operation : adding of two numbers
console.log(number + number1);

// Subtraction : Subtracting of two numbers
console.log(number - number1);

// Multiplication: Multiplying of numbers
console.log(number * number1);

// Division: Dividing of two numbers
console.log(number / number1);



// If else Statements

// Ex-1:
const age = 20;
const minAge = 21

if (age > minAge) {
    console.log("You can vote");
}
else {
    console.log("you cannot vote");
}

// Ex-2:
const feb = 30;

if (feb == 28) {
    console.log("not a leap year");
}
else if (feb == 29) {
    console.log("it is a leap year");
}
else {
    console.log("not found");
}

// difference b/w double equals and triple equals

// number data type
const numValue = 12;

// string data type
const dataValue = "12";

if (numValue === dataValue) {
    console.log("success");
} else {
    console.log("un equal data types");
}

// looser quality
console.log(numValue==dataValue);

// Strict equality
console.log(numValue===dataValue);
