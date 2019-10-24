<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="p" class="com.mycompany.model.President" scope="session"/>
<jsp:setProperty property="*" name="p"/>
President Name:<%=p.getPresidentName() %>
President Age:<%=p.getPresidentAge() %>
President Joining Year:<%=p.getJoiningYear() %>
President Release Year:<%=p.getReleaseYear() %>
<jsp:include page="controller.do"/>
</body>
</html>