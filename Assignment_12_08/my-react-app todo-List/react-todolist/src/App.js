import React, { useState } from "react";
import ListItem from "./ListItem";


import "./App.css";
const App = () => {

  const [todos, setTodos] = useState([])

  const [title, setTitle] = useState('')

  const onAdd = () => {
    let todosList = todos;
    const newItem = {
      done: false,
      title: title
    };
    todosList.push(newItem);
    setTitle('')
  }

  const onSetTitle = (event) => {
    setTitle(event.target.value)
  }

  
  const onDelete = (idx) => {
    const todosList = todos.filter((item, index) => index != idx)
    setTodos(todosList)
  }

  return (
    <div className="App">
      <div className="container">
        <h1> My Todo-List </h1>
        <div className="todoForm">
          <input className="inputText" type="text" value={title} onChange={onSetTitle} />
          <button className="addButton" onClick={onAdd}>Add</button>
        </div>

        <ul>
          {todos.map((item, index) => (
            <ListItem title={item.title} onDone={onDone} index={index} onDelete={onDelete} />
          ))}
        </ul>


      </div>
    </div>);

};
export default App;