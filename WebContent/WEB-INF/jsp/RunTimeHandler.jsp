<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>


<li style="font-size:1.5em , color:blue">cause:</li>${msg }
<br>
exception url: ${url }
<c:forEach items="${exception.stackTrace }" var="item">
<li style="color:red"><c:out value="${item }"></c:out></li>
</c:forEach>
</body>
</html>