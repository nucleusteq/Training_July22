function WeatherReport(props){

    function handleSubmit(e) 
  {
    e.preventDefault();
    props.func(document.getElementById("city").value);   //passing snack id and amount into API required for params
  }
    return(
        <div>
        <form type="submit" onSubmit={handleSubmit}>
            <input id="city" autoFocus
            type="text"
            onChange={(e)=>props.setCityName(e.target.value)}
            placeholder="Enter City"
            />

            <button className="glow-on-hover" type="submit">
            Submit
            </button>
        </form>
        </div>
    )
}

export default WeatherReport;