import React from "react";
import {
  BrowserRouter as Router,
  Routes,
  Route,
  Link
} from "react-router-dom";
import './App.css';

export default function App() {
  return (
    <Router>
      <div className="main-div">
        <nav className="navbar">
          
              <Link id="home" to="/"><span>Home</span></Link>
            
              <Link id="about" to="/about"><span>About</span></Link>
            
              <Link id="users" to="/users"><span>Users</span></Link>
            
        </nav>
      </div>
      <div className="route-div">
        {/* A <Switch> looks through its children <Route>s and
            renders the first one that matches the current URL. */}
        <Routes>
          <Route path="/about" element={<About />}/>
          <Route path="/users" element={<Users />}/>
          <Route path="/" element={<Home />}/>
        </Routes>
      </div>
    </Router>
  );
}

function Home() {
  return <div className="homer">
    <h2>Home</h2>
    <p>This is your home screen. Have a pleasant day!</p>
    </div>;
}

function About() {
  return <div className="abouts">
    <h2>About</h2>
    <p>This is the about section of this page. Here you will find our information along with how you can contact us.</p>
  </div>;
}

function Users() {
  return <div className="userinfo">
    <h2>Users</h2>
    <p>This section of the page contains the user's information.</p>
  </div>;
}