import React from "react";
import {Routes} from 'react-router'
import {
  BrowserRouter as Router,
  //Switch,
  Route,
  Link
} from "react-router-dom";
import './App.css'
export default function App() {
  return (
    <Router>
      <div>
        <nav>
          <ul>
            <li className="items">
              <Link to="/">Home</Link>
            </li>
            <li className="items">
              <Link to="/about">About</Link>
            </li>
            <li className="items">
              <Link to="/users">Users</Link>
            </li>
          </ul>
        </nav>

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
  return <h2>This is home</h2>;
}

function About() {
  return <h2>This is about</h2>;
}

function Users() {
  return <h2>This is users</h2>;
}