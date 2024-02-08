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

//Callback : s a function passed as an argument to another function, which will be invoked or executed later.
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

//rest parameter : allows you to represent an indefinite number of arguments as an array.
function sum(...numbers){
    return numbers.reduce((total, num) => total + num, 0 );
}
console.log(sum(1,2,3,4,5));

//// spread operator : allows you to expand elements of an array or object into individual elements.
// Using spread operator in function calls
const numbers = [1, 2, 3, 4, 5];
console.log(Math.max(...numbers)); // Output: 5

// Using spread operator in array literals
const arr1 = [1, 2, 3];
const arr2 = [4, 5, 6];
const mergedArray = [...arr1, ...arr2];
console.log(mergedArray); // Output: [1, 2, 3, 4, 5, 6]

// Using spread operator in object literals (ES9 and later)
const obj11 = { a: 1, b: 2 };
const obj22 = { c: 3, d: 4 };
const mergedObject = { ...obj11, ...obj22 };
console.log(mergedObject); // Output: { a: 1, b: 2, c: 3, d: 4 }

//Note : Rest parameter is used to take a variable number of arguments and turns them into an array while the spread operator takes an array or an object and spreads it
// Rest parameter is used in function declaration whereas the spread operator is used in function calls.

//JavaScript, there are several methods to create objects:
//Object literal
const objectLiteral = {name : "sow"};

//Constructor function
function constructorFuncN(name, age){
    this.name =  name;
    this.age = age;
}
const constructorFuncO = new constructorFuncN("sownd", 23);

//object.create()
const objN = Object.create(proto);

///Class syntax(include in ES6)
class classSyntax{
    constructor(name, age){
        this.name = name;
        this.age = age;
    }
}
const  classSyntaxO = new classSyntax("sown", 30);

//Factory Function :
function createPerson(name, age) {
    return {
      name: name,
      age: age
    };
  }
  const createPersonN = createPerson('John', 30);
  console.log(createPersonN);

//Promise : are objects that represent the eventual completion or failure of an asynchronous operation.

// Function that returns a promise
function fetchData() {
    return new Promise((resolve, reject) => {
      // Simulating an asynchronous operation
      setTimeout(() => {
        const success = true;
        if (success) {
          const data = "Hello, promises!";
          resolve(data); // Resolve the promise with the data
        } else {
          reject(new Error("Failed to fetch data")); // Reject the promise with an error
        }
      }, 1000);
    });
  }
  
  // Using the promise
  fetchData()
    .then((result) => {
      console.log(result); // Handle the resolved data
    })
    .catch((error) => {
      console.error(error.message); // Handle any errors
    });


//Async/await : async keyword is used to declare a function as asynchronous, and the await keyword is used to pause the execution of the function until a Promise is resolved,
async function fetchData() {
    return new Promise(resolve => {
        // Simulating an asynchronous operation
        setTimeout(() => {
            console.log("Data fetched!");
            resolve("Data");
        }, 1000);
    });
}

// Using async/await to handle the Promise
async function fetchDataAndLog() {
    try {
        const data = await fetchData();
        console.log("Async/Await completed:", data);
    } catch (error) {
        console.error("Async/Await error:", error);
    }
}

fetchDataAndLog();



//vue js
//life cycle hooks(onmounted, oncreated)
//reactivity in vue js (ref, computed)
//dif can create  reactivity in vuejs or not(composition(script setup), option API)
//Directives(vmoodel, vif,...)
//even handlers
//state manangement
//vuex 2or vue3
