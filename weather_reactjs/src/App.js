import axios from "axios";
import {useState} from "react";

import "bootstrap/dist/css/bootstrap.min.css"
import './App.css';

function App() {
  const apiKey = "35381b738c3b2eeacf1f2a643d7a848e"
  const [inputCity, setInputCity] = useState("")
  const [data, setData] = useState({})


  const getWetherDetails = (cityName) => {
    if (!cityName) return
    const apiURL = "https://api.openweathermap.org/data/2.5/weather?q=" + cityName + "&appid=" + apiKey
    axios.get(apiURL).then((res) => {
      console.log("response", res.data)
      setData(res.data)
    }).catch((err) => {
      console.log("err", err)
    })
  }

  const handleChangeInput = (e) => {
    console.log("value", e.target.value)
    setInputCity(e.target.value)
  }

  const handleSearch = () => {
    getWetherDetails(inputCity)
  }



  return (
    <div className="col-md-12">
      <div className="weatherBg">
        <h1 className="heading">Weather App</h1>

       <div className="d-grid gap-3 col-6 mt-4">
       <input type="text" className="form-control" />
        
        <button className="btn btn-success" type="button">Search</button> </div>       
        </div>

        <div className="col-md-12 text-center mt-5">
          <div className="shadow rounded weatherResultBox">
          <img className="weathorIcon"
              src="https://i.pinimg.com/originals/77/0b/80/770b805d5c99c7931366c2e84e88f251.png" />
<h5 className="weatherCity">Delhi</h5>
<h6 className="weatherTemp">18°C</h6>
          </div>
        </div>
    </div>
  );
}

export default App;
