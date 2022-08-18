
import './App.css';
import React,{useState} from "react";
import Card from "./Components/card"
function App(){
  const [number,SetNumber]=useState(0);


  return(
    <div className="App">
      <div>
      <h1>{number}</h1>
      <Card name={"Add"} descr={"add"} buttonName="Add" buttonOnClick={()=>{SetNumber(number+1)}}/>
    <Card name={"Sub"} descr={"sub"} buttonName="Sub" buttonOnClick={()=>{SetNumber(number-1)}}/>
    </div>
    </div>
  );
}

export default App;
