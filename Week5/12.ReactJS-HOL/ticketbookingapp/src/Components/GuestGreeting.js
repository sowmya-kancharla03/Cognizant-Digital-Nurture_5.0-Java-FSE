import React from "react";
import FlightDetails from "./FlightDetails";

function GuestGreeting() {
  return (
    <div>
      <h2>Welcome Guest</h2>
      <FlightDetails />
      <h3>Please Login to Book Tickets.</h3>
    </div>
  );
}

export default GuestGreeting;