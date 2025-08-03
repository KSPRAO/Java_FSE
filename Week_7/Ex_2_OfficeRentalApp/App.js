import React from 'react';

function App() {
  const heading = "Office Space";
  const imageUrl = "https://images.unsplash.com/photo-1580587771525-78b9dba3b914?fit=crop&w=600&q=80";

  
  const ItemName = {
    Name: "DBS",
    Rent: 50000,
    Address: "Chennai"
  };


  const rentColor = {
    color: ItemName.Rent <= 60000 ? "red" : "green",
    fontWeight: "bold"
  };

  return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>
      <h1>{heading} , at Affordable Range</h1>

      <img src={imageUrl} width="25%" height="25%" alt="Office Space" style={{ margin: "20px 0" }} />

      <h2>Name: {ItemName.Name}</h2>
      
      <h3 style={rentColor}>Rent: Rs. {ItemName.Rent}</h3>

      <h3>Address: {ItemName.Address}</h3>
    </div>
  );
}

export default App;
