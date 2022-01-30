<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List,com.Model.Student"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2">
<tr>
<th>Id</th>
<th>Name</th>
<th>Percent</th>
<th>City</th>
<td>
</tr>
<c:forEach var="s1" items="${studlist}">
<tr>
<td>${s1.getId()}</td>
<td>${s1.getName()}</td>
<td>${s1.getPercentage()}</td>
<td>${s1.getCity()}</td>
<td><a href="edit?id=${s1.getId()}">Edit</a>
<a href="delete?id=${s1.getId()}">Delete</a></td>
</c:forEach>
</table>
</body>
</html>