import React, { useEffect, useState } from "react";
import axios from "axios";
import ApiIntegrate from "./component/getapidata/getapi"

function App() {
  useEffect(() => {
    getDataFunc();
  }, []);

  const [apidata, setApiData] = useState([]);

  const getDataFunc = async () => {
    let url = "https://jsonplaceholder.typicode.com/users"

    let res = await axios.get(`${url}`);
    console.log("Response from log ", res.data);
    setApiData(res.data);
  };

  return (
    <div>
      <div>
        <ApiIntegrate val={apidata} />
      </div>
    </div>
  );
}

export default App;
