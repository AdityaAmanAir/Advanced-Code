///JavaScript is not made on C++, but most JavaScript engines are implemented in C++
var x="Hello World!"
var message ="hi"

function pi(){
    return 3.1415
}

var b = function(){console.log("Variable B")}
// console.log(b)
console.log(message)
b();

function compare (x,y){
    return x>y;
}
console.log(pi());
console.log(compare(15,"7"));
console.log(compare(5,"7")); //Strings and Numbers are compaired , lol
var k=7

console.log(compare(15,k));
console.log(compare(15,"k"));//Here it is treated as string "k" vs 15
console.log(compare(11000005,"k")); // string and numbers cannot be compaired , not by ascii value 
console.log("k");
console.log(compare("l","k"));//l>k
console.log(compare("a","k"))//a<k

//functions defined in the scope matters , not where function is implemented !!!!!
//// function called in the othere scope will not refer to the element of called scope, it will refer to the elements of denined scope !

console.log("this is how we use multiple thing together"  +     message);

function a(){
    var message ="NOTTT-HI"
    console.log("in a "+message)
    bb();
};
function bb(){
    console.log("bb "+message);
};
a();

////////////////////////////////////////////////

//  JavaScript has 7 Build in type (6 primitive and 1 object type)

////////////////////////////////////////////////

////////OBJECT TYPE
const person={
    firstName: "Aditya",
    lastname: "Aman",
    social:{
        linkedin:"AdityaAmanAir",
        github:"adityamanair"
    }
}
/////////////
var xx;
console.log(xx);
if(xx==undefined){
    console.log(xx +" xx is undefined")
}
xx=5;
if (xx!=undefined){
    console.log(xx)
}
console.log(yy); //this will create an Error , yy is not define, (not define != undefined)
var yy=99;//defining variable later can remove error!!! WTF
var string ="123"
string+=" 567"
console.log(string+" !");

if(4=="4"){ //regular Equality
    console.log("yesss4");
}else{
    console.log("No");
}
if(4==="4"){ //Strict equality
    console.log("yes");
}else{
    console
    .log("No0004");
}
console.log(5/4+1)



function whichReturnObjectLitteral(){
    return                          // you missed ; but javaScript add for you and it returned "undefined" /// a warning will be shown in console;
    {                               //Since the brakets are in 2nd line the run will execute and the code will stop and this will not be returned ... this thing do not happen in cpp as ; was mandator there , but ; is not mandatory in JavaSript so it creats an confusion !
        name:"Air"
    }
}
function whichReturnObjectLitteral2(){
    return{
        lol:"1"
    }
}

console.log(whichReturnObjectLitteral())
console.log(whichReturnObjectLitteral2())

var sum=0;
for(var i=0;i<=10;++i){
    sum+=i;
}
console.log(sum)

function orderChickenWith(sidedish){
    sidedish = sidedish || "Whatever!";
    console.log("Chicken with "+ sidedish);
}

orderChickenWith("noodles");
orderChickenWith(""); /// it is not getting dispalyed on the console
orderChickenWith();

function orderChickenWith2(sidedish= "Whatever!"){
    console.log("Chicken with "+ sidedish);
}

orderChickenWith2("noodles");
orderChickenWith2(""); /// it is getting dispalyed on the console
orderChickenWith2();

if ( console.log("Hello10") ) {  /// console.log() will not be exexuted ... on its reurn will be checked that is undefined
  console.log("Hello10");
}
var u=(console.log("hehahaha"))
console.log(u)

var company = new Object();
company.name="Aditya Aman pvt";
company.ceo= new Object();
company.ceo.firstName="aditya";
company.ceo.favcolor="Blue";

console.log(company);
console.log(company.ceo.firstName);
console.log(company["name"])

var stockPropName = "Stack of Company";
company[stockPropName]=288.85;

console.log("Stock price is "+ company[stockPropName]);


//Better way: Object literal
var facebook ={
    name: "facebook",
    ceo: {
        firstName: "Mark",
        favColor: "blue"
    },
    "Stock of company": 120
};
console.log(facebook);
console.log(facebook.ceo.firstName);

function makeMultiplier(multi){
    var myfunc= function(x){
        return multi*x;
    };
    return myfunc;
}
console.log(makeMultiplier(10));

function multiply(x,y){ //FUNCTIONS ARE FIRST-CLASS DATA TYPES
    return x*y; 
}
console.log(multiply(5,3));
multiply.version="v.1.0.0"; //Functions are objects
console.log(multiply)
console.log(multiply.version);

function makeMultiplier2(multiplier2) { //Closers
  var myFunFunc = function (x) {
    return multiplier2 * x;
  };
  
  return myFunFunc;
}

var operation = makeMultiplier2(10);
console.log(operation(10));

//Primitive are passes/copied by value
//Objects are passed/copied by reference

//under-hood : it is actually pass by value (i.e address in the memory) only under hood!!!, Question : Javascript doesn't allow anything to be passed by reference. Ans : False, (ref. in address is pass by ref.)

//Primitives
var adi = 7;
var man = adi;

//Objects
var lol = {d:7};
var boo = lol;

console.log(lol.d)
console.log(boo.d)

boo.d=6.9;

console.log(lol.d)
console.log(boo.d)

//Function constructors
function Circle (arg){
    this.radius =arg;
    this.getArea = function(){
        return Math.PI * Math.pow(this.radius,2);
    };
}

var myCircle = new Circle(10);
console.log(myCircle.getArea());

function Dog(name) {
  this.name = name;
}

Dog.prototype.bark = function () {
  console.log(this.name + " likes barking! Bark!");
}

var max = new Dog("Max", "Buddy");
max.bark();

//Arrays
var arr1 = new Array();
arr1[0]= "Aditya Aman Air";
arr1[1]= 2;
arr1[2]= function(name){
    console.log("Hello "+name);
};
arr1[3]= {course: " HTML, CSS & JS"};
console.log(arr1);
console.log(arr1[1]);
console.log(arr1[3]);
console.log(arr1[3].course);

var names = ["Aditya", "Aman","Air"];
console.log(names);
console.log(names[0]);

names[99]="Bro is Bad";
for (var i=0; i<102; i++){
    console.log("Hello "+ names[i]);
}

for(var i in names){
    console.log("Hello Again "+ names[i]);
}

someObj = {
    "abc":"123a",
    xyz:"123b",
    "lol":100,
    7:8
}
for(var i in someObj){
    console.log(i+" Again "+ someObj[i]);
}

someObj.greet="huuu?";
for(var i in someObj){
    console.log(i+" Again "+ someObj[i]);
}

//Normal function //////////////////////////////////////
function kklol1(){
    console.log("kklol1")
}
kklol1();

//Normal function //////////////////////////////////////
var llkol2 = function() {
    console.log("llkol2")
};
llkol2();

//immediately Invoked Function Expression 
//IIFE

(function(){
    console.log("This is IIFE")
})();

(function(window) {
  var obj = {};
  obj.dreamOn = function () {
   console.log("I want to see the global scope! Let me out!");
  };
  window.doer = obj;
 })(window);
 doer.dreamOn();

////////Assignment////////////

 (function (){
    var assig_names=["Aditya Aman", "James", "John", "Jane", "Michael", "Jennifer", "Sarah", "joshua", "Emily", "Robert", "Jessica"];
    for(var i in assig_names){
        if(assig_names[i][0]=="j" || assig_names[i][0]=='J'){
            console.log("Goodbye "+assig_names[i])
        }else{
            console.log("Hello "+ assig_names[i])
        }
    }
 })();


console.log( document.getElementById("title"));
function sayhelloFun(){
    var name123 = document.getElementById("nameBox").value;
    if (name123=="AI"|| name123=="ai" || name123=="Ai" || name123=="aI"){
        document.getElementById("title").textContent="Aditya Aman is The Best SDE";
    }else{
    var message1 = "Hello "+ name123 + " : This is direct to .textContent";
    var message2 = "<h3>Hello "+ name123 + " : This is direct to .innerHTML<\h3>";
    console.log(message1) // ofCourse on console
    document
        .getElementById("contentArea")
        .textContent = message1;
    console.log(message2)    
    document.getElementById("contentContainer").innerHTML = message2;   
    }
}

function copybabe(){
    var somebabe=document.getElementById("nameBox2").value;
    document.getElementById("contentContainer2").textContent="Ohoo Babe!!! Learning JavaScript";

}
function alertboi(){
    // this.textContent="You should not click on any Link or Button!";
    document.getElementById("cont3").textContent="You are PlayFulllll!!!";
}
function alertboi2(){
    document.getElementById("cont4").textContent="Are you PlayFullll???";
}
document.querySelector("#b3").onclick=alertboi;
document.querySelector("#b4").addEventListener("click",alertboi2);
/////////////////////////////////////
/////////////////////////////////////
/////////////////////////////////////
/////////////////////////////////////
/////////////////////////////////////
/////////////////////////////////////
/////////////////////////////////////
//The DOMContentLoaded event fires when the initial HTML document has been completely loaded and parsed, and the DOM is fully constructed, without waiting for external resources like images, stylesheets, frames, or async scripts to finish loading., like shown below:
document.addEventListener("DOMContentLoaded", function(event){
document.getElementById("contlast").textContent="Html Loaded";
console.log(event);
}
);
/////////////////////////////////////
/////////////////////////////////////
/////////////////////////////////////
/////////////////////////////////////
/////////////////////////////////////
/////////////////////////////////////
/////////////////////////////////////
document.querySelector("body").addEventListener("mousemove", function (event){
    if(event.shiftKey === true){
    console.log("x : "+ event.clientX);
    console.log("y : "+ event.clientY);}
});

/// HTTP 
// URN : Uniform Resource Name ,          eg : HTML/CSS/javascript/web Developer/Aditya Aman/Air
// URI : Uniform Resource Identifier ,    eg : /offical_web_site/index.html
// URL : Uniform Resource Locator,        eg : http://www.adityaaman.neocities.org/index.html

// HTTP Request Structure (GET)
// GET /index.html?firstName=Aditya&last=Aman HTTP/1.1 or HTTP/2 or HTTP/3

// HTTP Request Structure (POST)
// POST <request-target> HTTP/1.1

// HTTP Response Structure
// HTTP/1.1 200 ok
//          400 Not Found
//          403 Forbidden
//          500 internal error
//          etc..

// 1xx: Informational (request received, continue processing). 
// 2xx: Success (request successfully received and understood). 
// 3xx: Redirection (further action needed to complete the request). 
// 4xx: Client Error (request contains incorrect syntax or cannot be fulfilled). 
// 5xx: Server Error (server failed to fulfill a valid request). 


 ///////////////////////////////
 //////////////////////////////
 //AJAX///////////////////////
 ////////////////////////////
(function (global){
var ajaxUtils={};
 ///Returns an HTTP request object///
function getRequestObject(){
    if(window.XMLHttpRequest){
        return (new XMLHttpRequest());
    }else if(window.ActiveXObject){
        return (new ActiveXObject("Microsoft.XMLHTTP"));
    }else{
        global.alert("Ajax is not supported");
        return (null);
    }
 }
 
 //Makes an Ajax GET request to 'requestUrl'
 ajaxUtils.sendGetRequest = function(requestUrl, responseHandler){
    var request = getRequestObject();
    request.onreadystatechange= function(){
        handleResponse(request, responseHandler);
    };
    request.open("GET", requestUrl, true);
    request.send(null);
 };
//Only calls user provided 'responseHandler'
//function if response is ready
// and not an error
function handleResponse(request,responseHandler){
    if((request.readyState==4)&&(request.status == 200)){
        responseHandler(request);
    }
}
// Expose utility to the global object
global.$ajaxUtils =ajaxUtils
})(window);
document.addEventListener("DOMContentLoaded", function(event){
    document.querySelector("#b5").addEventListener("click", function(){
        var self = this;
        var name = "";

        $ajaxUtils.sendGetRequest("/name.txt", function(request){
            self.name = request.responseText;
            console.log(self.name);
            document.querySelector("#contentX").innerHTML="<h2>Hello "+self.name +"!<\h2>";

        });
    });
});





 /////////////////////////////////////////////////////
 ////////////////STRUCTURE OF A BROWSER///////////////
 /////////////////////////////////////////////////////
 /////////////////////////////////////////////////////
 ///////////////////USER INTERFACE////////////////////
 ///////////////////BROWSER ENGINE////////////////////
 //////////////////RENDERING ENGINE///////////////////
 /////////////////////////////////////////////////////
 //NETWORKING////JAVASRIPT INTERPRETER////UI BACKEND//
 /////////////////////////////////////////////////////
 //////////////////DATA PERSISTENCE///////////////////
 /////////////////////////////////////////////////////

 //JSON
 // JavaSript object Notation similer to xml
//JSON is the lightweight sta representation
//Great format dor passing data from server to clint & back
//JSON is based on java script literal
////// BUT JSON is NOT js object literal

