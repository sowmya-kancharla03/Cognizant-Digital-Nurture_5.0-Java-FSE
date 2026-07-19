import React from "react";
import FlightDetails from "./FlightDetails";
import LoginButton from "./LoginButton";

function GuestPage(props) {
  return (
    <div style={{ textAlign: "center", marginTop: "40px" }}>

      <h1>Flight Booking Portal</h1>

      <FlightDetails />

      <br />

      <p><b>Please login to book your tickets.</b></p>

      <LoginButton onClick={props.onLoginClick} />

    </div>
  );
}

export default GuestPage;
