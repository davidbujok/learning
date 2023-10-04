"use strict";
// Number
let number = 10;
// String
let myName = "David";
// Boolean
let isWindy = true;
//Any -> any type you want
const apiResponse = {
    data: {
        id: 1,
        name: "Jason",
    },
};
// Arrays
let numbers = [1, 2, 3, 4, 5];
let fizzBuzz = [1, 2, "fizz", 4, "buzz"];
let fizzBuzzTypeId = [1, 2, "fizz", 4, "buzz"];
// Functions
const add = (a, b) => {
    return a + b;
};
console.log(add(1, 5));
const sayHello = (name) => {
    console.log(`Hello, ${name}`);
};
sayHello("David");
const canBuyDrink = (age) => {
    return age >= 18;
};
const squaredNumbers = (numbers) => {
    return numbers.map((num) => num ** 2);
};
//ENUMS - start with capital letter
var Status;
(function (Status) {
    Status[Status["INCOMPLETE"] = 0] = "INCOMPLETE";
    Status[Status["COMPLETE"] = 1] = "COMPLETE";
})(Status || (Status = {}));
const addTask = (name, status) => {
    console.log(`added ${name}: ${status}`);
};
addTask("Learn TypeScrip", Status.INCOMPLETE);
const rateLesson = (lessonId, rating) => {
    console.log(`You rated ${lessonId}: ${rating}`);
};
rateLesson("typescript", 5);
