import "./App.css";

import Books from "./Components/Books";
import Blogs from "./Components/Blogs";
import Courses from "./Components/Courses";

import { books, blogs, courses } from "./Data";

function App() {
  return (
    <div className="container">
      <Courses
        courses={courses}
        showCourses={true}
      />

      <Books
        books={books}
        showBooks={true}
      />

      <Blogs
        blogs={blogs}
        showBlogs={true}
      />
    </div>
  );
}

export default App;