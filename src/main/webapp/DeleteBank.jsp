<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Bank</title>
</head>
<body>
<form action="AdminOperation" method="post">
<table>
<tr><td>Bank Names:</td></tr>
<c:forEach items="${Banks}" var="bank">
<tr><td>${bank}</td><td><input type="radio" name="bank" value="${bank}"></td></tr>
<tr><td><input type="hidden" name="bank" value="${bank}"></td></tr>
</c:forEach>
<tr><td><input type="submit" value="submit" name="deleteBank"></td>
</tr>
</table>
</form>
</body>
</html>