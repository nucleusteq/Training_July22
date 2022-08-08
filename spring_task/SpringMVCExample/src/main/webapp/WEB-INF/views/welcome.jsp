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
	<h1>Hello Java application</h1>
	<a href= "${pageContext.request.contextPath}/login">Login Form</a>
	
	<a href= "${pageContext.request.contextPath}/signup">Register Form</a>
</body>
</html>