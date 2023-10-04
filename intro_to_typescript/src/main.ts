// Number
let number: number = 10;

// String
let myName: string = "David";

// Boolean
let isWindy: boolean = true;

//Any -> any type you want
const apiResponse: any = {
  data: {
    id: 1,
    name: "Jason",
  },
};

// Arrays
let numbers: number[] = [1, 2, 3, 4, 5];

let fizzBuzz: (string | number)[] = [1, 2, "fizz", 4, "buzz"];

// Type definitions - union types
type FizzBuzzType = string | number;

let fizzBuzzTypeId: FizzBuzzType[] = [1, 2, "fizz", 4, "buzz"];

// Functions
const add = (a: number, b: number) => {
  return a + b;
};

console.log(add(1, 5));

const sayHello = (name: string) => {
  console.log(`Hello, ${name}`);
};

sayHello("David");

const canBuyDrink = (age: number): boolean => {
  return age >= 18;
};

const squaredNumbers = (numbers: number[]) => {
  return numbers.map((num) => num ** 2);
};

//ENUMS - start with capital letter
enum Status {
  INCOMPLETE = 0,
  COMPLETE = 1,
}

const addTask = (name: String, status: Status) => {
  console.log(`added ${name}: ${status}`);
};

addTask("Learn TypeScrip", Status.INCOMPLETE);

// Type Definitions 2 
type Rating = 1 | 2 | 3 | 4 | 5;

const rateLesson = (lessonId: string | number, rating: Rating) => {
  console.log(`You rated ${lessonId}: ${rating}`)
}

rateLesson("typescript", 5);

// Objects 
//
type UserType = {
  username: string;
  password: string;
}

const login = (details: UserType) => {
  console.log(`You logged in as ${details.username}`)
}

//const user = {username: "tsjs", password: "1234", age: 12};

const user: UserType = {
  username: "tsj",
  password: "1324"
}

login(user);

// Interfaces
interface IUser {
  username: string;
  password: string;
}

const user2: IUser = {
  username: "Jacksparrow",
  password: "arrow"
}

interface IEmployee extends IUser, ILogin{
  employee_id: string;
}

interface ILogin {
  login: (details: UserType) => void;
}

const employee: IEmployee = {
  username: "employee 1",
  password: "password",
  employee_id: "ASDA231321",
  login,
}

// Generics
const filter = <T>(arr: T[], filterFunction: (num: T) =>  boolean): T[] => {
  return arr.filter(filterFunction);
}

const evenNumbers = filter(numbers, (num) => num % 2 == 0);

const words = ["snake", "sausage", "gareth", "cabbage"]
const stringStartingWithS = filter(words, (word) => word[0] == "s");

interface Pair<T, U> {
  first: T;
  second: U;
}

const pairObj: Pair<string, number> = {
  first: "Hello",
  second: 10
}
