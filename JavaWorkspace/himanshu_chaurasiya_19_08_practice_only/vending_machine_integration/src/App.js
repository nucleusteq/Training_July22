import React, { useEffect, useState } from "react";
import axios from "axios";
import "./App.css";

import {
  GetAllPro,
  BuyProduct,
  ProductDetails,
  AddProductFunc,
} from "./component/getapidata/getapi";

function App() {
  useEffect(() => {
    GetAllProducts();
  }, []);

  let URL = "http://localhost:8080";

  const [getallpro, setGetAllPro] = useState([]);
  const [boughtpro, setBoughtPro] = useState({});
  const [addpro, setAddPro] = useState({});

  const [purchasedproductflag, setPurchasedProductFlag] = useState(false);
  const [buyproductflag, setBuyProductFlag] = useState(false);
  const [addproductflag, setAddProductFlag] = useState(false);


  const GetAllProducts = async () => {
    let ENDPOINT = "/getProducts";
    let res = await axios.get(`${URL}${ENDPOINT}`);
    console.log("Response from log ", res.data);
    setGetAllPro(res.data);
  };

  const BuyPro = async (snackId, inputAmount) => {
    let ENDPOINT = `/buy?id=${snackId}&amount=${inputAmount}`;
    let res = await axios.get(`${URL}${ENDPOINT}`);
    console.log("Response from BuyPro ", res.data);
    setBoughtPro(res.data);
    setPurchasedProductFlag(true);
    setBuyProductFlag(false);
    GetAllProducts();
  };


  const AddProduct = async (productObj) => {
    let ENDPOINT = `/add`;
    console.log("Given Object ", productObj);
    let res = await axios.post(`${URL}${ENDPOINT}`,productObj);
    console.log("Response from log ", res.data);
    setAddPro(res.data);
    GetAllProducts();
    setAddProductFlag(false)
  };

  return (
    <div className="app-main-div">
      
      <div className="first-div">
        <h2>Welcome to Vending Machine</h2>
      </div>

      <div className="second-div">
        <h2>Available Products</h2>
        <GetAllPro val={getallpro} />
      </div>

      <div className="third-div">

        <button className="glow-on-hover" onClick={() => {setBuyProductFlag(true);setPurchasedProductFlag(false);setAddProductFlag(false)} }>Buy</button>
        <button className="glow-on-hover" onClick={() => {setAddProductFlag(true);setPurchasedProductFlag(false);setBuyProductFlag(false)} }>Add</button>

        {buyproductflag && (
          <div>
            <h2>User : Enter Details to Buy Product</h2>
            <BuyProduct func={BuyPro} />
          </div>
        )
        }

        {addproductflag && (
          <div>
            <h2>Admin : Add Product</h2>
            <AddProductFunc  mainFunc={AddProduct} />
          </div>
        )
        }

      </div>
        
      <div className="fourth-div">
        {purchasedproductflag && (<ProductDetails val={boughtpro} />) }
      </div>

    </div>
  );
}

export default App;
