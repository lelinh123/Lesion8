<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add User</title>
<link href="/css/main.css" rel="stylesheet" />

</head>
<body>
	<div class="container">
		<h2>Add user</h2>
		<form:form action="addUser" method="POST" modelAttribute="users">
			<table>
				<tr>
					<td>User Name:</td>
					<td><form:input path="username" /></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><form:input path="password" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Save Changes" />
					</td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>