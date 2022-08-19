import Todo from "./MyComponent/Todo";
import "./MyComponent/Todos.css";
import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";

function Home() {
  return <h2>Home</h2>;
}

function About() {
  return <h2>About</h2>;
}

function Users() {
  return <h2>Users</h2>;
}

function App() {
  return (
    <div>
      <div className="App">
        {/* <Router>
          <div>
            <nav>
              <ul>
                <li>
                  <Link to="/">Home</Link>
                </li>
                <li>
                  <Link to="/about">About</Link>
                </li>
                <li>
                  <Link to="/users">Users</Link>
                </li>
              </ul>
            </nav>

            <Routes>
              <Route path="/about" element={<About />} />
              <Route path="/users" element={<Users />} />
              <Route path="/" element={<Home />} />
            </Routes>
          </div>
        </Router> */}
      </div>

      <div>
          <h2>Todo App</h2>
          <Todo />
      </div>
      
    </div>
  );
}

export default App;
