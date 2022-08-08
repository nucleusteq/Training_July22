<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div style="width=100%;text-align: center;font-size: 25px;background-color: #b3ffff;padding: 10px;">Welcome to Spring Application</div>
<div style="width=100%;font-size: 18px;padding: 10px;text-align: center;cursor: pointer;text-decoratio;">
<a href="${pageContext.request.contextPath}/login" style="text-decoration: none;color: black;">Login</a> |
<a href="${pageContext.request.contextPath}/signup" style="text-decoration: none;color: black;">SignUp</a>
</div>