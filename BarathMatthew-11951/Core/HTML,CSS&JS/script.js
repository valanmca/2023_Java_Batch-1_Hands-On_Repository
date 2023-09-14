// This function clear all the values
function clearScreen() {
    document.getElementById("result").value = "";
}
 
// This function display values
function display(value) {
    document.getElementById("result").value += value;
}
function backspace() {
   
    var value=document.getElementById("result").value;
    document.getElementById("result").value=value.substr(0,value.length -1);
 
  }
 
// This function evaluates the expression and returns result
function calculate() {
    var p = document.getElementById("result").value;
    var q = eval(p);
    document.getElementById("result").value = q;
}
function clearScreen() {
    document.getElementById("result").value = "";
}
function clearScreen() {
    document.getElementById("result").value = "";
}


// function evaluates(value) {
//     content = document.getElementById("result").value;
//     temp = 0;
//     for(i = 0;i<content.length;i++){
//         if (typeof(i)==Number){
//             temp+=i;

//         }
//     }
// }