<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div>Hey User ! ${message}</div>


<a href="${pageContext.request.contextPath}/login" style="color: black;background-color: green">Login</a><br>
<a href="${pageContext.request.contextPath}/signup" style="color: black;background-color: blue">SignUp</a>