<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
span{color:red}
</style>
</head>
<body>
	<form:form method="post" action="login" modelAttribute="loginForm">
		<label for="username">Username</label>
		<form:input path="username" />
		<form:errors path="username"/>
		<br />
		<label for="password">Password</label>
		<form:input path="password" />
		<span><form:errors path="password"/></span>
		<br />
		<input type="submit" value="OK" />
	</form:form>
</body>
</html>