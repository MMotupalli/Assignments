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
	<h1 class="text-center">Employee Details</h1>
	<div class="col-md-10 text-right">
		<a class="btn btn-danger" href="home.htm">home</a>
	</div>
	<hr />
	<c:if test="${ employee eq null }">
		<div class="alert alert-warning col-md-3 mx-auto">No Employee
			Found!</div>
	</c:if>
	<c:if test="${ employee ne null }">
		<table class="col-md-4 table table-striped mx-auto">
			<tr>
				<td><spring:message code="id"/></td>
				<td>${employee.empId}</td>
			</tr>
			<tr>
				<td><spring:message code="name"/></td>
				<td>${employee.empName}</td>
			</tr>
			<tr>
				<td><spring:message code="sal"/></td>
				<td>${employee.empSal}</td>
			</tr>
			<tr>
				<td><spring:message code="dept"/></td>
				<td>${employee.dept}</td>
			</tr>
		</table>
	</c:if>
</body>
</html>
