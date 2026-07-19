import React from "react";

function Blogs(props) {
  const content = props.showBlogs ? (
    <div>
      {props.blogs.map((blog) => (
        <div key={blog.id}>
          <h2>{blog.title}</h2>
          <h4>{blog.author}</h4>
          <p>{blog.description}</p>
        </div>
      ))}
    </div>
  ) : (
    <h3>No Blogs Available</h3>
  );

  return (
    <div className="v1">
      <h1>Blog Details</h1>
      {content}
    </div>
  );
}

export default Blogs;