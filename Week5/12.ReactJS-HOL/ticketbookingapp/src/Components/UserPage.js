import React from "react";
import LogoutButton from "./LogoutButton";
function UserPage(props) {
  return (
    <div>
      <h1>Ticket Booking</h1>
      <form>
        <label>
          Passenger Name:
        </label>
        <br />
        <input type="text" />
        <br /><br />
        <label>
          Number of Tickets:
        </label>
        <br />
        <input type="number" />
        <br /><br />
        <button>Book Ticket</button>
      </form>
      <br />
      <LogoutButton onClick={props.onLogoutClick} />
    </div>
  );
}

export default UserPage;