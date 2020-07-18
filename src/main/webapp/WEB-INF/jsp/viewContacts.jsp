<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%><%@ taglib
	uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Contacts</title>


</head>
<body>
	<h3>View Contacts here</h3>

	<a href="addContact">+Add New Contact</a>
	<table border="1"  id="viewContact">
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
			<c:forEach items="{$contact}" var="c" varStatus="index">

				<tr>
					<td>${index.count}</td>
					<td>${c.contactName}</td>
					<td>${c.contactEmail}</td>
					<td>${c.contactNumber}</td>
					<td><a href="editContact?cid=${c.contactId}">Edit</a> | <a
						href="deleteContact?cid=${c.contactId}" onclick="return deleteConfirm()">Delete</a></td>
				</tr>

			</c:forEach>
		</tbody>

	</table>

	<script>
		$(document).ready(function() {
			$('#contactTbl').DataTable({
				"pagingType" : "full_numbers"
			});
		});
	</script>

	<script>
		function deleteConfirm() {
			return confirm("Are you sure, you want to delete?");
		}
	</script>

</body>
</html>