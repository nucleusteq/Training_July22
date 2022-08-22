
import "./api.css"
function ApiIntegrate(props){
    return(
        <div className="main-div" >
            <h2>Full Data :  <a  href='https://jsonplaceholder.typicode.com/users' target="_blank">Click Here</a></h2>
            <h2>Filtering Api Details</h2>
            <div >
            {
                props.val.map((todo) => (
                    <div className="single-div">
                        id={todo.id}  |  email={todo.email}  |  street_address={todo.address.street}
                    </div>
                ))
                }
            </div>
        </div>
        
    )
}

export default ApiIntegrate