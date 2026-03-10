// function -> javascript keyword
// getDetails -> function Name
// parameter -> data which we will pass through the function

// Example without parameters
function getDetails() {

    const data = 6;

    for (let i = 0; i < data; i++) {
        console.log(i);
    }

}

//  Example with parameters
function doOperation(a,b){
    console.log(a+b);
    console.log(a-b);
    console.log(a*b);
    console.log(a/b);
}

// calling a function to see the output
getDetails();
doOperation(5,4);

