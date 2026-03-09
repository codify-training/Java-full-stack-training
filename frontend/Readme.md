
<!-- Steps to Run JavaScript Code in VS Code -->

Step 1: Install Node.js

JavaScript runs using Node.js outside the browser.
Open browser.

Go to the official website:
https://nodejs.org

Download the LTS (Long Term Support) version.

Run the installer.

Click Next → Next → Install → Finish.

After installation, Node.js allows us to run JavaScript files using the terminal.




Step 3: Create a JavaScript File in project directory/ project folder

Click New File.

Name the file:

app.js

Important: JavaScript files must end with .js

Step 4: Write JavaScript Code

Example code:

const number = 3;
const number1 = 2;

console.log(number + number1);

Save the file using:

Ctrl + S (If Autosave is not enabled)


Step 5: Open Terminal in VS Code

Open the terminal inside VS Code.

Click:

Terminal → New Terminal

OR shortcut:

Ctrl + `

A terminal will open at the bottom.

Step 6: Run the JavaScript File

In the terminal type:

node app.js

Press Enter.

Step 8: See the Output

Output will appear in the terminal:

5

This means the JavaScript code executed successfully.

Example for Your Students

File: example.js

const age = 20;
const minAge = 21;

if(age > minAge){
    console.log("You can vote");
}
else{
    console.log("You cannot vote");
}

Run:

node example.js

Output:

You cannot vote
Quick Summary for Students

1️ Install Node.js
2️ Install VS Code
3️ Create a .js file
4️ Write JavaScript code
5️ Open Terminal
6️ Run using:

node filename.js