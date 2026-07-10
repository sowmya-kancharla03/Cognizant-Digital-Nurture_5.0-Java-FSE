import React from "react";

function Courses(props) {

  // Conditional Rendering using && Operator

  const coursedet =
    props.showCourses &&
    props.courses.map((course) => (
      <div key={course.id}>
        <h2>{course.cname}</h2>
        <h4>{course.date}</h4>
      </div>
    ));

  return (
    <div className="mystyle1">
      <h1>Course Details</h1>

      {props.showCourses ? (
        coursedet
      ) : (
        <h3>No Courses Available</h3>
      )}
    </div>
  );
}

export default Courses;