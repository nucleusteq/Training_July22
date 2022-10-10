
import React, { Component } from 'react'
import { Form, Button } from 'react-bootstrap'


const axios = require('axios');

class AdminDashboard extends Component {
   
  
    render() {
        return (    
            <div className="adminHome-container">
                <div>
                    <img src='' className="" />
                </div>
                <div className="adminHome-form">
                    <Form>
                        <div className='create-user-button'>  
                        <Button variant="primary" type="button" onClick={() => window.open("/emp-register")}>
                            create employee
                        </Button>
                        <Button variant="primary" type="button" onClick={() => window.open("/")}>
                            Logout
                        </Button>
                        </div>
                    </Form>
                </div>

            </div>
        );
    }
}
 
export default AdminDashboard;
