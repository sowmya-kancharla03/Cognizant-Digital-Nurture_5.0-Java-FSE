import './App.css';
import image1 from './image1.png';
import image2 from './image2.png';
import image3 from './image3.png';
import image4 from './image4.png';

function App() {

  const heading = "Office Space";

  const officeList = [
    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai",
      Image: image1
    },
    {
      Name: "Regus",
      Rent: 75000,
      Address: "Bangalore",
      Image: image2
    },
    {
      Name: "WeWork",
      Rent: 65000,
      Address: "Hyderabad",
      Image: image3
    },
    {
      Name: "SmartWorks",
      Rent: 45000,
      Address: "Pune",
      Image: image4
    }
  ];

  return (
    <div className="container">

      <h1>{heading}, at Affordable Range</h1>

      {
        officeList.map((item, index) => (

          <div key={index}>

            <img
              src={item.Image}
              width="20%"
              height="20%"
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

        ))
      }

    </div>
  );
}

export default App;