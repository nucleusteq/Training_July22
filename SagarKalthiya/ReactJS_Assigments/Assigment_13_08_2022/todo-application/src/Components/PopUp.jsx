import React from 'react';
import "C:/Users/opera/OneDrive/Desktop/ReactTodoApp/todo-application/src/Components/Model.css";

const PopUp = (props) => {

  return (
    <>
      <div className="modalBackground">
        <div className="modalContainer">
          <div className="titleCloseBtn">
            <button
              onClick={() => {
                props.setOpenModal(false);
              }}
            >
              X
            </button>
          </div>
          <div className="title">
            <h1>Add Item</h1>
          </div>
          <div className="body">
            <form onSubmit={props.handleSubmit}>
              <input
                id="small-input"
                type="text"
                onChange={props.textEvent}
                value={props.title}
                placeholder="Enter Title"
              />
              <input
                type="text"
                onChange={props.textEvent}
                value={props.description}
                placeholder="Enter Description"
              />
               <div className="footer">
            <button
              onClick={() => {
                props.setOpenModal(false);
              }}
              id="cancelBtn"
            >
              Cancel
            </button>
            <button id="sub-but" type="submit">Submit</button>
          </div>
            </form>
          </div>
         
        </div>
      </div>
    </>
  );
};
export default PopUp