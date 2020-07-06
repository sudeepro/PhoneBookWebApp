<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
,l<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Contacts</title>
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script
	src="https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script>
<script>
</head>
<body>
	<h3>View Contacts here</h3>

	<a href=""addContact">+Add New Contact</a>
	<table border="1" table id="viewContact">
		<thead>
			<tr>
				<th>S.No</th>
				<th>Name</th>
				<th>Email</th>
				<th>Number</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="{$contacts}" var="c" varStatus="index">

				<tr>
					<td>${index.count}</td>
					<td>${c.contactName}</td>
					<td>${c.contactEmail}</td>
					<td>${c.contactNumber}</td>
					<td><a href="editContact?cid=${c.contactId}">Edit</a> | <a href="deleteContact?cid=${c.contactId}">Delete</a></td>
				</tr>

			</c:forEach>
		</tbody>

	</table>
	<script>
	$(document).ready(function() {
		$('#viewContact').DataTable({
			"pagingType" : "full_numbers"
		});
	});
</script>
</body>
</html>