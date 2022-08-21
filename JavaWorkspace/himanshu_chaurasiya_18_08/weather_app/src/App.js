import React, {useEffect, useState } from "react";
import axios from "axios";
import "./App.css";
import WeatherReport from "./component/weather/weath";
function App() {

  useEffect(() => {
  GetCities(cityname);
  },{})
  
  const [cityname ,setCityName] = useState("Indore");
  const [citydata, setCityData] = useState({});

  let URL = `https://api.openweathermap.org/data/2.5/weather?q=`
  const GetCities = async (cityname) => {
    let ENDURL=`${cityname}&units=metric&appid=9569bbeb038d45723002ae537dd7397f`
    URL += ENDURL ;
    let res = await axios.get(`${URL}`);
    setCityData(res.data);

    console.log("Response of URL ", URL);
    console.log("Response from BuyPro ",res.data);
  };

  return (
      <div>
            <h2>Welcome to Weather Report</h2>
            <WeatherReport setCityName={setCityName} cityname={cityname} func={GetCities}/>
            <h2>{citydata.name} Temperatur is {citydata.main.feels_like} C°</h2>
      </div>
  );
}
export default App;