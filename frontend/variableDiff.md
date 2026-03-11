Difference Between var, let, and const in JavaScript

In JavaScript, var, let, and const are used to declare variables.
A variable is used to store data.

Ex:
let name = "Naveen";

1. var (Old Way)
var is the old way of declaring variables in JavaScript.

Ex:
var age = 20;
console.log(age);

=> You can change the value.

var age = 20;
age = 25;

console.log(age);

O/P:
25

<!-- Var problems/limitations -->

var can be redeclared, which can cause confusion.

var city = "Hyderabad";
var city = "Delhi";

console.log(city);

O/P:
Delhi

=> Because of this problem, modern JavaScript rarely uses var.



2. let

let is the modern way to declare variables.

Use let when the value may change later.

Ex:
let score = 10;
score = 20;

console.log(score);

O/P:20

=> let Cannot Be Redeclared

Ex:
let name = "Ravi";
let name = "Rahul"; // Error 

values = "hello";
       ^

TypeError: Assignment to constant variable.
    at Object.<anonymous> (D:\codify-training\Java-full-stack-training\frontend\arrays.js:68:8)
    at Module._compile (node:internal/modules/cjs/loader:1706:14)
    at Object..js (node:internal/modules/cjs/loader:1839:10)
    at Module.load (node:internal/modules/cjs/loader:1441:32)
    at Function._load (node:internal/modules/cjs/loader:1263:12)
    at TracingChannel.traceSync (node:diagnostics_channel:328:14)
    at wrapModuleLoad (node:internal/modules/cjs/loader:237:24)
    at Function.executeUserEntryPoint [as runMain] (node:internal/modules/run_main:171:5)
    at node:internal/main/run_main_module:36:49

Node.js v22.22.0


3. const

const means constant.

The value cannot be changed after assigning.

Ex:
const country = "India";
console.log(country);

If you try to change it:

const country = "India";
country = "USA"; // Error

values = "hello";
       ^

TypeError: Assignment to constant variable.
    at Object.<anonymous> (D:\codify-training\Java-full-stack-training\frontend\arrays.js:68:8)
    at Module._compile (node:internal/modules/cjs/loader:1706:14)
    at Object..js (node:internal/modules/cjs/loader:1839:10)
    at Module.load (node:internal/modules/cjs/loader:1441:32)
    at Function._load (node:internal/modules/cjs/loader:1263:12)
    at TracingChannel.traceSync (node:diagnostics_channel:328:14)
    at wrapModuleLoad (node:internal/modules/cjs/loader:237:24)
    at Function.executeUserEntryPoint [as runMain] (node:internal/modules/run_main:171:5)
    at node:internal/main/run_main_module:36:49

Node.js v22.22.0





Quick Comparison:

| Feature            | var    | let   | const |
| ------------------ | ------ | ----- | ----- |
| Reassign value     |  Yes  |  Yes |  No  |
| Redeclare variable |  Yes  |  No  |  No  |
| Modern usage       |  Rare |  Yes |  Yes |
