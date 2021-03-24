import React, { Component } from 'react';
import '../css/Tweet.css';
class Tweets extends Component {
  constructor(props) {
    super(props);
    this.usernameContent = React.createRef();
    this.bodyContent = React.createRef();
    this.timestampContent = React.createRef();
    // count is added to the state for the incrementMe (like button)
    this.state = {
      count: 0,
      didLike: false
    }
  }
  // function used to delete tweets
  handleDelete() {
    this.props.deleteHandler(this.props.id);
  }
  // function for the like button incrementor (increases likes); also makes it so you can only like your post once 
  incrementMe = () => {
    if(this.state.didLike === false){
    let newCount = this.state.count + 1;
    this.setState({
      count: newCount,
      didLike: true
    });
  } else {
    let newCount = this.state.count - 1;
    this.setState({
      count: newCount,
      didLike: false
    });
  }
  };
  //   // render method return JSX (what shows up)
  render() {
    // defines variables
    let usernameElement, bodyElement, likeButton, likeDisplay, buttonArea;
    // variables for like button
    likeButton = (
      <div>
        <button onClick={this.incrementMe} className="like-btn"></button>
      </div>
    );
    likeDisplay = (
      <div>
        <span>Likes: {this.state.count}</span>
      </div>
    );
    buttonArea = <div>
      <button className="btn btn-danger" onClick={this.handleDelete.bind(this)}>Delete</button>
    </div>
    // Future plans to link username from login to above tweet
    // usernameElement = <h5 className="card-username">{this.props.username}</h5>;
    // This is the prop that mutates the body to reflect the user input
    bodyElement = <p>{this.props.body}</p>;
      // This adds the button "Delete" and calls the handleDelete()
    return (
      <div className='col-sm-6'>
        <div className="card card-view">
          <div className="card-synopsis">
            {/* These are our elements */}
            {usernameElement}
            {bodyElement}
            {likeButton}
            {likeDisplay}
            {buttonArea}
          </div>
        </div>
      </div>
    );
  }
}
export default Tweets;