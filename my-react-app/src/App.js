import './App.css';
import Card from "./components/card";
import React, {useState } from "react";

function App() {
 
  var num=0;
  const [number, SetNumber] = useState(num);
  const [name, SetName] = useState("HOLA !!");
  const GREATWORK = "Good Work";

  const add = (event) => {
    SetNumber(number + 1);
  }

  const sub = (event) => {
    SetNumber(number - 1);
  }

  const changeName = () => {
    SetName("AAYUSHI GOPAWAR");
  }

  return (
    <div className="App">
      <header>
        <title>Aayushi Gopawar</title>
      </header>
      <h1>{name}</h1>
      <h1>{number}</h1>
      {number===15&&<h2>{GREATWORK}</h2>}
      <Card onClick={name} descr={" Click to ADD."} buttonName="Add" col="green" buttonOnClick={(e) => add(e)} />
      <Card onClick={name} descr={"Click to Subtract"} buttonName="Sub" col="red" buttonOnClick={(e) => sub(e)} buttonDisabled={number === 0}  />
      <Card onClick={name} descr={"Click to change title name "} buttonName="Name Change" col="blue" buttonOnClick={(e) => changeName(e)} />

    </div>
  );
}
export default App;