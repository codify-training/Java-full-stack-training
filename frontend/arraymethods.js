//  Array Methods

// 1. pop() -> It will removes last elemen of the array
const dummy = ["a", true, 2, 9.388];

const lastElement = dummy.pop();
console.log(dummy);

// it will return last element as result 
console.log(lastElement);

// 2.Shift() -> It will removes first element of the array;
const firstElement = dummy.shift();
console.log(dummy);
// // get first element
console.log(firstElement);

// 3. unshift() -> It will add element at the start of the array
const newArray = ["naveen", true, 900, 1.99];
newArray.unshift("hello");

console.log(newArray);

// 4.IndexOf() => It will return index number as output for given element, If the given element in the array is not present then It will return as -1 output
const index = newArray.indexOf(9);
console.log(index);

// Includes() => It will return boolean value as output, if the given element is present in the array
const isExisted = newArray.includes(8);
console.log(isExisted);

// Join() => it will return string as output by joining all elements of array
const joinedArray = newArray.join(",")
console.log(joinedArray);

// Reverse() => It will reverse the array

const data = [35, 2.66, true, .7, "demo"];

// A B C D E F G H I J K L M N O P Q R T S U V X Y Z
const values = ["naveen", "kumar", "reddy"];

const details = [90, 80, -20, 1.99, .99];

const reversedArray = data.reverse();
console.log(reversedArray);

// Sort() => It will sort order the array i.e. re-arrange the elements in the array
const sorted = data.sort();
const valuesSorted = values.sort();
const detailsSorted = details.sort();

console.log(valuesSorted);
console.log(detailsSorted);
console.log(sorted);

// Concat() => It will merge two or more arrays and return the final new array as output
const colors1 = [.4,9.99,0.2,99.99];

const clrs = [21,20,4,9,67,53]
const fruits = ["yellow", "pink", "black"];
const result = colors1.concat(fruits);

// conact method will merge colors1 and fruits array and return the final new array as output, and that output will be stored in result variable as output
console.log(result);


// here, nunmbers will be converted into string and then sorted in ascending order, because sort method by default will sort the elements in string format (sort will be happened like ALPHABETICAL ORDER)
console.log(clrs.sort());

// ascending order
clrs.sort((a,b) => a - b);
console.log(clrs);

// descending order
clrs.sort((a,b) => b - a);
console.log(clrs);

// -----------------------------------------------

// find() 
const array = [3, 5, 10, true, "hello"];

const secondArray = ["naveen", "mahesh", "jyo", 7, 9, 10, null]

const newValue = secondArray.find((e) => e === null);
console.log(newValue);