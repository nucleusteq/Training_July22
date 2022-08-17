import React from "react";
import './App.css';
import {
  BrowserRouter as Router,
  Routes,
  Route,
  Link
} from "react-router-dom";

export default function App() {
  return (
    <Router>
      <div className="Navbar">
        <nav className="navv">
          
              <Link id="home" to="/home"><span>Home</span></Link>
           
              <Link id="about" to="/about"><span>About</span></Link>
           
              <Link id="user" to="/users"><span>Users</span></Link>
           
        </nav>
      </div>
      <div className="route-div">
        <Routes>
          <Route path="/about" element={<About />}/>
    
          <Route path="/users" element={<Users />}/>
            
          <Route path="/home" element={<Home />}/>
          
        </Routes>
      </div>
    </Router>
  );
}

function Home() {
  return <div className="homeoutput"><h2>This is our home page.</h2></div>;
   
}

function About() {
  return <div className="aboutoutput"><h2>This is our about page</h2></div> ;
}

function Users() {
  return <div className="useroutput"><h2>This is our users page</h2></div>;
}