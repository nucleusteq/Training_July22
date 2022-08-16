import React from "react";
// import "./todo.css";

import "./Todos.css"

function TodoList(props) {

  function handleDelete(val){
    const tempTodo = [...props.todos].filter((todo)=>{
      return todo.id !== val 
    })
    props.setTodos(tempTodo)
  }

  return (
    <div className="ouput-block">
      {props.todos.map((todo) => (
        <div key={todo.id}>

            <h3>
              {todo.Title} : {todo.Description} : {todo.readStatus}
            </h3>

            <button id="delte-but"
              type="submit"
              onClick={()=>handleDelete(todo.id)}
            >delete
            </button>

            <button id="check-but"
              type="submit"
              onClick={() => {
                const updatedTodos = [...props.todos].map((newTodo) => {
                  if (newTodo.id === todo.id) {
                    if (newTodo.readStatus === "New") {
                      newTodo.readStatus = "Done";
                      return newTodo;
                    } else {
                      newTodo.readStatus = "New";
                      return newTodo;
                    }
                  }
                  return newTodo;
                });
                props.setTodos(updatedTodos);
              }}
            >
              check
            </button>

        </div>
      ))}
    </div>
  );
}

export default TodoList;