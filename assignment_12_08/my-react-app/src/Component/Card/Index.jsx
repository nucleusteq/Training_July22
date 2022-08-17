import React from "react";
const Card=(props)=>{
    return(
      <div style={{
        borderRadius:"5px",
                margin:"5px",
                padding:"5px",
                border:"2px",
                 borderStyle:"solid",
                 borderColor:"black",
      }}>
        <h1 style={{color :props.col}}>{props.name}</h1>
      
        <button style={{padding:"5px",color:props.col}}onClick={props.buttonOnClick} disabled={props.buttonDisabled}>{props.buttonName}</button>

      </div>
    );
};
export default Card;
