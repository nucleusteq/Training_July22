import React, { Component } from 'react'
import '../assets/css/login.css'
// import { useNavigate } from 'react-router-dom';

import { postRequest } from '../Actions/Apis/apicall';

import sideImg from '../assets/img/loginimg.svg';
import { withRouter } from "react-router"

import { RAISE_TICKET } from '../Actions/ApiEndPoints';
import { Select, MenuItem, TextField } from '@mui/material'
import { getAllCategory, raiseTicket } from '../util/HttpService'
import { useEffect } from 'react';
import { DesktopDatePicker, LocalizationProvider } from '@mui/x-date-pickers';
import dayjs, { Dayjs } from 'dayjs';
import { AdapterDayjs } from '@mui/x-date-pickers/AdapterDayjs';

import 'react-toastify/dist/ReactToastify.css';
import { Navigate } from 'react-router-dom';
import userEvent from '@testing-library/user-event';
import { ToastContainer, toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';



class Ticket extends Component {
    //    navigate = useNavigate();

    state = {
        categoryList: [],
        subCategoryList: [],
        description: '',
        status: 'OPEN',
        priority: 'LOW',
        category: null,
        subCategory: null,
        requiredDate: '',
        redirect: false,
        name: JSON.parse(localStorage.getItem('userData')).firstName+" "+JSON.parse(localStorage.getItem('userData')).lastName, 
        email:  JSON.parse(localStorage.getItem('userData')).email
         
    }

    componentDidMount() {
        this.fetchTicket()
    }

    fetchTicket = () => {
        getAllCategory().then((response) => {
            this.setState({ categoryList: response.data })
        })
    }
    handleClick = () => {
        // this.props.navigation("/")
        // this.setState({ redirect: true })
        this.props.history.replace("/")

    }

    handleRaiseTicket = () => {
        raiseTicket({
            category: this.state.category,
            subCategory: this.state.subCategory,
            description: this.state.description,
            status: this.state.status,
            priority: this.state.priority,
            requiredDate: this.state.requiredDate,
            raisedBy: JSON.parse(localStorage.getItem('userData'))
        }).then((response) => {
            // this.state.redirect && <Navigate to='/' replace={true} />
           
            toast.error('Ticket has been raised', {
                draggable: true,
                position: toast.POSITION.TOP_CENTER,
            });
            setTimeout(function(){
                window.location.reload(1);
             }, 3000);
             

        }).catch((error) => {
            toast.error(error.response.data.message, {
                draggable: true,
                position: toast.POSITION.TOP_CENTER,
            });
          
        })
    }

    render() {
        return (
            <>
            <ToastContainer/>
            <div>

                <div class="split left">
                    <img src={sideImg} alt="Avatar woman" className='centeredimg'></img>
                </div>
                {/* {this.props.redirect &&
                    <Navigate to="/" replace={true} />

                } */}
                <div class="split right">
                    <div class="centered">
                        <div className='logincontainer'>

                        <div class="form-input">
                                <label for="name" className="label">Name</label>
                                <input id="name"
                                    type="description"
                                    className="input"
                                    name="name"
                                    value={this.state.name}
                                    disabled={"true"}></input>
                            </div>

                            <div class="form-input">
                                <label for="email" className="label">Email</label>
                                <input id="email"
                                    type="description"
                                    className="input"
                                    name="email"
                                    value={this.state.email}
                                    disabled={"true"}></input>
                            </div>

                            <div class="form-input">
                                <label for="category" className="label">Category</label>
                                {/* <input id="category"
                                type="text"
                                className="input"
                                name="category"
                                value={formValues.category}
                                onChange={handleChange}></input> */}
                                <Select
                                    labelId="demo-simple-select-standard-label"
                                    id="demo-simple-select-standard"
                                    value={this.state.category}
                                    onChange={(e) => {
                                        console.log(e.target.value);
                                        this.setState({ category: e.target.value, subCategoryList: e.target.value.subCategoryDTOS, subCategory: null })
                                    }}
                                    label="Category"
                                >
                                    {this.state.categoryList.map(cat => (
                                        <MenuItem value={cat}>{cat.categoryName}</MenuItem>
                                    ))}
                                </Select>
                            </div>



                            <div className="form-input">
                                <label for="subCategory" className="label">SubCategory</label>
                                <Select
                                    labelId="demo-simple-select-standard-label"
                                    id="demo-simple-select-standard"
                                    value={this.state.subCategory}
                                    onChange={(e) => {
                                        console.log(e.target.value);
                                        this.setState({ subCategory: e.target.value })
                                    }}
                                    label="Category"
                                >
                                    {this.state.subCategoryList.map(cat => (
                                        <MenuItem value={cat}>{cat.categoryName}</MenuItem>
                                    ))}
                                </Select>
                            </div>



                            <div class="form-input">
                                <label for="description" className="label">Description</label>
                                <input id="description"
                                    type="description"
                                    className="input"
                                    name="description"
                                    value={this.state.description}
                                    onChange={(e) => this.setState({ description: e.target.value })}></input>
                            </div>


                            <div class="form-input">
                                <label for="status" className="label">Status</label>
                                <input id="status"
                                    type="description"
                                    className="input"
                                    name="status"
                                    value={this.state.status}
                                    onChange={(e) => this.setState({ status: e.target.value })} disabled></input>

                                {/* <Select
                                labelId="demo-simple-select-standard-label"
                                id="demo-simple-select-standard"
                                value={formValues.status}
                                onChange={(e) => setStatus(e.target.value)}
                                label="Status"
                            >
                                <MenuItem value={'OPEN'}>Open</MenuItem>
                                <MenuItem value={'IN_PROGRESS'}>In Progress</MenuItem>
                                <MenuItem value={'DONE'}>Done</MenuItem>
                            </Select> */}
                            </div>



                            <div class="form-input">
                                <label for="priority" className="label">Priority</label>
                                <input id="priority"
                                    type="description"
                                    className="input"
                                    name="priority"
                                    value={this.state.priority}
                                    disabled={"true"}></input>
                            </div>


                            <div class="form-input">
                                {/* <label for="requiredDate" className="label">requiredDate</label> */}
                                <LocalizationProvider dateAdapter={AdapterDayjs}>
                                    <DesktopDatePicker
                                        label="Required Date"
                                        inputFormat="YYYY-MM-DD"
                                        value={this.state.requiredDate}
                                        onChange={(e) => this.setState({ requiredDate: e })}
                                        renderInput={(params) => <TextField {...params} />}
                                    />
                                </LocalizationProvider>

                            </div>





                            <div>
                                <button type="button" disabled={!this.state.category || !this.state.description} className='buttonlogin' onClick={this.handleRaiseTicket} >Raise Ticket</button>
                                {/* <button type="button" className='buttonlogin' onClick={() => this.handleClick()}>Raise Ticket</button> */}
                            </div>
                        </div>
                    </div>

                </div>

            </div>
            </>
        );
    }
}

export default Ticket;