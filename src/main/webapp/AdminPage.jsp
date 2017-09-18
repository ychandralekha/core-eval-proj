<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Page</title>
</head>
<body>
<h2>ADMIN PAGE</h2>
<form action="AdminServlet" method="post">
<table>
<tr><td><input type="radio" name="adminOption" value="add">Add a Bank</td></tr>
<tr><td><input type="radio" name="adminOption" value="modify">Modify a Bank</td></tr>
<tr><td><input type="radio" name="adminOption" value="delete">Delete a Bank</td></tr>
<tr><td><input type="radio" name="adminOption" value="display">Display Banks</td></tr>
<tr><td><input type="submit" value="submit"></td></tr>
<tr><td><a href="CustomerDetails">Customer Page</a></td></tr>
</table>
</form>
</body>
</html>