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
	<div  style="width=100%;text-align: center;font-size: 25px;padding: 20px;">Welcome to SignUp Form</div>
	<form:form action="signupForm" modelAttribute="signupModel">
		First Name:<form:input path="firstName"/>
		<br>
		Last Name:<form:input path="lastName"/>
		<br>		
		<input type="submit" value="SignUp"/>
	</form:form>
</body>
</html>