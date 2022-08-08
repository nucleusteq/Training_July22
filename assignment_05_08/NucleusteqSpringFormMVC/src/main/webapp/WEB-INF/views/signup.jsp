<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%-- <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%> --%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Form Binding</title>
</head>
<body>
	<div  style="width=100%;text-align: center;font-size: 25px;background-color: #b3ffff;padding: 10px;">SignUp Form</div>
	<form:form action="signupForm" modelAttribute="signUpModel">
		First Name:<form:input path="firstName"/>
		<br><br>
		Last Name:<form:input path="lastName"/>
		<br><br>
		<form:select path="city">
			<form:options items="${cities}"/>
		</form:select>
		
		<input type="submit" value="SignUp"/>
	</form:form>
</body>
</html>