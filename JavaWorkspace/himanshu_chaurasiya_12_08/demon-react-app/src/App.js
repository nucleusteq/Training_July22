import React, { useState } from "react";
import "./App.css";
import ButtonComponent from "./component/inc_dec/index"

function App() {
  const [val,setVal]= useState(0);
  const MESSSAGE = "Great Work"
  return (
    <div className="App">
        <h2>Value = {val}</h2>
        <ButtonComponent  name="Increment+" bg_clr="grey" colr="green"  click={()=>{setVal(val+1)}} /> 
        <ButtonComponent  name="Decrement-" bg_clr="grey" colr="blue"  main_val={val===0?true:false } click={()=>{setVal(val-1)}} />
        {val===15&&<h3>{MESSSAGE}</h3>}   
    </div>
  );
}
export default App;