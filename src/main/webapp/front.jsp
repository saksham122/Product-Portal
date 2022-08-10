<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Product Details</h1>
<table border="1"><tr><th>Id</th><th>Name</th><th>Quantity</th><th>Price</th>
<tr><td>
<%=session.getAttribute("Id") %>
</td>
<td>
<%=session.getAttribute("Name") %>
</td>
<td>
<%=session.getAttribute("Quantity") %>
</td>
<td>
<%=session.getAttribute("Price") %>
</td></tr>

</table>

</body>
</html>