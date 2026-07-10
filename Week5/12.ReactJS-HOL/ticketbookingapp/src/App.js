import React, { Component } from "react";
import GuestPage from "./Components/GuestPage";
import UserPage from "./Components/UserPage";

class App extends Component {

  constructor(props) {
    super(props);

    this.state = {
      isLoggedIn: false
    };
  }

  login = () => {
    this.setState({ isLoggedIn: true });
  };

  logout = () => {
    this.setState({ isLoggedIn: false });
  };

  render() {

    if (this.state.isLoggedIn) {
      return (
        <UserPage
          onLogoutClick={this.logout}
        />
      );
    }

    return (
      <GuestPage
        onLoginClick={this.login}
      />
    );
  }
}

export default App;