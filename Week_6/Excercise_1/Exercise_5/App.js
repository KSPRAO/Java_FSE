import React from 'react';
import './App.css';
import CohortDetails from './CohortDetails';

function App() {
  return (
    <div className="App">
      <h1>Cohort Tracker</h1>
      <CohortDetails status="ongoing" />
      <CohortDetails status="completed" />
    </div>
  );
}

export default App;
