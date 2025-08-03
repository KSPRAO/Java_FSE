import React from 'react';

const BookDetails = ({ books }) => {
  return (
    <div>
      <h1 className="text-2xl font-bold mb-4">Book Details</h1>
      <ul>
        {books.map((book) => (
          <div key={book.id} className="mb-2">
            <h3 className="text-xl">{book.bname}</h3>
            <h4 className="text-lg">${book.price}</h4>
          </div>
        ))}
      </ul>
    </div>
  );
};

export default BookDetails;