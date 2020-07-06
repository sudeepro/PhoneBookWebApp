<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Information</title>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.0/jquery.validate.min.js"></script>
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
				<td><form:input path="contactName" minlength="3" type="text"
						required /></td>
			</tr>
			<tr>
				<td>Contact Email:</td>
				<td><form:input path="contactEmail" type="email" name="email"
						required /></td>
			</tr>
			<tr>
				<td>Contact Number:</td>
				<td><form:input path="contactNumber" minlength="10" type="text"
						required /></td>
			</tr>
			<tr>
				<td><input type="reset" value="Reset"></td>
				<td><input type="submit" value="Save"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>