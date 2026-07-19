import React from "react";

function Books(props) {
  let bookdet;

  if (props.showBooks) {
    bookdet = (
      <ul>
        {props.books.map((book) => (
          <div key={book.id}>
            <h3>{book.bname}</h3>
            <h4>{book.price}</h4>
          </div>
        ))}
      </ul>
    );
  } else {
    bookdet = <h3>No Books Available</h3>;
  }

  return (
    <div className="st2">
      <h1>Book Details</h1>
      {bookdet}
    </div>
  );
}

export default Books;