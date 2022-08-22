import React from "react";
import "./App.css";


import {
  BrowserRouter as Router,
  Routes,
  Route,
  Link
} from "react-router-dom";

export default function App() {
  return (
    <Router>
      <div>

        <div className="main-nav">
          <Link id="home" to="/home">Home</Link>
          <Link id="about" to="/about">About</Link>
          <Link id="users" to="/users">Users</Link>
        </div>

        <Routes>
          <Route path="/home" element={ <Home />}/>
          <Route path="/about" element={<About />}/>
          <Route path="/users" element={ <Users />}/>
        </Routes>
        
      </div>
    </Router>
  );
}

function Home() {
  return <p className="para" id="home-para"><h2>Welcome to Home</h2>A home page (or homepage) is the main web page of a website.[1] The term may also refer to the start page shown in a web browser when the application first opens.[2] Usually, the home page is located at the root of the website's domain or subdomain. For example, if the domain is example.com, the home page is likely located at www.example.com/.</p>;
}

function About() {
  return <p className="para" ><h2>Want to know about us?</h2>The About Us page of your website is an essential source of information for all who want to know more about your business.About Us pages are where you showcase your history, what is unique about your work, your company’s values, and who you serve.The design, written content, and visual or video elements together tell an important story about who you are and why you do it.</p>;
}

function Users() {
  return <p className="para" ><h2>Get the user details here!</h2>For Users Page The first thing you'll have to do is get the logged in status of the current user, to do that we'll use a core Joomla function (no hacking around here).In your template's index.php file (we'll use the default template here as an example and you'll find the index.php file at /templates/protostar/index.php) add the following code on the line right after $user = JFactory::getUser(); (around ln 15):</p>;
}