import React, { useState } from "react";
import Card from "./Component/Card/Index";


function App() {
  // let ] = useState(0);
  // let  ] = useState(0);
  // let [status,status] = useState();

  let [Num, counter] = useState(0);

  let [msg, new_msg] = useState("");


  let [status, new_status] = useState(false);

  // Increment
  let inc = () => {
    if (Num === 14) {
      //Message 
      new_msg("Great Work!!!!!!!!!!!!!!");
      counter(Num + 1);
    }
    else {
      new_status(status = false)
      new_msg("");
      counter(Num + 1);
    }
  };
  // Decrement
  let dec = () => {
    if ((Num - 1) === 0) {
      counter(Num - 1);
      new_status(status = true)
    }
    else {
      counter(Num - 1);
      new_status(status = false)
    }
  };

  return (
    <div className= "App" >
      
      <div>
        <h1>Ayush Bamboriya !!!!!!</h1>
        <h2> {Num} </h2>
        <button onClick={(e) => inc()}> ++</button>
        <h2>{msg}</h2>
        <button id="dec_but" disabled={status} onClick={(e) => dec()} >--</button>
        <Card name={"Addition"} buttonName={"add"} col="green" buttonOnclick={inc}></Card>
        <Card name={"Subtraction"} buttonName={"Sub"} col="Blue" buttonOnclick={dec} buttonDisabled={Num===0}></Card>
        


        
      </div>
    </div>
  );
};

export default App;
