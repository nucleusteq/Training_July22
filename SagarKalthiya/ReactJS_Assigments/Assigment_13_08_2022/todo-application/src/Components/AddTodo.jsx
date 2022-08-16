import React, { useState } from "react";
import AddList from "./AddList";
import 'C:/Users/opera/OneDrive/Desktop/ReactTodoApp/todo-application/src/App.css';
import PopUp from "./PopUp";

function AddTodo() {
  const [modalOpen, setModalOpen] = useState(false);
  const [todoItem, settodoItem,] = useState([]);
  const [title, setTitle] = useState("");
  const [description, setDescription] = useState("");
  const [itemStatus] = useState("New");
  const [itemState,setState] = useState("All");

  const textEvent = (event) => {
    setTitle(event.target.value);
    setDescription(event.target.value);
  }


  function handleSubmit(e) {
    e.preventDefault();

    if (title.length === 0 || description.length === 0) {
      return alert("Enter Details");
    }

    const currentTodo = {
      id: new Date().getTime(),
      Title: "Title: "+title,
      Description: "Description: "+description,
      readStatus: "Status: "+itemStatus,
    };
    settodoItem([...todoItem].concat(currentTodo));
    setTitle("");
    setDescription("");
    setModalOpen(false);
  }

  

   return (
    <div className="App">
        <h1>This is My Todo List.</h1>
      <div class="btn-group">
        <button
          className="openModalBtn"
          onClick={() => {
            setModalOpen(true);
          }}
        >
          Add Todo List
        </button>
      </div>
      <br></br>
      <div class="select">
        <select onChange={(e) => setState(e.target.value)}>
          <option value="All">All Task</option>
          <option value="New">New Task</option>
          <option value="Done">Completed Task</option>
        </select>
      </div>

    

      <div>
        {/* { <AddList todoItem={itemState ==="All" ? todoItem : [...todoItem].filter((Item) => Item.readStatus === itemStatus)}
         settodoItem={settodoItem}/>} */}
         <AddList todoItem={itemState ==="All" ? todoItem : [...todoItem].filter((Item) => Item.readStatus === itemState)}
          settodoItem={settodoItem}/>
          <br></br>
      </div>
      <br></br>
      {modalOpen && <PopUp setOpenModal={setModalOpen} textEvent={textEvent} handleSubmit={handleSubmit}/>}

      
    </div>
  );
}

export default AddTodo;