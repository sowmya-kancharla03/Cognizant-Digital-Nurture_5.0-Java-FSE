import React from "react";

function FlightDetails() {
  return (
    <table border="1" cellPadding="8" style={{ marginTop: "20px" }}>
      <thead>
        <tr>
          <th>Flight No</th>
          <th>From</th>
          <th>To</th>
          <th>Fare</th>
        </tr>
      </thead>

      <tbody>
        <tr>
          <td>AI101</td>
          <td>Hyderabad</td>
          <td>Delhi</td>
          <td>₹4500</td>
        </tr>

        <tr>
          <td>6E202</td>
          <td>Chennai</td>
          <td>Mumbai</td>
          <td>₹5200</td>
        </tr>

        <tr>
          <td>UK303</td>
          <td>Bangalore</td>
          <td>Kolkata</td>
          <td>₹6100</td>
        </tr>
      </tbody>
    </table>
  );
}

export default FlightDetails;