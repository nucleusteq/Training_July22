import React, {useEffect, useState } from "react";
import axios from "axios";
import "./App.css";
import WeatherReport from "./component/weather/weath";
function App() {

  useEffect(() => {
  GetCities("Indore");
  },{})
  
  const [cityname ,setCityName] = useState("");
  const [citydata, setCityData] = useState(null);

  let URL = `https://api.openweathermap.org/data/2.5/weather?q=`
  const GetCities = async (cityname) => {
    let ENDURL=`${cityname}&units=metric&appid=9569bbeb038d45723002ae537dd7397f`
    URL += ENDURL ;
    let res = await axios.get(`${URL}`);
    setCityData(res.data);
  };

  return (
      <div className="main-app-div">
            <h2 id="heading">Welcome to Weather Report</h2>
            <WeatherReport setCityName={setCityName} cityname={cityname} func={GetCities}/>
            <div>
            {citydata != null ? 
            <div className="temp-div">
            <h2>{citydata.name}</h2><h2>{citydata.main.temp} °C</h2>
             </div>: ""}
            </div>
      </div>
  );
}
export default App;