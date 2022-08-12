import React, { useState }from 'react';

import './App.css';
import Card from "./components/cards";
function App() {
  const [number,SetNumber] = useState(10);
  const [message, setMessage]= useState("");
  const add = (event) =>{   
    SetNumber(number+1);
    if((number+1)== 15){
      setMessage("Great Work!!")
    }else{
      setMessage("");
    }
  }
  const subtract = (event) => {
   
    SetNumber(number-1);
    if(number==0){
      SetNumber(0);
    }
    if((number-1)==15){
      setMessage("Great Work");
    }else{
      setMessage("");
    }
  }
  return (
    <div className="App">
      <h1>{number}</h1>
      <h2>{message}</h2>
{/*       
      <button disabled={number==0} onClick={(e) => subtract(e)} >-</button>
      &nbsp;&nbsp;&nbsp;
      <button onClick={(e) => add(e)}>+</button> */}

<Card name={"Add"} buttonName={"Add"} function={add} buttonColor="Blue"></Card>
<Card name={"Subtract"} buttonName={"Minus"} function={subtract} buttonColor="Red"></Card>
</div>
  );
}

export default App;
