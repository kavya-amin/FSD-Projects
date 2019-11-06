<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>customer form</title>
<style>
	.error{color:red}
</style>
</head>
<body>
<form:form action="processForm" modelAttribute="customer">

First Name:<form:input path="firstName"/>
<form:errors path="firstName" cssClass="error"/><br/>
Last Name:<form:input path="lastName"/>
<form:errors path="lastName" cssClass="error"/><br/>
Free Passes:<form:input path="freePass"/>
<form:errors path="freePass" cssClass="error"/><br/>
Postal Code:<form:input path="postalCode"/>
<form:errors path="postalCode" cssClass="error"/><br/>
Email:<form:input path="email"/>
<form:errors path="email" cssClass="error"/><br/>
<input type="submit">
</form:form>
</body>
</html>