import React from "react"; 

const Card = (props) => {
    return (
      <>  
        <div
            style={{
                borderRadius: "5px",
                padding: "2rem",
                border: "2px",
                borderColor: "black",
                borderStyle: "solid",
                margin: "3rem",
            }}
        >
            <h1 style={{ color: "red" }}>{props.name}</h1>
            <p> {props.descr} </p>

            <button onClick= {props.buttonOnClick} style={{ padding: "5px", borderColor: "white", color: "white", backgroundColor: props.col}} disabled={props.buttonDisabled}>
            {props.buttonName}

            </button>    
        </div>
      </>      
    );

};

export default Card;