import './App.css';

import office1 from './office1.png';
import office2 from './office2.png';
import office3 from './office3.png';
import office4 from './office4.png';

function App() {

  const heading = "Office Space";

  const officeList = [
    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai",
      Image: office1
    },
    {
      Name: "Regus",
      Rent: 75000,
      Address: "Bangalore",
      Image: office2
    },
    {
      Name: "WeWork",
      Rent: 65000,
      Address: "Hyderabad",
      Image: office3
    },
    {
      Name: "SmartWorks",
      Rent: 45000,
      Address: "Pune",
      Image: office4
    }
  ];

  return (
    <div className="container">

      <h1>{heading}, at Affordable Range</h1>

      {officeList.map((item, index) => (

        <div key={index}>

          <img
            src={item.Image}
            width="25%"
            height="25%"
            alt="Office Space"
          />

          <h1>Name: {item.Name}</h1>

          <h3
            style={{
              color: item.Rent < 60000 ? "red" : "green"
            }}
          >
            Rent: Rs. {item.Rent}
          </h3>

          <h3>Address: {item.Address}</h3>

          <hr />

        </div>

      ))}

    </div>
  );
}

export default App;