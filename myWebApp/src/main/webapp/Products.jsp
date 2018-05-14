<%@page import="com.dinesh.web.model.Product"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Products</title>
<h1>Products</h1>

	<%
		Product p1 =(Product) request.getAttribute("product"); //from Controller request
		out.println(p1);
	%>

</head>
<body>

</body>
</html>