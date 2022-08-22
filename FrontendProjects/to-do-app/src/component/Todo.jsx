import React, { useState } from "react";
import List from "./List";
import "./todo.css";
function Todo() {
  const [todos, setTodos] = useState([]);
  const [title, setTitle] = useState("");
  const [description, setDescription] = useState("");
  const [status] = useState("New");
  const [state,setState] = useState("All");
  function handleSubmit(e) {
    e.preventDefault();
    if (title.length === 0 || description.length === 0) {
      return alert("Please Enter Details..");
    }
    const currentTodo = {
      id: new Date().getTime(),
      Title: title,
      Description: description,
      readStatus: status,
    };
    setTodos([...todos].concat(currentTodo));
    setTitle("");
    setDescription("");
  }

   return (
    <div className="center_div">
        <h2>Todo App</h2>

        <div className="dropdown">
        <select onChange={(e) => setState(e.target.value)}>
            <option value="All">All</option>
            <option value="New">New</option>
            <option value="Done">Done</option>
        </select>
        </div>
        <form onSubmit={handleSubmit} className="inputs">
        <input
            id="small-input"
            type="text"
            onChange={(e) => setTitle(e.target.value)}
            value={title}
            placeholder="Enter The Title"
        />
        <input
            type="text"
            onChange={(e) => setDescription(e.target.value)}
            value={description}
            placeholder="Enter The Description"
        />
        <button id="sub-but" type="submit">
            Submit
        </button>
        </form>
        <div>
        <List todos={state ==="All" ? todos : [...todos].filter((todo) => todo.readStatus === state)} setTodos={setTodos}/>

        </div>
        </div>
   
  );
}
export default Todo;
