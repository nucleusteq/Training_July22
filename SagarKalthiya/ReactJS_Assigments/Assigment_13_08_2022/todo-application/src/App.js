import React from "react";
import './App.css';
import AddTodo from "./Components/AddTodo";

function App() {
  return (
    <div>
      {<AddTodo/>}

      {/* {modalOpen && <PopUp setOpenModal={setModalOpen} textEvent={textEvent} buttonOnClick={() => {
        buttonClick();
      }} />} */}
    </div>
  );
}

export default App;
