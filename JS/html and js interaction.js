// <!-- html file
// <div>
//         <p id="context">Ajithye</p>
//         <button id="button">button</button>
//         <script src="nerve.js"></script> //this is fo to make a link between the source file to distination file
//     </div> -->


//Javascript file
const context = document.getElementById("context");
const button = document.getElementById("button");

const originalText = context.textContent;  // Store the original text
let isChanged = false;  // Flag to track the current state

button.addEventListener('click', function() {
    if (isChanged) {
        context.textContent = originalText;  // Set to original value
        isChanged = false;  // Update the state
    } else {
        context.textContent = "kadvule";  // Change the value
        isChanged = true;  // Update the state
    }
});
