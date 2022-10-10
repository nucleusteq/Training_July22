// import React from 'react'
// import { Form, Button } from 'react-bootstrap'
// import './registration.css'
// import {encode as base64_encode} from 'base-64';
// import React, { useState, useEffect } from "react";
// import axios from "axios";

// function Registration() {
//     const PostValue = {
//         firstName: "",
//         lastName: "",
//         employeeId: "",
//         email: "",
//         password: "",
//         rePassword: "",
//         dateOfBirth: "",
//         contact: "",
//         desiganation: "",
//         dateOfJoining: "",
//         dateOfExit: "",
//         location: "",
//         role: "ADMIN",
//       };
//       const initialValues = {
//         firstName: "",
//         lastName: "",
//         employeeId: "",
//         email: "",
//         password: "",
//         rePassword: "",
//         dateOfBirth: "",
//         contact: "",
//         desiganation: "",
//         dateOfJoining: "",
//         dateOfExit: "",
//         location: "",
//         role: "ADMIN",
//       };
//       const [formValues, setFormValues] = useState(PostValue);
//       const [formErrors, setFormErrors] = useState({});
//       const [isLogin, setLogin] = useState(false);
//       const [alertVisible, setAlertVisible] = useState(false);
//       const [getUserData, setUserdata] = useState({});
//       const [errorss, seterrorss] = useState({});
//       const handleChange = (e) => {
//         const { name, value } = e.target;
//         setFormValues({ ...formValues, [name]: value });
//       };
//       const handleSubmit = () => {
//         console.log(isValidate(formValues));
//         if (isValidate(formValues)) {
//           formValues.password = Base64.encode(formValues.password);
//           console.log(formValues.password);
//           axios
//             .post("http://localhost:8080/user/user-registeration", formValues)
//             .then((res) => {
//               if (res?.status === 200) {
//                 console.log(res.data);
//                 setLogin(true);
//                 localStorage.setItem("userData", JSON.stringify(res.data));
//                 setUserdata(res.data);
//               } else {
//                 console.log(res.data);
//                 console.error(res.message);
//               }
//             })
//             .catch((error) => {
//               formValues.email = "";
//               formValues.password = "";
//               formValues.rePassword = "";
//               if (error.response.status === 400) {
//                 console.log(error.response.data);
//                 setAlertVisible(true);
//                 if (!error.response.data.message) {
//                   seterrorss("All fileds or requied!");
//                 } else {
//                   seterrorss(error.response.data.message);
//                 }
//               } else {
//                 setAlertVisible(true);
//                 console.log(error.response.data);
//                 seterrorss("Internet Error!!");
//               }
//             });
//         }
//       };
//       function isOver18(dateOfBirth) {
//         const date18YrsAgo = new Date();
//         date18YrsAgo.setFullYear(date18YrsAgo.getFullYear() - 16);
//         return dateOfBirth <= date18YrsAgo;
//       }
//       const isValidate = (values) => {
//         var isStatus = true;
//         console.log(initialValues.desiganation);
//         const regex = /^[A-Za-z0-9._%+-]+@nucleusteq.com$/i;
//         const uppercaseRegExp = /(?=.*?[A-Z])/;
//         const lowercaseRegExp = /(?=.*?[a-z])/;
//         const digitsRegExp = /(?=.*?[0-9])/;
//         const specialCharRegExp = /(?=.*?[#?!@$%^&*-])/;
//         const minLengthRegExp = /.{8,}/;
//         const minNameLengthRegExp = /.{2,}/;
//         const contactRegExp = /[0-9]{10}/;
//         const regexddmmyyyy = /^\d{4}\-(0[1-9]|1[012])\-(0[1-9]|[12][0-9]|3[01])$/;
//         if (!values.firstName) {
//           initialValues.firstName = "First Name is required!";
//           isStatus = false;
//         } else if (!minNameLengthRegExp.test(values.firstName)) {
//           initialValues.firstName = "This is not a valid Name format!";
//           isStatus = false;
//         } else {
//           initialValues.firstName = "";
//         }
//         if (!values.lastName) {
//           initialValues.lastName = "Last Name is required!";
//           isStatus = false;
//         } else if (!minNameLengthRegExp.test(values.lastName)) {
//           initialValues.lastName = "This is not a valid Name format!";
//           isStatus = false;
//         } else {
//           initialValues.lastName = "";
//         }
//         if (!values.employeeId) {
//           initialValues.employeeId = "Employee Id is required!";
//           isStatus = false;
//         } else {
//           initialValues.employeeId = "";
//         }
//         if (!values.email) {
//           initialValues.email = "Email is required!";
//           isStatus = false;
//         } else if (!regex.test(values.email)) {
//           initialValues.email = "Not valid email!";
//           isStatus = false;
//         } else {
//           initialValues.email = "";
//         }
//         if (!values.password) {
//           initialValues.password = "Password is required";
//           isStatus = false;
//         } else if (!uppercaseRegExp.test(values.password)) {
//           initialValues.password = "At least one Uppercase";
//           isStatus = false;
//         } else if (!lowercaseRegExp.test(values.password)) {
//           initialValues.password = "At least one Lowercase";
//           isStatus = false;
//         } else if (!digitsRegExp.test(values.password)) {
//           initialValues.password = "At least one digit";
//           isStatus = false;
//         } else if (!specialCharRegExp.test(values.password)) {
//           initialValues.password = "At least one Special Characters";
//           isStatus = false;
//         } else if (!minLengthRegExp.test(values.password)) {
//           initialValues.password = "At least minumum 8 characters";
//           isStatus = false;
//         } else if (!minLengthRegExp.test(values.password)) {
//           initialValues.password = "At least minumum 8 characters";
//           isStatus = false;
//         } else {
//           initialValues.password = "";
//         }
//         if (!values.rePassword) {
//           initialValues.rePassword = "Enter Confirm Password";
//           isStatus = false;
//         } else if (values.rePassword !== values.password) {
//           initialValues.rePassword = "Passowrd is Not Match";
//           isStatus = false;
//         } else {
//           initialValues.rePassword = "";
//         }
//         if (!regexddmmyyyy.test(values.dateOfBirth)) {
//           initialValues.dateOfBirth = "Date of birth is required!";
//           isStatus = false;
//         } /*else if (!isOver18(new Date(initialValues.dateOfBirth))) {
//           console.log(initialValues.dateOfBirth);
//           initialValues.dateOfBirth = "Date of birth is required!";
//           isStatus = false;
//         } */ else {
//           initialValues.dateOfBirth = "";
//         }
//         if (!values.desiganation) {
//           initialValues.desiganation = "Designation required!";
//           isStatus = false;
//         } else {
//           initialValues.desiganation = "";
//         }
//         if (!regexddmmyyyy.test(values.dateOfJoining)) {
//           initialValues.dateOfJoining = "Date of joining is required!";
//           isStatus = false;
//         } else {
//           initialValues.dateOfJoining = "";
//         }
//         if (!contactRegExp.test(values.contact)) {
//           initialValues.contact = "Contact is required!.";
//           isStatus = false;
//         } else {
//           initialValues.contact = "";
//         }
//         if (!values.location) {
//           initialValues.location = "Location is required!.";
//           isStatus = false;
//         } else {
//           initialValues.location = "";
//         }
//         setFormErrors(initialValues);
//         return isStatus;
//       };


//   return (
//     <div className="registration-container">
//                 <div>
//                     <img src='https://beagleanalytics.ai/wp-content/uploads/2020/01/helpdesk-banner_img1.jpg' className="registration-image" />
//                 </div>
//                 <div className="registration-form">
//                     <Form>
//                         <Form.Group className="mb-3" controlId="formBasicFirstName">
//                             <Form.Label>First Name</Form.Label>
//                             <Form.Control type="text" placeholder="Enter First Name" onChange={(e) => this.setState({ firstName: e.target.value })} />
//                         </Form.Group>

//                         <Form.Group className="mb-3" controlId="formBasicLastName">
//                             <Form.Label>Last Name</Form.Label>
//                             <Form.Control type="text" placeholder="Enter Last Name" onChange={(e) => this.setState({ lastName: e.target.value })} />
//                         </Form.Group>

//                         <Form.Group className="mb-3" controlId="formBasicEmail">
//                             <Form.Label>Email address</Form.Label>
//                             <Form.Control type="email" placeholder="Enter email" onChange={(e) => this.setState({ email: e.target.value })} />
//                         </Form.Group>

//                         <Form.Group className="mb-3" controlId="formBasicContact">
//                             <Form.Label>Contact</Form.Label>
//                             <Form.Control type="text" placeholder="Enter Last Name" onChange={(e) => this.setState({ contact: e.target.value })} />
//                         </Form.Group>

//                         <Form.Group className="mb-3" controlId="formBasicGender">
//                             <Form.Label>gender</Form.Label>
//                             <Form.Control type="text" placeholder="Enter gender" onChange={(e) => this.setState({ gender: e.target.value })} />
//                         </Form.Group>

//                         <Form.Group className="mb-3" controlId="formBasicRole">
//                             <Form.Label>role</Form.Label>
//                             <Form.Control type="text" placeholder="Enter role" onChange={(e) => this.setState({ role: e.target.value })} />
//                         </Form.Group>

//                         <Form.Group className="mb-3" controlId="formBasicPassword">
//                             <Form.Label>Password</Form.Label>
//                             <Form.Control type="password" placeholder="Password" onChange={(e) => this.setState({ password: e.target.value })} />
//                         </Form.Group>
//                         <Button variant="primary" type="button" onClick={this.onSubmit}>
//                             Register
//                         </Button>
//                     </Form>
//                 </div>
//             </div>
//   )
// }

// export default Registration