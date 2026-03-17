//  DOM => Document Object Model: when ever we need an interaction with html elements we use DOM.

// getting element through id selector
const myButton = document.getElementById("btn");

// getting element through class selector
// const myButton= document.querySelector(".btn");

const headingElement = document.createElement("h2");

headingElement.textContent = 'hello word';
document.body.appendChild(headingElement);

myButton.addEventListener("click", function () {
    alert("form submitted!");
})




function buttonClicked() {
    // alert("event clicked!");
    headingElement.textContent = 'hello word';
    headingElement.style.color = "blue";
    headingElement.style.fontSize = "30px";
    document.body.appendChild(headingElement);

    // styles
    myButton.style.backgroundColor = "red";
    myButton.style.border = "1px";
    myButton.style.padding = "10px";
    myButton.style.color = "white";
    myButton.style.borderRadius = "10px"
}

// We are calling this function when ever page is loaded!
// buttonClicked();