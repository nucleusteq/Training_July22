import React, { Component } from 'react'
import AdminDash from "./pages/AdminDash";
import Login from "./pages/Login";
import Register from "./pages/Register";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import EmployeeDash from "./pages/EmployeeDash";
import Ticket from "./pages/Ticket";
import EmployeeViewTicket from './pages/EmployeeViewTicket';
import Category from './pages/Category';
import AddCategory from './pages/AddCategory';
import { useNavigate } from 'react-router-dom';
const App = (props) => {
  return (

    <BrowserRouter>
      <Routes>
          <Route path="/" element={<Login />} />
          <Route path="/register" element={<Register />} />
          <Route path="/admin-dash" element={<AdminDash />} />
          <Route path="/employee-dash" element={<EmployeeDash />} />
          <Route path="/employee-raise-ticket" element={<Ticket navigate/>} />
          <Route path="/employee-view-ticket" element={<EmployeeViewTicket/>} />
          <Route path="/category" element={<Category/>} />
          <Route path="/add-category" element={<AddCategory/>} />
          
      </Routes>
    </BrowserRouter>

    
  )
}

// class App extends Component {
//   state = {}
//   render() {
//     return (
//       <CustomNavbar />
//     );
//   }
// }

export default App;