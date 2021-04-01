let variableName = "Content / Hello World";
console.log(variableName);
interface User {
    name: string;
    id: number;
}
const user: User = {
	name: "joe145",
	id: 1
};
let completed: boolean = false;
let color: string = "blue";
color = 'red';
let numArray: number[] = [1, 2, 3];
let list: Array<number> = [1, 2, 3];
// Declare a tuple type
let x: [string, number];
// Initialize it
x = ["hello", 10]; // OK
// Initialize it incorrectly
// x = [10, "hello"]; // Error
// Type 'number' is not assignable to type 'string'.
// Type 'string' is not assignable to type 'number'.
enum Color {
    Red = 1,
    Green = 2,
    Blue = 4,
  }
  let c: Color = Color.Green;
  let notSure: unknown = 4;
notSure = "maybe a string instead";
// OK, definitely a boolean
notSure = false;

// declare function getValue(key: string): any; 
// const str: string = getValue("myString"); 

// any allows us to avoid the static type checking think of it as an offswitch for typescript 
let looselyTyped: any = 4; 
// looselyTyped.ifItExists(); 
// looselyTyped.toFixed();

let strictlyTyped: unknown = 4; 
// typescript will check for properties on strictlytyped
// thus the line below will not work
// strictlyTyped.toFixed(); 

function warnUser(): void {
    console.log("This is my warning message"); 
}

warnUser(); 

// null is an assigned value. It means nothing. Undefined typically means a variable has been declared but not defined yet. 

let someValue: unknown = "this is a string"; 
// since unknown does not have the prop length, 
// the line below is illegal 
// ;et strLength: number = someValue.length; 

// let strLength: number = (someValue as string)
let strLength: number = (<string>someValue).length 

interface LabeledValue {
    label: string; 
}

// note that we can use interfaces 
// to define constraints for paramenters
// the interface only cares about the property label 
// any object that we pass in as an argument 
// can have any amount of extra properties on it  
function printLabel(labeledObj: LabeledValue) {
    console.log(labeledObj.label); 
}

let myObj = {size: 10, label: "size 10 object"};
printLabel(myObj);

interface square {
    color?: string; 
    width: number; 
}

let mySquare: square = {width: 100, color: "red" }; 

interface Point {
    readonly x: number;  
    readonly y: number; 
}

let p1: Point = {x: 10, y: 20}; 

//  p1.x  = 5;

let readOnlyArray: ReadonlyArray<number> = [1, 2, 3, 4]; 
// readOnlyArray[0] = 2; 
// readOnlyArray.push(5); 

interface SearchFunc {
    (source: string, subString: string): boolean; 
}

let mySearch: SearchFunc; 

mySearch = function (source: string, subString: string) {
    let result = source.search(subString); 
    return result > -1; 
}

// it doesn't matter what we call the parameters, 
// they will always have a type association via the interface
// the function will  always need to return a boolean
let otherSearch:SearchFunc = function (src, sb) {
    return true;  
}
 
interface ClockInterface { 
    currentTime: Date;
    setTime(d: Date): void; 
}

class Clock implements ClockInterface {
    currentTime: Date = new Date(); 
    setTime(d: Date) {
        this.currentTime = d; 
    }
    constructor(h: number, m:number) {}
}

interface Shape {
    color: string; 
}

interface Square extends Shape {
    // the proerty color is inheritied from shape 
    // color: string; 
    sideLength: number; 
}

let square = {} as Square;
// you can declare square like below as well
// let square: Square; 

square.color = "blue"; 
square.sideLength = 10;  

interface PenStroke {
    penWidth:  number; 
}

interface StrokedSquare extends Shape,  PenStroke {
    sideLength: number; 
}

let StrokedSquare: StrokedSquare = {
    color: "blue", 
    sideLength: 10, 
    penWidth: 5.0, 
}

function add(x: number, y:number): number {
    return x + y; 
}

let y = (x) => x + 2; 
console.log(add(5, 3)); 
console.log(y(5)); 

function buildName(firstName:  string, lastName:  string) { 
    return `${firstName} ${lastName}`; 
}

// below will throw an error 
// let result1 = buildName("Bob"); 
let result = buildName("Bob", "Adams"); 

function defaultName(firstName: string, lastName = "Smith") {
    return firstName + " " + lastName; 
}
let defaultResult = defaultName("Bob"); 
console.log(defaultResult); 

function restName(firstName: string, ...restOfName: string[]) {
    return firstName + " " + restOfName.join(" "); 
}

let employeeName = restName("Joseph", "Samuel", "Lucas", "MacKinzie");

console.log(employeeName); 

function padLeft(value:string,  padding:  string | number) {
    if (typeof padding === "number") {
        return Array(padding + 1).join(" ") + value;
    }
    if (typeof padding === "string") {
        return padding + value; 
    }
    throw new Error(`Expected string`)
}
