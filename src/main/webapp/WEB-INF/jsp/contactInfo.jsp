<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Information</title>
</head>
<body>
	<h3>Save Contact</h3>
	<p>
		<font color="green">${successMessage}</font>
	</p>

	<p>
		<font color="red">${errorMessage}</font>
	</p>
	<form:form action="saveContacts" modelAttribute="contact" method="POST">
		<table>
			<tr>
				<td>Contact Name</td>
				<td><form:input path="contactName" /></td>
			</tr>
			<tr>
				<td>Contact Email:</td>
				<td><form:input path="contactEmail" /></td>
			</tr>
			<tr>
				<td>Contact Number:</td>
				<td><form:input path="contactNumber" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="Reset"></td>
				<td><input type="submit" value="Save"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>