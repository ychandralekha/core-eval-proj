<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Page</title>
</head>
<body>
<h2>Customer Register</h2>
<form action="CustomerDetails" method="post">
<table>

<tr><td>Account Type:</td>
<td>
<select name="accountType">
<option value="Savings">Savings
</option>
<option value="Fixed">Fixed
</option>
</select>
</td></tr>
<tr><td><input type="submit" value="submit" name="CustomerRegister"></td></tr>
</table>
</form>
</body>
</html>