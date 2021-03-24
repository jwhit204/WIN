// // you will always need to import React from react
// // import {Component} when building a class component
import React, { Component } from 'react';
// // importing our CSS file from src>css
import '../css/Feed.css';
import Tweets from './Tweets';
// These are global variables we defined for later use
const GENERIC_Tweets_USERNAME = "", GENERIC_Tweets_BODY = "", GENERIC_Tweets_TIMESTAMP = "";
class Feed extends Component {
  // // constructor method available to us in class components
  constructor() {
    super();
    this.state = {
      tweets: [],
      username: GENERIC_Tweets_USERNAME,
      body: GENERIC_Tweets_BODY,
      timestamp: GENERIC_Tweets_TIMESTAMP,
    }
  }
  // this is the add tweets function and it also doesn't allow blank tweets to be added
  addTweets = () => {
    if (this.state.body !== "") {
      this.setState({
        tweets: this.state.tweets.concat({
          id: Date.now(),
          body: this.state.body,
        }),
        body: "",
      });
      this.inputEntry.value = "";
    }
  };
  handleTweet = (event) => {
    this.setState({ body: event.target.value });
  }
  // This is what deletes tweets from the array
  deleteTweets(id) {
    let newTweetsArr = this.state.tweets;
    newTweetsArr.map((tweets, index) => {
      if (id === tweets.id) {
        newTweetsArr.splice(index, 1);
      }
    });
    this.setState(
      {
        tweets: newTweetsArr
      }
    );
  }
  // // render method - render what is returned (JSX) onto the browser
  render() {
    return (
      <div>
        <div className="div-board">
          <div className="row">
            {/* This logout button sends you back to the login.js */}
            <form action="/">
              <button className="logout"
                type="submit" >
                Logout
              </button>
            </form>
            <div>
              {/* This runs the handleTweet() when user gives input. Also contains the placeholder text */}
              <input onChange={this.handleTweet}
                placeholder="What's Happening?"
                ref={el => this.inputEntry = el}></input>
            </div>
            <div>
              {/* This adds the add button and runs the addTweets() */}
              {this.state.description}
              <button className="btn btn-success add-button" onClick={this.addTweets.bind(this)}>
                Tweet
              </button>
            </div>
            {
              // This makes the newest tweet appear at the top by reversing the array
              this.state.tweets.reverse().map(tweets => {
                return <Tweets key={tweets.id} id={tweets.id} deleteHandler={this.deleteTweets.bind(this)} body={tweets.body} />
              })
            }
          </div>
        </div>
      </div>
    );
  }
}
export default Feed;