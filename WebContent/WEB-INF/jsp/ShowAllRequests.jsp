<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>
<h1>Show All Requests</h1>
<table>
<c:forEach items="${reqList }" var="req">
<tr>
<td>
<spring:url value="/findRequest/${req.name }" var="url" htmlEscape="true"/>
<a href="${url }">${req.name }</a>
</td>
<td>
<c:out value="${req.mobileNumber }"></c:out>
</td>
</tr>
</c:forEach>
</table>
</body>
</html>