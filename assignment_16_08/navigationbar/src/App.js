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
  return <p className="para" id="home-para"><h2>Welcome to Home</h2><b>A home page is generally the primary web page which a visitor navigating to a website from a search engine will see, and it may also serve as a landing page to attract visitors.[3][4] In some cases, the home page is a site directory, particularly when a website has multiple home pages.

  Good home page design is usually a high priority for a website;[5] for example, a news website may curate headlines and first paragraphs of top stories, with links to full articles.[6][7] According to Homepage Usability, the homepage is the "most important page on any website" and receives the most views of any page.[8] A poorly designed home page can overwhelm and deter visitors from the site.[7] One important use of home pages is communicating the identity and value of a company.[9]</b> </p>;
  }

function About() {
  return <p className="para" ><h2> About Us</h2><b>Wikipedia's purpose is to benefit readers by acting as a widely accessible and free encyclopedia that contains information on all branches of knowledge. It is supported by the Wikimedia Foundation and consists of freely editable content. The name "Wikipedia" is a blending of the words wiki (a technology for creating collaborative websites, from the Hawaiian word wiki, meaning "quick") and encyclopedia. Wikipedia's articles provide links to guide readers to related pages with more information.

  Wikipedia is written collaboratively by largely anonymous volunteers. Anyone with Internet access and in good standing can write and make changes to Wikipedia articles, except in limited cases where editing is restricted to prevent disruption or vandalism.</b></p>;}
function Users() {
  return <p className="para" ><h2> User details </h2><b>User pages are pages for organizing the work users do on Wikipedia, as well as speaking to other users. User pages are mainly for interpersonal discussion, notices, testing and drafts and, if desired, limited autobiographical and personal content. Pages in the User and User talk namespaces are considered to be user pages.

  User pages are available to Wikipedia users personally for purposes compatible with the Wikipedia project and acceptable to the community; Wikipedia is not a blog, webspace provider, or social networking site. Wikipedia policies concerning the content of pages can and generally do apply to user pages, and users must observe these policies. Users believed to be in violation of these policies should first be advised on their talk page using  when immediate action is not otherwise necessary.</b></p>;}