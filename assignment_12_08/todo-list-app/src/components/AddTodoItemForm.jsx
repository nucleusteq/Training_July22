import React from "react";
import './AddTodoItemForm.css'
const AddTodoItemForm=(props)=>{

    function formSubmitHandler(event){
        event.preventDefault();
        console.log("Add new form submitted");
        props.onsubmit();
    }

    return(
        <div className="containerAddToDoList">
            <form onSubmit={formSubmitHandler}>    
                 <label htmlFor="title">Title</label>
                 <input type="text" name="title" onChange={props.add}></input>
                 <label htmlFor="description">Description</label>
                 <textarea rows="4" cols="200" name="description" onChange={props.add}></textarea>
                <button>Submit</button>
                <button onClick={props.onCancel}>Cancel</button>
            </form>
        </div>
    )
}
export default AddTodoItemForm;