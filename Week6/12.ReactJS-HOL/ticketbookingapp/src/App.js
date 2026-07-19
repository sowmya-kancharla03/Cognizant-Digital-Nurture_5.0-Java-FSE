import React, { Component } from "react";
import GuestPage from "./components/GuestPage";
import UserPage from "./components/UserPage";

class App extends Component {

  constructor(props) {
    super(props);

    this.state = {
      isLoggedIn: false
    };
  }

  handleLoginClick = () => {
    this.setState({
      isLoggedIn: true
    });
  };

  handleLogoutClick = () => {
    this.setState({
      isLoggedIn: false
    });
  };

  render() {

    if (this.state.isLoggedIn) {
      return (
        <UserPage
          onLogoutClick={this.handleLogoutClick}
        />
      );
    }

    return (
      <GuestPage
        onLoginClick={this.handleLoginClick}
      />
    );
  }
}

export default App;