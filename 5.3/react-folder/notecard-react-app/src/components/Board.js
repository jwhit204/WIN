// // You will always need to import React from react
// // Import {Component} when building a class component
import React, { Component } from 'react';
// // Importing our css files from src>css
import '../css/Board.css';
import Note from './Note';


class Board extends Component {
    // // construtor method available to us in class components
    constructor() {
        super();
    }

    // // render method - render what is returned (JSX) to the browser
    render() {
        return (
            <div>
                <div className="div-board">
                    <div className="row">
                    <Note title="Class Notes" body="Always use constructors when extending another class"/>
                    <Note title="My New Address" body="2001 N Lonhill Phoenix, AZ 81234"/>
                    <Note title="React Notes" body="Everything in React is a component"/>
                    <Note />

                    </div>
                </div>
                <div>
                    <button className="btn btn-success add-button">Add</button>
                </div>
            </div>
        );
    }
}

export default Board;
