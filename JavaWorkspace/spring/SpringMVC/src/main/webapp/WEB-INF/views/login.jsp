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
	<div  style="width=100%;text-align: center;font-size: 25px;padding: 10px;">Welcome to Login Form</div>
	<form:form action="loginForm" modelAttribute="LoginModel">
		Username:<form:input path="userName"/>
		<br>
		Password:<form:input path="userPassword"/>
		<br>
		<input type="submit" value="Login"/>
	</form:form>
</body>
</html>