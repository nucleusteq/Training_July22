import React from "react";
import './navbar.css';
import {
  BrowserRouter as Router,
  //Switch,
  Routes,
  Route,
  Link
} from "react-router-dom";

export default function App() {
  return (
    <Router>
      <div>
        <div className="container">
          <div className="box" id="box1">React Router Dom
              <div id="menuButton" onClick={window['menuToggle']}><i className="fa fa-bars"></i></div> 
              <div id="crossButton" onClick={window['menuToggle']}><i className="fa fa-times"></i></div>
          </div>
          <div className="box" id="box2">
            <ul>
                <li><Link to="/" className="navButtons"><span>Home</span></Link></li>
                <li><Link to="/about" className="navButtons"><span>About Us</span></Link></li>
                <li> <Link to="/users" className="navButtons"><span>Users</span></Link></li>
            </ul>
          </div>
          <div style={{clear:"both"}}></div>
        </div>

        {/* A <Switch> looks through its children <Route>s and
            renders the first one that matches the current URL. */}
        <Routes>
          <Route path="/about" element={<About />}/>
          <Route path="/users" element={ <Users />}/>
          <Route path="/" element={ <Home />}/>
           
        </Routes>
      </div>
    </Router>
  );
}

function Home() {
  return (
    <div id="dataContainer">
        <div>HomePage</div>
        <div id="data">
            <p>A home page is the default or front page of a site. It is the first page that visitors see when they load a URL. Web managers can control the home page as a way of directing the user experience.</p>
            <p>Home pages are located in the root directory of the website. Many home pages act as a virtual directory for a site — they provide top-level menus where visitors can go deeper into various areas of the site. For instance, a typical website has a homepage with menu items like “about,” “contact,” “products,” “services,” “press” or “news.”</p>
            <p>In addition, the home page often serves to orient visitors by providing titles, headlines and images and visuals that show what the website is about, and in some cases, who owns it and maintains it. One of the best examples is the average business website, which has the business name in a prominent place, and often features the logo, while also showing pictures related to that business, for instance, who works there, what the business produces, or what it does in a community.</p>
            <p>A home page is part of the natural way that the Internet has emerged to oriented Web users and help them navigate all of the many sites on the global network.</p>
        </div>
    </div>
  );
}

function About() {
  return (
    <div id="dataContainer">
        <div>About Us</div>
        <div id="data">
            <p>The about us page is commonly used by all types of businesses to give customers more insight into who is involved with a given business and exactly what it does. The history of a business is often provided, and the histories of the people in charge are usually expressed through short articles, usually accompanied by photographs.</p>
            <p>Depending on the specific company, some information about goals, attitude or other aspects of culture that aren't strictly tied to business practices are included as well. The about us page is often a reflection of the purpose and personality of the business and its owners or top employees. Finally, the page can also incorporate contact or locational information. One way to view the about us concept is as a text self-portrait or short autobiography created by a business.</p>
            <p>The primary purpose of an about us page is to inform the reader about the company and its operations. This is a straightforward goal that nearly all businesses have to fulfill in some fashion or another. However, there are other reasons why about us pages are common fixtures on business websites. The text on these pages is a marketing tool for a business, enticing potential customers with both the history and the aspirations of a business, as well as adding a human element. Additionally, about us pages are incorporated into search-engine marketing efforts as a way to find potential customers through Web searches.</p>
        </div>
    </div>
  );
}

function Users() {
  return (
    <div id="dataContainer">
        <div>Users</div>
        <div id="data">
            <p>A user is a person who utilizes a computer or network service.A user often has a user account and is identified to the system by a username (or user name). Other terms for username include login name, screenname (or screen name), account name, nickname (or nick) and handle, which is derived from the identical citizens band radio term. Some software products provide services to other systems and have no direct end users.</p>
            
        </div>
    </div>
  );
}
