<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
,l<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Contacts</title>
</head>
<body>
	<h3>View Contacts here</h3>
	<table>
		<tbody>
			<c:forEach items="{$contacts}" var="c" varStatus="index">
			</c:forEach>
			<tr>
				<td>${index.count}</td>
				<td>${c.contactName}</td>
				<td>${c.contactEmail}</td>
				<td>${c.contactNumber}</td>
				<td>
					<a href="">Edit</a>
					<a href="">Delete</a>
				</td>
			</tr>


		</tbody>

	</table>

</body>
</html>