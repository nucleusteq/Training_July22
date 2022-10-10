import React, { Component } from 'react'
import { Button, TextField, Paper, Container, Avatar, CssBaseline, Box, 
    Typography, Checkbox, Grid, FormControlLabel } from '@mui/material';

class EmployeeTicketCreate extends Component {
    state = {}

    handleSubmit = (event) => {
        event.preventDefault();
        const data = new FormData(event.currentTarget);
        console.log({
          email: data.get('email'),
          password: data.get('password'),
        });
      };


    render() {
        return (
            <div className="employee-ticket-container">
                <div>
                    <TextField id="demo-helper-text-misaligned-no-helper" label="Name" />

                </div>
            </div>
        );
    }
}

export default EmployeeTicketCreate;