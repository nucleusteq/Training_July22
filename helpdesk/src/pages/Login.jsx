import React from 'react'
import { useState } from 'react';
import '../assets/css/login.css'
import { loginImg } from '../assets/img'
import sideImg from '../assets/img/loginimg.svg';
import { useNavigate } from 'react-router-dom';
import { ToastContainer, toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import {encode as base64_encode} from 'base-64';

const axios = require('axios')



const Login = (props) => {
   
    const [email, setEmail] = useState('')
    const [password, setPassword] = useState('')
    const navigate = useNavigate();


    const handleLogin = () => {

        axios.post('http://localhost:8080/user/login', {
            email, password
        }).then((response) => {
            const user = response.data
            localStorage.setItem('userData', JSON.stringify(user))
            localStorage.setItem('ROLE', user.role)
            if (user.role == 'ADMIN') {
                navigate("/employee-view-ticket")
            } else {
                navigate("/employee-dash")
            }
            
        }).catch((error) => {
            toast.error(error.response.data.message, {
                draggable: true,
                position: toast.POSITION.TOP_CENTER,
            });
          
        })

    }


    
  return (
   <>
   <ToastContainer/>
        <div>
            <div className="split left">

        <img src={sideImg} alt="Avatar woman" className='centeredimg'></img>
    
    </div>
    
    <div className="split right">
       
        
        <div className="centered">
        <div className='logincontainer'>
            <form>
                <div className="form-input">
                    <label className="label">Email</label>
                    <input type="text" onChange={(e) => setEmail(e.target.value)} />
                </div>
                <div className="form-input">
                    <label className="label">Password</label>
                    <input type="password" onChange={(e) => setPassword(e.target.value)} />
                </div>
            
                <div>
                {/* <Link to="/register"> */}
                    <button type="button" disabled={email == '' || password == ''} className='buttonlogin' onClick={handleLogin}>Log in</button>
                    {/* </Link> */}
                </div>
               
            </form>
            </div>
           
        </div>
    </div>
        </div>
        </>
  )
}

export default Login;