<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main-menu-page</title>
</head>

<body>

<a href="${pageContext.request.contextPath}/student/showForm">student form</a><br/>
<a href="${ pageContext.request.contextPath}/customer/showForm">Customer form</a><br/>
<a href="${ pageContext.request.contextPath}/employee/showForm">Employee form</a><br/>
<a href="${ pageContext.request.contextPath}/employee/list">List Employee</a>
</body>
</html>