import React,{useState} from 'react';
import AddTodoItemForm from './AddTodoItemForm';
import './FilterTodoList.css';
import ListCard from './ListCard';
const FilterTodoList=()=>{
    const [addNewTodoFlag,setAddNewTodoFlag]=useState(false);
    const[filterValue,setFilterValue]=useState(" ");
    const[id,setId]=useState(4);
    const[listItems,setListItems]=useState([]);
     const[item,setItem]=useState({taskId:'',title:'',description:'',status:''});
    function onChangeHandler(event){
        let val=event.target.value;
        if(val === "All"){
            setFilterValue("All");
        }
        else if(val ==="New"){
            setFilterValue("New");
        }
        else if(val === "Completed"){
            setFilterValue("Completed");
        }
    }
    function addListItem(event){
       const key=event.target.name;
       console.log(key);
       if(key === "title"){
            setItem({...item,title:event.target.value});
           // item.title=event.target.value;
       }
       else if(key === "description"){
        setItem({...item,description:event.target.value});
        //item.description=event.target.value;
       }
    }

    function added(){
       
        if(item.title.length === 0){
            alert("Title cannot be empty ");
        }
        else if(item.description.length === 0){
            alert("Description cannot be empty");
        }
        else{
            console.log(item);
            item.taskId=id;
            item.status="New";
            setListItems(listItems=>[...listItems,item]);
            console.log(item);
            setId(id+1);
            setAddNewTodoFlag(false);
            setItem({taskId:'',title:'',description:'',status:''});
        }


       
    }

    function addNewHandler(){
        setAddNewTodoFlag(true);
    }

    function cancelNewHandler(){
        setAddNewTodoFlag(false);
    }

    function markAsCompleted(id){
        console.log(id);
        let listItem;
        let index;
        for(let i=0;i<listItems.length;i++){
            if(listItems[i].taskId === id){
                listItem=listItems[i];
                index=i;
            }
        }
        listItem.status="Completed";
        setListItems([...listItems.slice(0,index),listItem,...listItems.slice(index+1,listItems.length)]);
    }

    function deleted(id){
        let index;
        for(let i=0;i<listItems.length;i++){
            if(listItems[i].taskId === id){
                index=i;
            }
        }
        setListItems([...listItems.slice(0,index),...listItems.slice(index+1,listItems.length)]);
    }
    return(
        <div className='filterContainer'>
            <select name='todoFilters' onChange={onChangeHandler}>
                <option value="" disabled selected hidden>Chose a filter</option>
                <option value="All">All</option>
               <option value="New">New</option>
                <option value="Completed">Completed</option>
            </select>
            <button onClick={addNewHandler}>Add New</button>
            {addNewTodoFlag && <AddTodoItemForm onCancel={cancelNewHandler} add={addListItem} onsubmit={added}></AddTodoItemForm>}
            {/* {filterValue === "all" && <ListCard list={listItems} markCompleted={markAsCompleted} delete={deleted} ></ListCard>}
            {filterValue === "new" && <ListCard list={listItems.filter((it)=>it.status ==="New")} markCompleted={markAsCompleted}  delete={deleted} ></ListCard>}
            {filterValue === "completed" && <ListCard list={listItems.filter((it)=>it.status ==="Completed")}  delete={deleted} ></ListCard>} */}
            <ListCard list={filterValue === "All"?listItems:listItems.filter((it)=>it.status ===filterValue)} markCompleted={markAsCompleted}  delete={deleted}></ListCard>
        </div>
    )

}
export default FilterTodoList;