//High order Function
//def : - either takes another function as an argument, or returns a function. 
function operate(func, a, b){
    return func(a,b);
}
function add(a,b){
    return a+b;
}
function sub(a,b){
    return a-b;
}
let result = operate(add, 2,3);
let result1 = operate(sub,5,4);
console.log(result, result1)

//this keyword : refers to the object that is currently executing the function.
var obj = {
    name : "sowndu",
    getName: function(){
        console.log(this.name);
    }
}
var getName = obj.getName;
var obj2 = { name: "sona", getName};// in that we are not declared getName and calling below line we will get error
obj2.getName();

//selef invoking or IIFE : It runs automatically as soon as the JavaScript engine encounters it
(function() {
    console.log("This is a self-invoking function!");
  })();

//call method :  Method to directly invoke a function with a specified context and individual arguments.
function greet(name){
    console.log(`Hello, ${name}! My name is ${this.name}`);
}
const person = {name : "Sona"};
greet.call(person,"Ranju");

//apply method : Method to invoke a function with a specified context and arguments as an array.
function greet1(name){
    console.log(`Hello, ${name}! My name is ${this.name}`);
}
const person1 = {name : "sona"};
greet1.apply(person1,["Ranju"])

//Bind(): Method to create a new function with a specified context without immediate invocation.
function greet2(name){
    console.log(`Hello, ${name}! My name is ${this.name}`);
}
const person2 = {name:"janu"};
const newOne = greet2.bind(person2);
newOne("alice");

//curring : breaking down a function that takes multiple arguments into a chain of single-argument functions.
const multiply = (a) => (b) => a * b;

console.log(multiply(5)(4));

//Scope : accessibility of variables and functions at various parts of one’s code.
// global- accessed from anywhere,
//  local or function , block
function functionScope(){
    var a =2;
    console.log(a*2);
    var multiplyByTwo = function(){
        console.log(a*2);
    }
}
// console.log(a);//reference error
// multiplyByTwo();//reference error

//scope chain
function outerFunction(){
    const outerVariable = 'Outer';

    function innerFunction(){
        console.log(outerVariable);
    }
    innerFunction();
}
outerFunction();

//Closures : remember the variables and functions that are declared in its outer scope.
function createCounter(){
    let count = 0;

    return function(){
        return ++count;
    }
}
const counter = createCounter();
console.log(counter());
console.log(counter());
//Note : This ability of a function to store a variable for further reference even after it is executed is called Closure.

//Callback : Functions that are used as an argument to another function are called callback functions.
//or  passed as an argument to another function and is executed after a particular operation or task is completed.
// Function with a callback parameter
function fetchData(callback) {
    // Simulating an asynchronous operation
    setTimeout(() => {
      const data = "Hello, callback!";
      callback(data); // Invoke the callback with the data
    }, 1000);
  }
  
  // Callback function to handle the data
  function handleData(result) {
    console.log(result);
  }
  
  // Using the callback
  fetchData(handleData);





//Promise
//Async/await


//vue js
//life cycle hooks(onmounted, oncreated)
//reactivity in vue js (ref, computed)
//dif can create  reactivity in vuejs or not(composition(script setup), option API)
//Directives(vmoodel, vif,...)
//even handlers
//state manangement
//vuex 2or vue3
