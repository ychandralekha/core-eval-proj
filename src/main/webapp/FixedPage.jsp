<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fixed Page</title>
</head>
<body>
<form action="CustomerServlet">
<table>
<tr>
<td>Customer Name:</td>
<td>
<input type="text" name="customerName" >
</td></tr>
<tr><td>Account Number:</td>
<td>
<input type="text" name="AccountNumber" >
</td></tr>
<tr><td>Fixed Begin Date:</td><td>
<input type="text" name="fixedBeginDate">
</td></tr>
<tr><td>Balance Amount</td><td>
<input type="text" name="fixedDepositAmount">
</td></tr>
<tr><td>Fixed Tenure</td><td>
<input type="text" name="fixedTenure">
</td></tr>
<tr>
<td>
<input type="submit" value="submit">
</td>
</tr>
</table>
</form>
</body>
</html>