import React from "react";
const Card=(props)=>{
    return(
        
        <div>
            
            <h1 style={{color:"blue"}}>{props.name}</h1>
            <p>{props.descr}</p>
            <button onClick={props.buttonOnClick} >
            {props.buttonName}
            </button>
            
        </div>

    );
};

export default Card;