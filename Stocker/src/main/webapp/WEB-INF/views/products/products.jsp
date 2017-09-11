<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value="/resources/style.css" />" rel="stylesheet">
<title>list of product</title>
</head>
<body>
<h3 id="test">list of product</h3>
<table>
			<c:forEach var="product" items="${lists}">
			<tr>
				<td>${product.name}</td>
				<td><a href="products/edit/${product.id}">edit</a></td>
				<td><a href="products/delete/${product.id}">delete</a></td>
			</tr>
				
			</c:forEach>
</table>
</body>
</html>