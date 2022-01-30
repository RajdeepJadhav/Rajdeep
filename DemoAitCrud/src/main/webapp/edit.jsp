<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Edit Details</h1>
<form action="save">
Id: <input type="text" name="id" value="${sb.getId()}" readonly><br>
Name:<input type="text" name="name" value="${sb.getName()}" ><br>
Percent:<input type="text" name="percent"value="${sb.getPercentage()}"><br>
city:<input type="text" name="city" value="${sb.getCity()}"><br>
<input type="submit" value="save">
</form>
</body>
</html>