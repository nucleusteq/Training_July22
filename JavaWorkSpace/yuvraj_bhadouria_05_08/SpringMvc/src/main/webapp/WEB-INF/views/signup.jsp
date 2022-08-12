<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%-- <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%> --%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignIn Form</title>
</head>
<body>
	<div>SignUp Form</div>
	<form:form action="postsignup" modelAttribute="signUpModel">
		User name:<form:input path="userName"/>
		<br><br>
		Password:<form:input path="UserPassword"/>
		<br><br>
		
		<input type="submit" value="signUp"/>
	</form:form>
</body>
</html>