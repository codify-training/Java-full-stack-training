1. Object in JavaScript

An Object is used to store data in key–value pairs.

Key → property name
Value → actual data stored

Objects are useful to represent real-world entities like a user, product, student, etc.

const user = {
name: "naveen",
username: "mahesh",
mobile: "64792667878",
status: true
};

Accessing Object Values:
We can access object values using the dot operator (.)

Output:

console.log(user.name); // naveen
console.log(user.username); // mahesh
console.log(user.mobile); // 64792667878
console.log(user.status); // true

Ex-2:
const student = {
name: "Rahul",
age: 20,
course: "B.Tech"
};

console.log(student.course);

2. Arrays in JavaScript

An Array is an ordered collection of values.

Arrays can store multiple values in a single variable and also can store same values.

const data = [1, "name", true, 9.99];

const dummyData = [1, "name", true, 9.99,"name",true];

Here the array contains different data types:

=> number
=> string
=> boolean
=> decimal

3. Indexing in Arrays

Each element in an array has an index number.

Index always starts from 0.

const data = [1, "name", true, 9.99];

| Index | Value  |
| ----- | ------ |
| 0     | 1      |
| 1     | "name" |
| 2     | true   |
| 3     | 9.99   |

console.log(data[0]); // 1
console.log(data[1]); // name
console.log(data[2]); // true
console.log(data[3]); // 9.99

Positive Indexing
[0,1,2,3] -> Left to Right

Negative Direction (conceptual)
[-4,-3,-2,-1] -> Right to Left

4. Functions in JavaScript

A Function is a block of code used to perform a specific task.

Functions help to:
=> reuse code
=> organize programs
=> avoid repetition

function functionName() {
// block of code
}

5. Example Function

function getDetails() {

    const data = 6;

    for (let i = 0; i < data; i++) {
        console.log(i);
    }

}

Explanation:

function → JavaScript keyword

getDetails → function name

{} → block of code 

data → variable

for loop → repeats code multiple times

0
1
2
3
4
5
