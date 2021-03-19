// console.log(document.domain);
// console.log(document.URL);
// console.log(document.title);
// document.title = 123;
// console.log(document.doctype);
// console.log(document.head);
// console.log(document.body);
// console.log(document.all);
// console.log(document.all[10]);
// // document.all[10].textContent = "Hello";
// console.log(document.forms);
// console.log(document.links);
// console.log(document.images);
// console.log(document.getElementById('header-title'));
var headerTitle = document.getElementById("header-title");
console.log(headerTitle);
var header = document.getElementById("main-header");
headerTitle.textContent = "To Do List";
header.style.borderBottom = "solid 3px #000";
var items = document.getElementsByClassName("list-group-item");
console.log(items);
console.log(items[1]);

// items[0].style.fontWeight = 'bold';
for (var i = 0; i < items.length; i++) {
  items[i].style.backgroundColor = "#f4f4f4";
}
for (var i = 0; i < items.length; i++) {
  items[i].style.fontWeight = "bold";
}

let checkbox = document.querySelectorAll(".checkbox");

let listGroupItem = document.querySelectorAll(".list-group-item");

listGroupItem[0].addEventListener("click", function (event) {
  setTimeout(function () {
    listGroupItem[0].remove();
  }, 1000);
});

listGroupItem[1].addEventListener("click", function (event) {
  setTimeout(function () {
    listGroupItem[1].remove();
  }, 1000);
});

listGroupItem[2].addEventListener("click", function (event) {
  setTimeout(function () {
    listGroupItem[2].remove();
  }, 1000);
});

listGroupItem[3].addEventListener("click", function (event) {
  setTimeout(function () {
    listGroupItem[3].remove();
  }, 1000);
});

let addButton = document.querySelector(".btn.btn-dark");
let inputField = document.querySelector(".form-control.mr-2");

addButton.addEventListener('click', function (event) {
    event.preventDefault()
    let inputText = inputField.value;
    let listItem = document.createElement('li');
    listItem.className = "list-group-item"
    document.querySelector('ul').append(listItem);
    listItem.style.backgroundColor = "#f4f4f4"; 
    listItem.style.fontWeight = "bold";
    listItem.innerHTML = inputText;
    
    console.log(inputText)

    inputField.value = "";
    });


