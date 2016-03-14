<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>
<h1>Request Added</h1>
<span style="text-align: right;">
<c:out value="${command.name }"></c:out>
</span>

<form action="cust/check">
<label>please enter your name again</label>
<input type="text" name="name">
<input type="submit" value="search">
</form>
  
  	${previousBooking }
  	
</body>
</html>