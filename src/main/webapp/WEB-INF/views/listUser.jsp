<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>User list</h2>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>Username</th>
			<th>PassWord</th>
		</tr>
		<c:if test="${not empty  userList}">
			<c:forEach var="u" items="${userList }">
			<tr>
			<td>${u.id }</td>
			<td>${u.username }</td>
			<td>${u.password }</td>
			</tr>
		</c:forEach>
		</c:if>
		
		
	</table>
</body>
</html>