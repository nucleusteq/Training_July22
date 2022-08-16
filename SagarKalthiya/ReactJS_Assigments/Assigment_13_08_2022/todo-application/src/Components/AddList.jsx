import React from "react";
import 'C:/Users/opera/OneDrive/Desktop/ReactTodoApp/todo-application/src/App.css';

function AddList(props) {

    function Deleteitem(val) {
        const deletetodo = [...props.todoItem].filter((Item) => {
            return Item.id !== val
        })
        props.settodoItem(deletetodo)
    }

    return (

        <div>
            <br></br>
            {props.todoItem.map((Item) => (
                <div>
                    <button class="button-one" type="submit"
                        onClick={() => Deleteitem(Item.id)}>
                        Delete
                    </button>
                    <h3 class="button-two">
                        {Item.Title} : {Item.Description} : {Item.readStatus}
                    </h3>
                    <button class="button-three" id="check-but"
                        type="submit"
                        key={Item.id}
                        onClick={() => {
                            const updatedTodos = [...props.todoItem].map((newTodo) => {
                                if (newTodo.id === Item.id) {
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
                            props.settodoItem(updatedTodos);
                        }}
                    >
                        Done
                    </button>

                </div>
            ))}

        </div>
    );
}

export default AddList;
