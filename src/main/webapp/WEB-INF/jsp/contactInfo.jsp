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
	<form:form action="addContact" modelAttribute="contact" method="POST">

		<table>
			<tr>
				<td>Contact Name</td>
				<td><form:input path="contactName" type="name" id="name" /></td>
			</tr>
			<tr>
				<td>Contact Email:</td>
				<td><form:input path="contactEmail" type="email" id="email" /></td>
			</tr>
			<tr>
				<td>Contact Number:</td>
				<td><form:input path="contactNumber" type="text" id="number" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="Reset"></td>
				<td><input type="submit" value="Save"></td>
			</tr>
		</table>
		<a href="/viewContacts" style="text-decoration: underline color:green;">See
			All Contacts</a>
	</form:form>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/jquery.validate.min.js"></script>
	<script src="WEB-INF/jsp/validation.js"></script>
</body>
</html>