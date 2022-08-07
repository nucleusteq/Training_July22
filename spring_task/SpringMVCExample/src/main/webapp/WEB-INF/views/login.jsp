<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Hello JAVA </title>
</head>
<body>
	<h1>Login Form</h1>
	<form:form action="loginForm" modelAttribute="login">
	
	Username :  <form:input path="username"/>
	Password : <form:input path="password"/>
	<br>
	
	<input type="submit" value="Login" />
	</form:form>
</body>
</html>