import React, { useState } from "react";
import TodoList from "./TodoList";
import "./todo.css";

function Todo() {
  const [todos, setTodos] = useState([]);
  const [changedtodos, setChangedTodos] = useState([]);
  const [title, setTitle] = useState("");
  const [description, setDescription] = useState("");
  const [status] = useState("New");

  function handleSubmit(e) {
    e.preventDefault();

    if (title.length === 0 || description.length === 0) {
      return alert("Please Enter Details in both fields");
    }

    const currentTodo = {
      id: new Date().getTime(),
      Title: title,
      Description: description,
      readStatus: status,
    };
    setTodos([...todos].concat(currentTodo));
    setChangedTodos([...todos].concat(currentTodo));
    setTitle("");
    setDescription("");
  }

  function handleChange(val) {
    if (val === "All") {
      // setTodos(todos);
      setChangedTodos(todos);
    } else {
      const updatedTodos = [...todos].filter((todo) => todo.readStatus === val);
      setChangedTodos(updatedTodos);
    }
  }

  return (
    <div className="todo-main">
      <div className="dropdown">
        <select onChange={(e) => handleChange(e.target.value)}>
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
          placeholder="Enter Title"
        />
        <input
          type="text"
          onChange={(e) => setDescription(e.target.value)}
          value={description}
          placeholder="Enter Description"
        />
        <button id="sub-but" type="submit">
          Submit
        </button>
      </form>

      <div>
        <TodoList todos={changedtodos} setTodos={setChangedTodos} />
      </div>
    </div>
  );
}

export default Todo;
