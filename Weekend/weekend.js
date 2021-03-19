// Player name
var player1= "Player 1";

//Function to change the player name
function editNames() {
    player1 = prompt("Change Player1 name"); 

    document.querySelector("p.Player1").innerHTML = player1; 
}

// Function to roll the dice
function rollTheDice() {
    setTimeout(function () {
        var randomNumber1 = Math.floor(Math.random() * 6) + 1;

        document.querySelector(".img1").setAttribute("src", "dice" + randomNumber1 + ".png");

        
    })
}

// var dogName= "dog"; //global variable 
// function renameDog() {  //inside () can be parameter or agrument ALWAYS have to have a {}
//     dogName= "Bella"; //local variable 
//     return dogName;
// }
// console.log(dogName);
// console.log(renameDog());  