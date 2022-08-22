import React from "react";
import "./todo.css";



function List(props) {

  function handleDelete(val){
    const tempTodo = [...props.todos].filter((todo)=>{
      return todo.id !== val 
    })
    props.setTodos(tempTodo)
  }

  return (
    <div >
      {props.todos.map((todo) => (
        <div>
        <div key={todo.id}>
            <h3>
              {todo.Title} :: {todo.Description} :: {todo.readStatus}
            </h3>
            <button id="check-but"
              type="submit"
              onClick={()=>handleDelete(todo.id)}
            ><i className="fa fa-times"></i>
            </button>

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
              <i className="fa fa-check"></i>
            </button>
        </div>
        </div>
      ))}
    </div>
    
  );
}
export default List;
