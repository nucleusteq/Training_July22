import { Button, Paper, Table, TableBody, TableCell, TableContainer, TableHead, TableRow } from '@mui/material';
import React, { useEffect } from 'react'
import { useState } from 'react';
import { Link } from 'react-router-dom';
import '../assets/css/header.css';
import EmployeeTicketCreate from './EmployeeTicketCreate';
import Ticket from './Ticket';
import { getAllTicket, reopenTicket } from '../util/HttpService.js'

function EmployeeDash() {

    const [ticketList, setTicketList] = useState([])

    useEffect(() => {
        fetchTicketList()
    }, [])

    const fetchTicketList = () => {

        const userId = JSON.parse(localStorage.getItem('userData')).id

        getAllTicket("?userId=" + userId).then((response)=>{
            setTicketList(response.data)
        })
    }

    const handleReopenTicket = (ticketId) => {
        reopenTicket(ticketId).then((response)=>{
            fetchTicketList()
        })
    }
    

    return (
        <div>
            <div >
                <header className="header-fixed">
                    <div className="header-limiter">

                        <h1><a href="#">HelpDesk<span>Employee</span></a></h1>

                        <nav>
                            <a href="/employee-raise-ticket">Create Ticket</a>
                            {/* <a href="/employee-view-ticket">View Ticket</a> */}

                            <a href="/">Logout</a>
                        </nav>

                    </div>


                </header>
                
            </div>
            { ticketList.length > 0 ? 
            <TableContainer component={Paper}>
                        <Table aria-label="collapsible table">
                            <TableHead>
                                <TableRow>
                                    <TableCell style={{ fontWeight: 'bold' }} className="order-table-heading" align="center" >Id</TableCell>
                                    <TableCell style={{ fontWeight: 'bold' }} className="order-table-heading" align="center" >Category</TableCell>
                                    <TableCell style={{ fontWeight: 'bold' }} className="order-table-heading" align="center">Sub Category</TableCell>
                                    <TableCell style={{ fontWeight: 'bold' }} className="order-table-heading" align="center">Priority</TableCell>
                                    <TableCell style={{ fontWeight: 'bold' }} className="order-table-heading" align="center">Status</TableCell>
                                    <TableCell style={{ fontWeight: 'bold' }} className="order-table-heading" align="center">Description</TableCell>
                                    <TableCell style={{ fontWeight: 'bold' }} className="order-table-heading" align="center">Creation Date</TableCell>
                                    <TableCell style={{ fontWeight: 'bold' }} className="order-table-heading" align="center">Required Date</TableCell>
                                    <TableCell style={{ fontWeight: 'bold' }} className="order-table-heading" align="center">Resolved Date</TableCell>
                                    <TableCell style={{ fontWeight: 'bold' }} className="order-table-heading" align="center">Assign To</TableCell>
                                    <TableCell  style={{ fontWeight: 'bold' }}className="order-table-heading" align="center">Raised By</TableCell>
                                    <TableCell style={{ fontWeight: 'bold' }} className="order-table-heading" align="center">Reopen</TableCell>
                                </TableRow>
                            </TableHead>
                            <TableBody>
                                {
                                    ticketList.map((t, idx) => (
                                        <TableRow key={t.id} sx={{ '& > *': { borderBottom: 'unset' } }}>
                                            <TableCell align="center">{t.id}</TableCell>
                                            <TableCell align="center">{t.category?.categoryName}</TableCell>
                                            <TableCell align="center">{t.subCategory?.categoryName}</TableCell>
                                            <TableCell align="center">{t.priority}</TableCell>
                                            <TableCell align="center">{t.status}</TableCell>
                                            <TableCell align="center">{t.description}</TableCell>
                                            <TableCell align="center">{t.creationDate}</TableCell>
                                            <TableCell align="center">{t.requiredDate}</TableCell>
                                            <TableCell align="center">{t.resolveDate}</TableCell>
                                            <TableCell align="center">{t.assignTo ? (t.assignTo?.firstName + " " + t.assignTo?.lastName) : ''}</TableCell>
                                            <TableCell align="center">{t.raisedBy ? (t.raisedBy?.firstName + " " + t.raisedBy?.lastName) : ''}</TableCell>
                                            <TableCell align="center"><Button variant="contained" disabled={t.status !== 'RESOLVED' } onClick={()=>{handleReopenTicket(t.id)}}>Reopen</Button></TableCell>
                                        </TableRow>
                                    ))
                                }

                            </TableBody>
                        </Table>
                    </TableContainer>
            : "No ticket found"}
        </div>
    );
}

export default EmployeeDash