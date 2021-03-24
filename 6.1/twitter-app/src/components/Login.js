import React from 'react';
import '../css/Login.css';
class Login extends React.Component {
  // We pass the props so that the user is able to type input inside of the Username and Password
  constructor(props) {
    super(props);
    this.state = { username: '', password: '' };
  }
// function that receives user input
  handleChange = ({ target }) => {
    this.setState({ [target.name]: target.value });
  };
  render() {
    return (
      // React Fragment is easier for the DOM to render because it renders both forms (username/password) rather than two seperate nodes
      <React.Fragment>
        <form>
          {/* Label works as a container and shows the username text next to the input */}
          <label class="username" htmlFor="username">Username: </label>
          <input
            type="text"
            name="username"
            value={this.state.username}
            onChange={this.handleChange}
          />
          <div>
          <label class="password" htmlFor="password">Password: </label>
          <input
            type="password"
            name="password"
            value={this.state.password}
            onChange={this.handleChange}
          />
          </div>
        </form>
        {/* When the submit button is clicked it renders the feed.js */}
        <form action="/feed">
          <button class="button"
            type="submit" >
            Login
          </button>
        </form>
      </React.Fragment>
    );
  }
}
export default Login;