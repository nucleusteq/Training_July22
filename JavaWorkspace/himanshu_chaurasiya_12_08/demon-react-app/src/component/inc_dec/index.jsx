import React from "react";

const inc_dec = (props) => {
  return (
    <div>
      <button  style={{ "color":props.colr , "background-color":props.bg_clr , width:"20%" , padding: "1% 2%" ,margin:"2px", "font-size":"30px"}} 
      disabled={props.main_val} onClick={props.click}> {props.name} </button>
    </div>
  );
};
export default inc_dec;
