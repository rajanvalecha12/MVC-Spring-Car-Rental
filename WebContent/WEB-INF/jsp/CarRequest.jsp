<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Car Request</title>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
</head>
<body>
	<h1>Request for cabs</h1>

	<form:form method="post" action="AddRequest">
	<form:errors cssStyle="color:red" path="*"/>
		<label>Name</label>
		<form:input path="name" />
		<label>Mobile Number</label>
		<form:input path="mobileNumber" />
		<label>Email</label>
		<form:input path="email" />
		<label>Type</label>
		<form:select path="type" items="${carTypes}"/>
		<input type="submit" value="ADD">
	</form:form>
</body>
</html>