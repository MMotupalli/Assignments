<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Employee</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<h1 class="text-center">Add Employee</h1>
	<div class="col-md-10 text-right">
		<a class="btn btn-danger" href="home.htm">home</a>
	</div>
	<hr />
	<h2 class="text-success col-md-3 text-center mx-auto">${msg}</h2>
	<table class ="col-md-8 table table-striped mx-auto">
		<tr>
			<td><spring:message code="id"/></td>
			<td><spring:message code="name"/></td>
			<td><spring:message code="sal"/></td>
			<td><spring:message code="dept"/></td>
		</tr>
		<c:forEach items="${elist}" var="e">
		   <tr>
			<td>${e.empId}</td>
			<td>${e.empName}</td>
			<td>${e.empSal}</td>
			<td>${e.dept}</td>
		   </tr>
		</c:forEach>
	</table>
</body>
</html>
