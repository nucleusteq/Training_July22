import React, { Component } from 'react';
import { Form, Button } from 'react-bootstrap'
import './registration.css'
import {encode as base64_encode} from 'base-64';

const axios = require('axios');


class RegistrationPage extends Component {
    state = {
        firstName: '',
        lastName: '',
        email: '',
        contact: '',
        gender: '',
        password: ''
    }

    onSubmit = () => {
        axios.post('http://localhost:8080/user/register', {
            email: this.state.email,
            password: base64_encode(this.state.password),
            firstName: this.state.firstName,
            lastName: this.state.lastName,
            contact: this.state.contact,
            gender: this.state.gender
         
        
        })
        .then( (response) => {
            // handle success
           console.log("registration success full");
           window.location.href = '/'
        })

        // this.props.history.push(`/`)
        // window.location.href = '/'
    }
    

    render() {
        return (
            <div className="registration-container">
                <div>
                    <img src='https://beagleanalytics.ai/wp-content/uploads/2020/01/helpdesk-banner_img1.jpg' className="registration-image" />
                </div>
                <div className="registration-form">
                    <Form>
                        <Form.Group className="mb-3" controlId="formBasicFirstName">
                            <Form.Label>First Name</Form.Label>
                            <Form.Control type="text" placeholder="Enter First Name" onChange={(e) => this.setState({ firstName: e.target.value })} />
                        </Form.Group>

                        <Form.Group className="mb-3" controlId="formBasicLastName">
                            <Form.Label>Last Name</Form.Label>
                            <Form.Control type="text" placeholder="Enter Last Name" onChange={(e) => this.setState({ lastName: e.target.value })} />
                        </Form.Group>

                        <Form.Group className="mb-3" controlId="formBasicEmail">
                            <Form.Label>Email address</Form.Label>
                            <Form.Control type="email" placeholder="Enter email" onChange={(e) => this.setState({ email: e.target.value })} />
                        </Form.Group>

                        <Form.Group className="mb-3" controlId="formBasicContact">
                            <Form.Label>Contact</Form.Label>
                            <Form.Control type="text" placeholder="Enter Last Name" onChange={(e) => this.setState({ contact: e.target.value })} />
                        </Form.Group>

                        <Form.Group className="mb-3" controlId="formBasicGender">
                            <Form.Label>gender</Form.Label>
                            <Form.Control type="text" placeholder="Enter gender" onChange={(e) => this.setState({ gender: e.target.value })} />
                        </Form.Group>


                        <Form.Group className="mb-3" controlId="formBasicPassword">
                            <Form.Label>Password</Form.Label>
                            <Form.Control type="password" placeholder="Password" onChange={(e) => this.setState({ password: e.target.value })} />
                        </Form.Group>
                        <Button variant="primary" type="button" onClick={this.onSubmit}>
                            Register
                        </Button>
                    </Form>
                </div>
            </div>
        );
    }
}

export default RegistrationPage;