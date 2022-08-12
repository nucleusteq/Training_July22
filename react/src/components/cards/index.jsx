import React from "react";


const Card = (props) => {
    // console.log(props);
    return(<div style={{ border: "1px", borderColor: "black", borderStyle: "dashed", padding: "5px", margin: "5px" }}>
    <h1>{props.name}</h1>
    <button style={{ color: props.buttonColor }} onClick={props.function}>{props.buttonName}</button>

</div>);
}

export default Card;