import './List.css'; 


function List(props) {

    const deleteTask = (key) => {
        const newList = props.taskList.filter(taskobj=>{
            return taskobj.key !== key;
        });
        props.updateTaskList(newList);
    };

    const checkTask = (key) => {
        
    }
  return (
    <div>
      {props.taskList.map(taskobj => {
        return ( 
            <div key={taskobj.key}className="Task">
            <p>Title: {taskobj.task}</p>
            <p>Description: {taskobj.desc}</p>
            <button onClick={()=>deleteTask(taskobj.key)}>X</button>
            <button onClick={()=>checkTask(taskobj.List)}>v</button>
            </div>
        );
      })}
    </div>
  );
}

export default List;
