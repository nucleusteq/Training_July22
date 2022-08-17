import logo from "./logo.svg";
import "./App.css";
import { useState } from "react";
import List from "./List";

function App() {
  const [currentDescription, setCurrentDescription] = useState(null);
  const[filterValue,setFilterValue]=useState(" ");
  const [currentTask, setCurrentTask] = useState(null);
  const [taskList, updateTaskList] = useState([]);
  const onChangeActionone = (e) => {
    console.log("Current task ", e.target.value);
    setCurrentTask(e.target.value);
  };

  const addListItem = ()=>{
    updateTaskList([...taskList,{task :currentTask, desc :currentDescription, key: Date.now()}]);
    // console.log("items,", taskList)
    setCurrentDescription("");
    setCurrentTask("");
    
  }

  function newOnChangeHandler(event){
    let val=event.target.value;
    if(val === "All"){
      setFilterValue("All");
    }
    else if(val === "New"){
      setFilterValue("New");
    }
    else if(val === "Completed"){
      setFilterValue("Completed");
    }
  }

  const onChangeActiontwo = (etwo)=> {
    setCurrentDescription(etwo.target.value);
  }

  return (
    <div className="App">
      <header className="App-header">
      <div className="Main-body">
      <h1 className="h1">TO DO LIST</h1>
        <div className="Wrapper">
          <select name="status" id="status" onChange={newOnChangeHandler}>
            <option value="New">New</option>
            <option value="All">All</option>
            <option value="Completed">Completed</option>
          </select><br></br><br></br>
          <div className="Input-wrapper">
            <input
              type="text"
              value={currentTask}
              required
              placeholder="Enter a new task"
              onChange={onChangeActionone}
            />
            <input type="text" placeholder="Add a description" required value={currentDescription} onChange={onChangeActiontwo}/>
          
            <button className="addtask" onClick={addListItem}>+</button><br></br><br></br>
            
          </div>
          <List taskList={filterValue === "All"?taskList:taskList.filter((it)=>it.status ===filterValue)} updateTaskList={updateTaskList}/>
        </div>
        
      </div>
        
      </header>
    </div>
  );
}

export default App;
