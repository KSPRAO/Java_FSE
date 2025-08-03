import React, { Component } from 'react';

class CurrencyConvertor extends Component {
  constructor(props) {
    super(props);
    this.state = {
      amount: '',
      currency: ''
    };
  }

  handleChange = (e) => {
    this.setState({ amount: e.target.value });
  }

  handleSubmit = (e) => {
    e.preventDefault();
    const rupees = parseFloat(this.state.amount);
    const euros = rupees * 0.011; 
    this.setState({ currency: euros.toFixed(2) });
  }

  render() {
    return (
      <div>
        <h2 style={{ color: "green" }}>Currency Convertor!!!</h2>
        <form onSubmit={this.handleSubmit}>
          <label>Amount: </label>
          <input type="text" value={this.state.amount} onChange={this.handleChange} /><br /><br />
          <label>Currency: </label>
          <textarea value={this.state.currency} readOnly /><br /><br />
          <button type="submit">Submit</button>
        </form>
      </div>
    );
  }
}

export default CurrencyConvertor;
