import React from "react";
import FlightDetails from "./FlightDetails";
import LoginButton from "./LoginButton";

function GuestPage(props) {
  return (
    <div style={{ marginLeft: "120px", marginTop: "40px" }}>
      <h1>Please sign up.</h1>
      <FlightDetails />
      <br />
      <p><b>Login to book your tickets.</b></p>
      <LoginButton onClick={props.onLoginClick} />
    </div>
  );
}

export default GuestPage;