import React, { Component } from 'react'
import { Form, Button } from 'react-bootstrap'
import './login.css'
import { ToastContainer, toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';

const axios = require('axios');

class LoginPage extends Component { 
    state = {
        email: '',
        role: '',
        password: ''
    }

    notify = (message) => toast(message);

    onSubmit = () => {
        axios.post('http://localhost:8080/user/login', {
            email: this.state.email,
            password: this.state.password
        })
        .then( (response) => {
            // handle success
           console.log("Login success full");
           window.open("/admin-dash")
        }).catch((error) => {
            console.log(error);
            // // error.
            // this.notify(error.response.data.message)
            window.location.href("/registration")
        })
        // this.props.history.push("/registration")
        // window.location.href("/registration")
    }

    validate = (key, value) => {

        const regex = /^[A-Za-z0-9._%+-]+@nucleusteq.com$/i;

        // if (key == 'email') {
        //     if (!value) {
        //         initialValues.email = "Email is required!";
        //         isStatus = false;
        //       } else if (!regex.test(values.email)) {
        //         initialValues.email = "Not valid email!";
        //         isStatus = false;
        //       } else {
        //         initialValues.email = "";
        //       }
        // }
    }

    render() {
        return (
            <div className="registration-container">
                <div>
                    <img src='https://img.freepik.com/free-vector/computer-login-concept-illustration_114360-7962.jpg?w=2000' className="login-image" />
                </div>
                <div className="login-form">
                    <Form>
                        <Form.Group className="mb-3" controlId="formBasicEmail">
                            <Form.Label>Email address</Form.Label>
                            <Form.Control type="email" placeholder="Enter email" onChange={(e) => this.setState({ email: e.target.value })} />
                        </Form.Group>
                     
                        <Form.Group className="mb-3" controlId="formBasicPassword">
                            <Form.Label>Password</Form.Label>
                            <Form.Control type="password" placeholder="Password" onChange={(e) => this.setState({ password: e.target.value })} />
                        </Form.Group>
                        <Button variant="primary" type="button" onClick={this.onSubmit} className="login-btn">
                            Login
                        </Button>
                        {/* <Button variant="primary" type="button" onClick={() => window.open("/registration")}>
                            Register
                        </Button> */}
                    </Form>
                </div>
                <ToastContainer />
            </div>
        );
    }
}
 
export default LoginPage;
