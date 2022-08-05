<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%-- <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%> --%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div>

<h1>Please Sigup :</h1>

<form:form action="processSignup" modelAttribute="signUpModel">
First Name:<form:input path="firstName"/>
Last Name:<form:input path="lastName"/>
 <form:select path="city">
<form:options items="${cities}"></form:options>

</form:select>
<input type="submit" value="SignUp">
</form:form>

</div>