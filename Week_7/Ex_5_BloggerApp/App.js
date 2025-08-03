import React, { useState } from 'react';
import './styles.css';

const App = () => {
  const [showBlog, setShowBlog] = useState(true);

  

  return (
    <div className="container">
      <div className="columns">
        <div className="column st1">
          <h1>Course Details</h1>
          <div>
            <h3>Angular</h3>
            <p>4/5/2021</p>
          </div>
          <div>
            <h3>React</h3>
            <p>6/3/2021</p>
          </div>
        </div>
        <div className="column st2">
          <h1>Book Details</h1>
          <div>
            <h3>Master React</h3>
            <p>670</p>
          </div>
          <div>
            <h3>Deep Dive into Angular 11</h3>
            <p>800</p>
          </div>
          <div>
            <h3>Mongo Essentials</h3>
            <p>450</p>
          </div>
        </div>
        <div className="column v1">
          <h1>Blog Details</h1>
          {showBlog && (
            <>
              <div>
                <h3>React Learning</h3>
                <p>Stephen Biz</p>
                <p>Welcome to learning React!</p>
              </div>
              <div>
                <h3>Installation</h3>
                <p>Schwenzdier</p>
                <p>You can install React from npm.</p>
              </div>
            </>
          )}
        </div>
      </div>
    </div>
  );
};

export default App;