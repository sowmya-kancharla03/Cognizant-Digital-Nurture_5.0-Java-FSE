import React from "react";
import LogoutButton from "./LogoutButton";

function UserPage(props) {
  return (
    <div style={{ textAlign: "center", marginTop: "40px" }}>

      <h1>Book Your Ticket</h1>

      <form>

        <div>
          <label>Passenger Name</label><br />
          <input type="text" />
        </div>

        <br />

        <div>
          <label>Flight Number</label><br />
          <input type="text" />
        </div>

        <br />

        <div>
          <label>Number of Tickets</label><br />
          <input type="number" />
        </div>

        <br />

        <button type="submit">
          Book Ticket
        </button>

      </form>

      <br />

      <LogoutButton onClick={props.onLogoutClick} />

    </div>
  );
}

export default UserPage;
