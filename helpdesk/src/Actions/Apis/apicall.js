import axios from "axios";
import { BASE_URL } from "../ApiEndPoints";
export const postRequest = (api, payload, callback) => {
  axios
    .post(BASE_URL + api, payload)
    .then((res) => {
      if (res?.status === 200) {
        // console.log(res.data);
        // localStorage.setItem("userData", JSON.stringify(res.data));
        // setLogin(true);
        // setUserdata(res.data);
        callback(res);
        console.log("api",api)
      }
    })
    .catch((error) => {
      callback(error.response);
      console.log(error.response);
      //   setAlertVisible(true);
      //   seterrorss("Internet Error!!");
      //   if (error.response.status === 400) {
      //     seterrorss(error.response.data.message);
      //     setAlertVisible(true);
      //     formValues.email = "";
      //     formValues.password = "";
      //     // errors.password = error.response.data.message;
      //   }
    });
};
export const getRequest = () => {};