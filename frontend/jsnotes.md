1. Variables and Data Types

In JavaScript, we use variables to store data.
const is used to create a variable whose value cannot be changed later.

String
const name = "naveen";

String means a collection of characters inside quotes.

Examples:

"hello"
"JavaScript"
"naveen"

Here:

Variable name → name

Value stored → "naveen"

Number
const number = 3;

Numbers represent numeric values.

Examples:

1
20
100

These are whole numbers (integers).

Decimal Numbers
const floatValue = 6.75;

Numbers with decimal points are called floating point numbers.

Examples:

5.5

9.99

3.14

Boolean
const isAccountActive = true;

Boolean has only two values:

true

false

It is commonly used for conditions and decision making.

Example:

isLoggedIn = true

isAdmin = false

Null
const data = null;

null:
The variable exists but has no value.

Example situation:

You created a variable but intentionally set it to empty.

Undefined
const userData = undefined;

undefined means:
The variable is declared but no value is assigned yet.

Example:

const user;
console.log(user); // undefined


2. Arithmetic Operations
const number1 = 2;

// Now we perform mathematical operations.

Addition
console.log(number + number1);

Adds two numbers.

Example:

3 + 2 = 5

Output:
5

Subtraction
console.log(number - number1);

Subtracts numbers.

Example:

3 - 2 = 1

Output:
1


Multiplication
console.log(number * number1);

Multiplies numbers.

Example:

3 × 2 = 6

Output:

6
Division
console.log(number / number1);

Divides numbers.

Example:

3 ÷ 2 = 1.5

Output:
1.5


3. If–Else Statements (Decision Making)

if else is used to make decisions in code.

Syntax:

if(condition){
   // code runs if condition is true
}
else{
   // code runs if condition is false
}

Example 1: Voting Age
const age = 20;
const minAge = 21

Here:

age → person's age

minAge → minimum age required

if (age > minAge) {
    console.log("You can vote");
}
else {
    console.log("you cannot vote");
}

Explanation:

Condition checked:

20 > 21

This is false, so output:

you cannot vote
Example 2: Leap Year Check
const feb = 30;

Checking number of days in February.

if (feb == 28) {
    console.log("not a leap year");
}
else if (feb == 29) {
    console.log("it is a leap year");
}
else {
    console.log("not found");
}

Flow:

Check if feb == 28

If not, check feb == 29

Otherwise run else

Since feb = 30, 
output:
not found


4. Double Equals vs Triple Equals

JavaScript has two types of comparison operators.

Variables
const numValue = 12;
const dataValue = "12";

numValue → number

dataValue → string

Strict Equality (===)
if (numValue === dataValue) {
    console.log("success");
} else {
    console.log("un equal data types");
}

=== checks:

Value
Data type

Here:

12 (number)
"12" (string)

Types are different → condition is false

Output:
un equal data types


Loose Equality (==)
console.log(numValue==dataValue);

== checks only value, not data type.

JavaScript automatically converts "12" to number.

So:

12 == "12"

Result:

true
Strict Equality
console.log(numValue===dataValue);

Checks value + type.

Result:
false


| Concept              | Meaning                            |
| -------------------- | ---------------------------------- |
| String               | Text data inside quotes            |
| Number               | Numeric values                     |
| Float                | Decimal numbers                    |
| Boolean              | true / false                       |
| Null                 | Empty value intentionally          |
| Undefined            | Variable declared but not assigned |
| Arithmetic Operators | +, -, *, /                         |
| If Else              | Used for decision making           |
| ==                   | Checks value only                  |
| ===                  | Checks value and type              |
