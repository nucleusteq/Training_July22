import React, { Component } from 'react';
import { TableContainer, Table, Paper, TableHead, TableCell, TableRow, TableBody, Modal, Box, Typography, Button, Select, MenuItem } from '@mui/material';
import { getAllTicket, updateTicket, getAllAdmin } from '../util/HttpService';
import './employeeViewTicket.css'

const style = {
    position: 'absolute',
    top: '50%',
    left: '50%',
    transform: 'translate(-50%, -50%)',
    width: 400,
    bgcolor: 'background.paper',
    border: '2px solid #000',
    boxShadow: 24,
    p: 4,
};

class EmployeeViewTicket extends Component {

    state = {
        ticketList: [],
        adminList: [],
        isAdmin: false,
        openUpdateModal: false,
        status: '',
        priority: '',
        idx: 0,
        assignTo: null,
        priorityFilterList: ['LOW', 'MODERATE', 'HIGH', 'VERY_HIGH'],
        priorassignToFilterityFilter: '',
        statusFilterList: ['OPEN', 'PROGRESS', 'RESOLVED'],
        statusFilter: '',
        assignToFilter: '',
        priorityFilter: '',
        raisedByList: [],
        raisedByFilter: ''
    }

    componentDidMount() {
        this.fetchAllTickets("")
        this.fetchAllAdmin()
        this.fetchAllEmployee()
        this.setState({ isAdmin: localStorage.getItem('ROLE') === 'ROLE_ADMIN' })
    }

    fetchAllTickets = (param) => {
        getAllTicket(param).then((response) => {
            console.log("what data>>>", response);
            this.setState({ ticketList: response.data })
        })
    }

    fetchAllAdmin = () => {
        getAllAdmin().then((response) => {
            this.setState({ adminList: response.data })
            console.log("list of admin", response.data);
        })
    }

    fetchAllEmployee = () => {
        getAllAdmin().then((response) => {
            this.setState({ employeeList: response.data })
            console.log("list of employee", response.data);
        })
    }

    handleUpdate = () => {
        updateTicket({
            priority: this.state.priority,
            status: this.state.status,
            id: this.state.ticketList[this.state.idx].id,
            assignTo: this.state.assignTo
        }).then((response) => {

            this.fetchAllTickets("");
            console.log(response);

        }).catch((error) => {
            console.log(error);
        })
        this.setState({ openUpdateModal: false })
    }

    handleFilterChange = (key, value) => {
        console.log(key, value);
        if (key === 'RESET') {

            this.setState({ priorityFilter: '' })
            this.fetchAllTickets("");
            this.setState({ statusFilter: "" });
            this.setState({ assignToFilter: "" });
            this.setState({ priorityFilter: "" });
        } else if (key === 'PRIORITY') {
            this.fetchAllTickets("?ticketPriority=" + value);
        }
        else if (key === 'STATUS') {
            this.fetchAllTickets("?ticketStatus=" + value);
        }
        else if (key === 'ASSIGNTO') {

            this.fetchAllTickets("?assignTo=" + `${value.id}`);
        }
        else if (key === 'RAISEDBY') {

            this.fetchAllTickets("?raisedBy=" + `${value.id}`);
        } else if (value === null) {
            this.fetchAllTickets("");

        }
    }


    render() {
        return (
            <div>
                <div >
                    <header className="header-fixed">
                        <div className="header-limiter">

                            <h1><a href="#">HelpDesk<span>Admin</span></a></h1>

                            <nav>
                                {/* <a href="/admin-dash" >Home</a> */}


                                <a href="/category">Category</a>

                                <a href="/admin-dash"> View Users</a>

                                <a href="/">Logout</a>
                            </nav>

                        </div>

                    </header>
                </div>
                <main>
                    <div>
                        <div style={{ display: 'inline-block', marginLeft: 50 }}>
                            <h2>Employee Tickets</h2>
                            
                        </div>
                        <div style={{ display: 'inline-block', marginLeft: 500 }}>
                            Priority
                            <Select
                                labelId="demo-simple-select-standard-label"
                                id="demo-simple-select-standard"
                                value={this.state.priorityFilter}
                                onChange={(e) => {
                                    this.setState({ priorityFilter: e.target.value })
                                    this.handleFilterChange('PRIORITY', e.target.value)
                                    this.setState({ assignToFilter: "" })
                                    this.setState({ statusFilter: "" })
                                }}
                                label="Priority"
                            >
                                {this.state.priorityFilterList.map(p => (
                                    <MenuItem value={p}>{p}</MenuItem>
                                ))}
                            </Select>
                        </div>

                        <div style={{ display: 'inline-block', marginLeft: 15 }}>
                            Status
                            <Select
                                labelId="demo-simple-select-standard-label"
                                id="demo-simple-select-standard"
                                value={this.state.statusFilter}
                                onChange={(e) => {
                                    this.setState({ statusFilter: e.target.value })
                                    this.handleFilterChange('STATUS', e.target.value)
                                    this.setState({ assignToFilter: "" })
                                    this.setState({ priorityFilter: "" })
                                }}
                                label="Status"
                            >
                                {this.state.statusFilterList.map(p => (
                                    <MenuItem value={p}>{p}</MenuItem>
                                ))}
                            </Select>
                        </div>

                        <div style={{ display: 'inline-block', marginLeft: 15 }}>
                            AssignTo
                            <Select
                                labelId="demo-simple-select-standard-label"
                                id="demo-simple-select-standard"
                                value={this.state.assignToFilter}
                                onChange={(e) => {
                                    this.setState({ assignToFilter: e.target.value })
                                    this.handleFilterChange('ASSIGNTO', e.target.value)
                                    this.setState({ statusFilter: "" })
                                    this.setState({ priorityFilter: "" })
                                }}
                                label="AssignTo"
                            >
                                {this.state.adminList.map(admin => (
                                    <MenuItem key={admin.assignTo} value={admin}>{admin.firstName + " " + admin.lastName}</MenuItem>
                                ))}
                            </Select>
                        </div>

                        <div style={{ display: 'inline-block', marginLeft: 15 }}>
                            <Button variant="contained" onClick={() => this.handleFilterChange('RESET', null) }>Reset</Button>
                        </div>
                    </div>
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
                                    <TableCell style={{ fontWeight: 'bold' }} className="order-table-heading" align="center">Raised By</TableCell>
                                    {this.state.isAdmin && <TableCell className="order-table-heading" align="center"></TableCell>}
                                </TableRow>
                            </TableHead>
                            <TableBody>
                                {
                                    this.state.ticketList.map((t, idx) => (
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
                                            {this.state.isAdmin && <TableCell align="center"><Button variant="contained" onClick={() => this.setState({ openUpdateModal: true, idx: idx, status: t.status, priority: t.priority })}>Update</Button></TableCell>}
                                        </TableRow>
                                    ))
                                }

                            </TableBody>
                        </Table>
                    </TableContainer>
                    <Modal
                        open={this.state.openUpdateModal}
                        onClose={() => this.setState({ openUpdateModal: false })}
                        aria-labelledby="modal-modal-title"
                        aria-describedby="modal-modal-description"
                        status={this.state.status}
                        priority={this.state.priority}
                    >
                        <Box sx={style}>
                            {/* <Typography id="modal-modal-title" variant="h6" component="h2">
                                {this.state.idx}
                            </Typography> */}
                            <Typography id="modal-modal-description" sx={{ mt: 2 }}>
                                Update Ticket
                            </Typography>
                            <Typography id="modal-modal-description" sx={{ mt: 2 }}>
                                <spa>Status </spa>
                                <Select
                                    labelId="demo-simple-select-standard-label"
                                    id="demo-simple-select-standard"
                                    value={this.state.status}
                                    onChange={(e) => this.setState({ status: e.target.value })}
                                    label="Status"
                                >
                                    <MenuItem value={'OPEN'}>Open</MenuItem>
                                    <MenuItem value={'IN_PROGRESS'}>In Progress</MenuItem>
                                    <MenuItem value={'RESOLVED'}>Resolved</MenuItem>
                                </Select>
                            </Typography>
                            <Typography id="modal-modal-description" sx={{ mt: 2 }}>
                                <spa>Priority </spa>
                                <Select
                                    labelId="demo-simple-select-standard-label"
                                    id="demo-simple-select-standard"
                                    value={this.state.priority}
                                    onChange={(e) => this.setState({ priority: e.target.value })}
                                    label="Status"
                                >
                                    <MenuItem value={'LOW'}>Low</MenuItem>
                                    <MenuItem value={'MODERATE'}>Moderate</MenuItem>
                                    <MenuItem value={'HIGH'}>High</MenuItem>
                                    <MenuItem value={'VERY_HIGH'}>Very High</MenuItem>
                                </Select>
                            </Typography>
                            <Typography id="modal-modal-description" sx={{ mt: 2 }}>
                                <spa>Assign To </spa>
                                <Select
                                    labelId="demo-simple-select-standard-label"
                                    id="demo-simple-select-standard"
                                    value={this.state.assignTo}
                                    onChange={(e) => this.setState({ assignTo: e.target.value })}
                                    label="Assign To"
                                >
                                    {
                                        this.state.adminList.map(admin => (
                                            <MenuItem key={admin.id} value={admin}>{admin.firstName + " " + admin.lastName}</MenuItem>
                                        ))
                                    }
                                </Select>
                            </Typography>
                            <Typography id="modal-modal-description" sx={{ mt: 2 }}>
                                <Button variant="contained" onClick={this.handleUpdate}>Update</Button>
                            </Typography>
                        </Box>
                    </Modal>
                </main>
            </div>
        );
    }
}

export default EmployeeViewTicket;