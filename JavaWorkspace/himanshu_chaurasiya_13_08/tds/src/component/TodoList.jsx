import React from "react";
import "./todo.css";

function TodoList(props) {
  return (
    <div className="ouput-block">
      {props.todos.map((todo) => (
        <div>
          <h3>
            {todo.Title} : {todo.Description} : {todo.readStatus}
          </h3>
            <button id="check-but"
              type="submit"
              key={todo.id}
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
              Check
            </button>
          
        </div>
      ))}
    </div>
  );
}

export default TodoList;
