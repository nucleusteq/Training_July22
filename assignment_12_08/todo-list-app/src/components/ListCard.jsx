import React from "react";
import './ListCard.css';

const ListCard=(props)=>{
    return(
        <div className="container">
            <table>
                <tr>
                    <th>Title</th>
                    <th>Description</th>
                    <th>Status</th>
                    <th>Mark as Complete</th>
                    <th>Delete</th>
                </tr>   
                <tbody>
                {props.list.map((item)=>{
                    return <tr key={item.id}>
                        <td>{item.title}</td>
                        <td>{item.description}</td>
                        <td>{item.status}</td>
                       {item.status !== "Completed" ?<td className="tick" onClick={()=>{
                        props.markCompleted(item.taskId);
                       }} ><i className="fa fa-check"></i></td>:<td></td>} 
                        <td className="trash"  onClick={()=>{
                        props.delete(item.taskId);
                       }} ><i className="fa fa-trash"></i></td>
                    </tr>
                   
              })} 
               </tbody> 
            </table>
            
        </div>
    )

}
export default ListCard;