import React, { Component, useEffect } from 'react'
import { Link } from 'react-router-dom';
import '../assets/css/header.css';
import { TableContainer, Table, Paper, TableHead, TableCell, TableRow, TableBody } from '@mui/material';
import { getAllUsers } from '../util/HttpService';
import { Navigate } from 'react-router-dom';

class AdminDash extends Component {



	
	state = {
		userList: [],
		redirect: false
	}

	componentDidMount() {

		const userinfo = JSON.parse(localStorage.getItem("userData"));
		if (userinfo == null) {
			this.setState({ redirect: true })
		}
		if (!userinfo.role == "ADMIN") {
			this.setState({ redirect: true })
		}
		getAllUsers().then((response) => {
			this.setState({ userList: response.data })
		})
	}

	render() {
		return (
			<div >
				<header className="header-fixed">
					<div className="header-limiter">

						<h1><a href="#">HelpDesk<span>Admin</span></a></h1>

						<nav>
							<a href="/employee-view-ticket" >Home</a>
							{/* <a href="#" class="selected">Create user</a> */}
							<a href="/register"> Register user</a>
							{/* <a href="/category">Category</a>
							<a href="/employee-view-ticket">Ticket</a> */}
							{/* <a href="/">Logout</a> */}
						</nav>

					</div>

				</header>
				<main>
					<TableContainer component={Paper}>
						<Table aria-label="collapsible table">
							<TableHead>
								<TableRow>
									<TableCell className="order-table-heading" align="center" >Id</TableCell>
									<TableCell className="order-table-heading" align="center">First Name</TableCell>
									<TableCell className="order-table-heading" align="center">Last Name</TableCell>
									<TableCell className="order-table-heading" align="center">Email</TableCell>
									<TableCell className="order-table-heading" align="center">Contact</TableCell>
									{/* <TableCell className="order-table-heading" align="center">Gender</TableCell>
									<TableCell className="order-table-heading" align="center">DOB</TableCell> */}
									<TableCell className="order-table-heading" align="center">Role</TableCell>
								</TableRow>
							</TableHead>
							<TableBody>
								{
									this.state.userList.map((u) => (
										<TableRow key={u.id} sx={{ '& > *': { borderBottom: 'unset' } }}>
											<TableCell align="center">{u.id}</TableCell>
											<TableCell align="center">{u.firstName}</TableCell>
											<TableCell align="center">{u.lastName}</TableCell>
											<TableCell align="center">{u.email}</TableCell>
											<TableCell align="center">{u.contact}</TableCell>
											{/* <TableCell align="center">{u.gender}</TableCell>
											<TableCell align="center">{u.dob}</TableCell> */}
											<TableCell align="center">{u.role}</TableCell>

										</TableRow>
									))
								}

							</TableBody>
						</Table>
					</TableContainer>
				</main>
				{
					this.state.redirect && <Navigate to='/' replace={true} />
				}
			</div>
		);
	}
}

export default AdminDash;