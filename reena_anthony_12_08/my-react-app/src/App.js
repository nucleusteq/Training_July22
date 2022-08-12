import React, { useState } from "react";
import './App.css';
import Card from "./components/card";


function App() {

  var num=0;
  const [number, SetNumber] = useState(num);
  const [name, SetName] = useState("Reena");
  const GREATWORK = "Great Work";

  const add = (event) => {
    SetNumber(number + 1);
  }

  const sub = (event) => {
    SetNumber(number - 1);
  }

  const changeName = () => {
    SetName("Reena Anthony");
  }

  return (
    <div className="App">
      <header>
        <title>Reena Anthony</title>
      </header>
      <h1>{name}</h1>
      <h1>{number}</h1>
      {number===15&&<h2>{GREATWORK}</h2>}
      <Card onClick={name} descr={"This button is for addition..."} buttonName="Add" col="green" buttonOnClick={(e) => add(e)} />
      <Card onClick={name} descr={"This button is for subtraction..."} buttonName="Sub" col="blue" buttonOnClick={(e) => sub(e)} buttonDisabled={number === 0}  />
      <Card onClick={name} descr={"This button is for changing title name..."} buttonName="Name Change" col="red" buttonOnClick={(e) => changeName(e)} />

    </div>
  );
}

export default App;
