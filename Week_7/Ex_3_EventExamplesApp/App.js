import React, { Component } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      counter: 5
    };
  }

  increment = () => {
    this.setState({ counter: this.state.counter + 1 });
    this.sayHello();
  }

  decrement = () => {
    this.setState({ counter: this.state.counter - 1 });
  }

  sayHello = () => {
    alert("Hello! Member1");
  }

  sayWelcome = (msg) => {
    alert(msg);
  }

  handleClick = (e) => {
    alert("I was clicked");
  }

  render() {
    return (
      <div style={{ margin: "20px" }}>
        <p>{this.state.counter}</p>
        <button onClick={this.increment}>Increment</button>
        <br /><br />
        <button onClick={this.decrement}>Decrement</button>
        <br /><br />
        <button onClick={() => this.sayWelcome("Welcome Member!")}>Say welcome</button>
        <br /><br />
        <button onClick={this.handleClick}>Click on me</button>
        <br /><br />

        <CurrencyConvertor />
      </div>
    );
  }
}

export default App;
