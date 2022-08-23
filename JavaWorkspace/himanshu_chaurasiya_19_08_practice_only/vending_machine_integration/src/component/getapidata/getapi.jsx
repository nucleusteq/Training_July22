import React from "react";
import { useState } from "react";
import "./getapi.css";

function GetAllPro(props) {
  return (
    <div>

      <div className="table-div">

        <table className="main-table">
          <tr>
            <th>Snack Id</th>
            <th>Snack</th>
            <th>Price</th>
            <th>Quantity</th>
          </tr>

          {props.val.map((todo) => (
            <tr>
              <td>{todo.id}</td>
              <td>{todo.snackName}</td>
              <td>{todo.snackPrice}</td>
              <td>{todo.qtyAvailable}</td>
            </tr>
          ))}
        </table>

      </div>

    </div>
  );
}

function BuyProduct(props) {

  const [snack, setSnack] = useState(null);
  const [price, setPrice] = useState(null);

  function handleSubmit(e) 
  {
    e.preventDefault();

    if (snack === null || price === null) {
      return alert("Please Enter Details in both fields");
    }

    props.func(snack, price);   //passing snack id and amount into API required for params
  }

  return (
    <div className="main-div">

      <form onSubmit={handleSubmit} className="inputs">

        <input id="small-input"autoFocus
          type="text"
          onChange={(e) => setSnack(e.target.value)}
          value={snack}
          placeholder="Enter ID"
        />

        <input
          type="text"
          onChange={(e) => setPrice(e.target.value)}
          value={price}
          placeholder="Enter Amount"
        />

        <button className="glow-on-hover" type="submit">
          Submit
        </button>

      </form>

    </div>
  );
}

function ProductDetails(props) {
  return (
    <div>

      <div>
        <h2>Purchase Details</h2>
      </div>

      {/* <div>
      {
        props.val.denomination.map((item)=>{
          return <div>{item.denomKey} x {item.denomValue}</div>
        })
      }
      </div> */}

      <div>
        {
        props.val.snackId !== null
          ? props.val.status +
            " | " +
            props.val.price +
            " | " +
            props.val.snack +
            " | " +
            props.val.description
          : 
          (props.val.status !== null
          ? props.val.status
          : "")
        }
      </div>

        {props.val.denomination.length>0 && <div>
            Denomination :
            {
            props.val.denomination.map((item)=>{
                return ` INR ${item.denomKey} x ${item.denomValue} |`
              })
            }
        </div>
        }


    </div>
  );
}


function AddProductFunc(props) {

  function handleSubmit(e)
  {
    e.preventDefault();

    const productObject =
    {
    id : 0,
    snackName : document.getElementById("inputSnackName").value,
    qtyAvailable : document.getElementById("inputSnackQuantity").value,
    snackPrice : document.getElementById("inputSnackPrice").value,
    snackDesc : document.getElementById("inputSnackDescription").value,
    }

    props.mainFunc(productObject) //passing object into API required for request body.
  }

  return (
    <div className="add-product-func-div">
      
      <form onSubmit={handleSubmit} className="inputs">

        <input autoFocus
        id="inputSnackName"
          type="text"
          placeholder="Enter Snack Name"
        />

        <input
        id="inputSnackQuantity"
          type="text"
          placeholder="Enter Quantity"
        />

        <input
        id="inputSnackPrice"
          type="text"
          placeholder="Enter Price"
        />

        <input
        id="inputSnackDescription"
          type="text"
          placeholder="Enter Description"
        />

        <button className="glow-on-hover" type="submit">
          Submit
        </button>

      </form>

    </div>
  );
}

export { GetAllPro, BuyProduct, ProductDetails ,AddProductFunc};
