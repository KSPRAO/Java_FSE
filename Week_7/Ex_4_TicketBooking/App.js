import React, { useState } from 'react';


function LoginButton(props) {
  return (
    <button onClick={props.onClick}>
      Login
    </button>
  );
}

function LogoutButton(props) {
  return (
    <button onClick={props.onClick}>
      Logout
    </button>
  );
}


function Greeting(props) {
  const isLoggedIn = props.isLoggedIn;
  if (isLoggedIn) {
    return <UserGreeting />;
  }
  return <GuestGreeting />;
}


function UserGreeting() {
  return (
    <div>
      <h1>Welcome back</h1>
      <button onClick={() => alert('Ticket booked successfullyy!')}>Book Ticket</button>
    </div>
  );
}

function GuestGreeting() {
  return <h1>Please sign up.</h1>;
}

// Main app
function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  function handleLoginClick() {
    setIsLoggedIn(true);
  }

  function handleLogoutClick() {
    setIsLoggedIn(false);
  }


  return (
    <div style={{ textAlign: 'center', marginTop: '11%' }}>
      <Greeting isLoggedIn={isLoggedIn} />
      {isLoggedIn ? (
        <LogoutButton onClick={handleLogoutClick} />
      ) : (
        <LoginButton onClick={handleLoginClick} />
      )}
    </div>
  );
}

export default App;
