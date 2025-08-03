import React from 'react';

const IndianPlayers = () => {
  const allPlayers = ["Sai", "Rohith", "Gilll", "Pantt", "Hardik", "Jadeja"];

 
  const [odd1, even1, odd2, even2, odd3, even3] = allPlayers;

  const T20Players = ["Surya", "Ishan", "Hardik"];
  const RanjiPlayers = ["Prithvi", "Jaiswal", "Sarfaraz"];

 
  const merged = [...T20Players, ...RanjiPlayers];

  return (
    <div>
      <h2>Odd Team Players</h2>
      <ul>
        <li>{odd1}</li>
        <li>{odd2}</li>
        <li>{odd3}</li>
      </ul>

      <h2>Even Team Players</h2>
      <ul>
        <li>{even1}</li>
        <li>{even2}</li>
        <li>{even3}</li>
      </ul>

      <h2>Merged T20 + Ranji Trophy Players</h2>
      <ul>
        {merged.map((player, idx) => <li key={idx}>{player}</li>)}
      </ul>
    </div>
  );
};

export default IndianPlayers;
