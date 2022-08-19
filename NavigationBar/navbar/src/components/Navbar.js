import React , {useState} from 'react';
import "../App.css";

function Navbar(){

    const[showLinks,setShowLinks]=useState(false);
     

return(
    <div className="Navbar">
              <div className="leftside">
                    <div className="links" id ={showLinks? "hidden" : ""}>
                      <a href="/home"> HOME </a>
                      <a href="/about"> ABOUT </a>
                      <a href="/user"> USER </a>
                    </div>
                     <button onClick={()=> setShowLinks(!showLinks)}> Open </button> 
              </div>

        <div className="rightside">
<input type="text" placeholder='Search...'/>
<button>Search</button>
         </div>

</div>
);
}
export default Navbar;