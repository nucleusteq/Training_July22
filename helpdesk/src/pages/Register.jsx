import React, { useState } from 'react'
import '../assets/css/login.css'
import axios from "axios"
import { Link } from "react-router-dom";

import { useNavigate } from 'react-router-dom';


import sideImg from '../assets/img/loginimg.svg';
import { postRequest } from '../Actions/Apis/apicall';
import { REGISTER_API } from '../Actions/ApiEndPoints';
import { ToastContainer, toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';




function Register() {

  const flag = false;
  const PostValue = {
    firstName: "",
    lastName: "",
    contact: "",
    email: "",
    password: "",
    gender: "",
    dob: "",
    confirmpassword: ""

  };
  const navigate = useNavigate();
  const initialValues = {
    firstName: "",
    lastName: "",
    contact: "",
    email: "",
    password: "",
    gender: "",
    dob: "",
    confirmpassword: ""

  };
  const [formValues, setFormValues] = useState(PostValue);
  const [formErrors, setFormErrors] = useState({});
  const [isLogin, setLogin] = useState(false);
  
  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormValues({ ...formValues, [name]: value });
  };

  const handleSubmit = () => {
    console.log(isValidate(formValues));
    if (isValidate(formValues)) {
      formValues.password = formValues.password;
      postRequest(REGISTER_API, formValues, function (response) {
        console.log("api res>>>", response);
        if (response?.status === 200) {
          console.log(response.data);
          navigate("/admin-dash")

          setLogin(true);
          localStorage.setItem("userData", JSON.stringify(response.data));
        
        } else {
          if (response.status === 400) {

            console.log(response.data);
            toast.error("all fields are reuired to procced further", {
              draggable: true,
              position: toast.POSITION.TOP_CENTER,
            });

          } else {

          }
        }
      });
    }
    //     if (isValidate(formValues)) {
    //       formValues.password = Base64.encode(formValues.password);
    //       console.log(formValues.password);
    //       axios
    //         .post("http://localhost:8080/user/user-registeration", formValues)
    //         .then((res) => {
    //           if (res?.status === 200) {
    //             console.log(res.data);
    //             setLogin(true);
    //             localStorage.setItem("userData", JSON.stringify(res.data));
    //             setUserdata(res.data);
    //           } else {
    //             console.log(res.data);
    //             console.error(res.message);
    //           }
    //         })
    //         .catch((error) => {
    //           formValues.email = "";
    //           formValues.password = "";
    //           formValues.rePassword = "";
    //           if (error.response.status === 400) {
    //             console.log(error.response.data);
    //             setAlertVisible(true);
    //             if (!error.response.data.message) {
    //               seterrorss("All fileds or requied!");
    //             } else {
    //               seterrorss(error.response.data.message);
    //             }
    //           } else {
    //             setAlertVisible(true);
    //             console.log(error.response.data);
    //             seterrorss("Internet Error!!");
    //           }
    //         });
    //     }
    // };

  };
  const isValidate = (values) => {
    var isStatus = true;

    console.log(initialValues.desiganation);
    const regex = /^[A-Za-z0-9._%+-]+@nucleusteq.com$/i;

    const uppercaseRegExp = /(?=.*?[A-Z])/;
    const lowercaseRegExp = /(?=.*?[a-z])/;
    const digitsRegExp = /(?=.*?[0-9])/;
    const specialCharRegExp = /(?=.*?[#?!@$%^&*-])/;
    const minLengthRegExp = /.{8,}/;
    const minNameLengthRegExp = /.{2,}/;
    const contactRegExp = /[0-9]{10}/;
    const regexddmmyyyy = /^\d{4}\-(0[1-9]|1[012])\-(0[1-9]|[12][0-9]|3[01])$/;

    if (!values.firstName) {
      initialValues.firstName = "First Name is required!";
      isStatus = false;
    } else if (!minNameLengthRegExp.test(values.firstName)) {
      initialValues.firstName = "This is not a valid Name format!";
      isStatus = false;
    } else {
      initialValues.firstName = "";
    }

    if (!values.lastName) {
      initialValues.lastName = "Last Name is required!";
      isStatus = false;
    } else if (!minNameLengthRegExp.test(values.lastName)) {
      initialValues.lastName = "This is not a valid Name format!";
      isStatus = false;
    } else {
      initialValues.lastName = "";
    }


    if (!values.email) {
      initialValues.email = "Email is required!";
      isStatus = false;
    } else if (!regex.test(values.email)) {
      initialValues.email = "@nucleusteq is required!";
      isStatus = false;
    } else {
      initialValues.email = "";
    }

    if (!values.password) {
      initialValues.password = "Password is required";
      isStatus = false;
    } else if (!uppercaseRegExp.test(values.password)) {
      initialValues.password = "At least one Uppercase";
      isStatus = false;
    } else if (!lowercaseRegExp.test(values.password)) {
      initialValues.password = "At least one Lowercase";
      isStatus = false;
    } else if (!digitsRegExp.test(values.password)) {
      initialValues.password = "At least one digit";
      isStatus = false;
    } else if (!specialCharRegExp.test(values.password)) {
      initialValues.password = "At least one Special Characters";
      isStatus = false;
    } else if (!minLengthRegExp.test(values.password)) {
      initialValues.password = "At least minumum 8 characters";
      isStatus = false;
    } else if (!minLengthRegExp.test(values.password)) {
      initialValues.password = "At least minumum 8 characters";
      isStatus = false;
    } else if (!values.confirmpassword) {
      initialValues.confirmpassword = "Password required";
    } else if (values.password !== values.confirmpassword) {
      initialValues.confirmpassword = "Passwords do not match";
    }
    else {
      initialValues.password = "";
    }

    if (!values.gender) {
      initialValues.gender = "gender required!";
      isStatus = false;
    } else {
      initialValues.gender = "";
    }

    if (!values.role) {
      initialValues.role = "Designation required!";
      isStatus = false;
    } else {
      initialValues.role = "";
    }

    if (!contactRegExp.test(values.contact)) {
      initialValues.contact = "Contact is required!.";
      isStatus = false;
    } else {
      initialValues.contact = "";
    }


    setFormErrors(initialValues);
    return isStatus;
  };


  return (
    <div>

      <div className="split left">

        <img src={sideImg} alt="Avatar woman" className='centeredimg'></img>

      </div>

      <div className="split right">
        <div className="centered">
          <div className='logincontainer'>

            <div className="form-input">
              <label for="firstname" className="label">FirstName</label>
              <input id="firstName"
                type="text"
                className="input"
                name="firstName"
                value={formValues.firstName}
                onChange={handleChange}></input>
            </div>
            <span className="validationerrormsg"> {formErrors.firstName}</span>


            <div className="form-input">
              <label for="lastname" className="label">LastName</label>
              <input id="lastName"
                type="text"
                className="input"
                name="lastName"
                value={formValues.lastName}
                onChange={handleChange}></input>
            </div>
            <span className="validationerrormsg"> {formErrors.lastName}</span>


            <div className="form-input">
              <label for="email" className="label">Email</label>
              <input id="email"
                type="text"
                className="input"
                name="email"
                value={formValues.email}
                onChange={handleChange}></input>
            </div>
            <span className="validationerrormsg"> {formErrors.email}</span>


            <div className="form-input">
              <label for="contact" className="label">Contact</label>
              <input id="contact"
                type="text"
                className="input"
                name="contact"
                value={formValues.contact}
                maxLength={10}
                minLength={10}
                onChange={handleChange}></input>
            </div>
            <span className="validationerrormsg"> {formErrors.contact}</span>


            <div className="form-input">
              <label for="gender" className="label">Gender</label>
              <input id="gender"
                type="text"
                className="input"
                name="gender"
                value={formValues.gender}
                onChange={handleChange}></input>
            </div>
            <span className="validationerrormsg"> {formErrors.gender}</span>

            <div className="form-input">
              <label for="role" className="label">Role</label>
              <input id="role"
                type="text"
                className="input"
                name="role"
                value={formValues.role}
                onChange={handleChange}></input>
            </div>
            <span className="validationerrormsg"> {formErrors.role}</span>

            <div className="form-input">
              <label for="dob" className="label">DOJ</label>
              <input id="dob"
                type="date"
                className="input"
                name="dob"
                value={formValues.dob}
                onChange={handleChange}></input>
            </div>

            <div className="form-input">
              <label for="password" className="label">Password</label>
              <input id="password"
                type="password"
                className="input"
                name="password"
                value={formValues.password}
                onChange={handleChange}></input>
            </div>
            <span className="validationerrormsg"> {formErrors.password}</span>

            <div className="form-input">
              <label for="confirmpassword" className="label">ConfirmPassword</label>
              <input id="confirmpassword"
                type="password"
                className="input"
                name="confirmpassword"
                value={formValues.confirmpassword}
                onChange={handleChange}></input>
            </div>
            <span className="validationerrormsg"> {formErrors.confirmpassword}</span>

            <div>
              <button type="button" className='buttonlogin' onClick={handleSubmit}>Sign up</button>
              <button type="button" className='buttonlogin' onClick={()=> navigate("/admin-dash")}  >Back</button>

            </div>
          </div>
        </div>

      </div>f

    </div>
  )

}
export default Register;