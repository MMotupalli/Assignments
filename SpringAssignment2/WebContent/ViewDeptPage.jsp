<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head><meta charset="UTF-8"><title>Emp Management</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"></head>
<body>
<h1 align="center">Emp Management</h1>
<div class="text-center"><a class="btn btn-danger" href="home">Home</a></div><hr/>
<h2 class="text-center">Employee Details</h2>
	<table class ="col-md-8 table table-striped mx-auto">
		<tr>
			<td>Emp ID</td>
			<td>Emp Name</td>
			<td>Salary</td>
			<td>Dept</td>
			<td>DOJ</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${elist}" var="e">
		   <tr>
			<td>${e.empId}</td>
			<td>${e.empName}</td>
			<td>${e.empSal}</td>
			<td>${e.dept.deptName}</td>
			<td>${e.strDoj}</td>
			<td><a href="edit?txteid=${e.empId}&pg=${pageurl}" class="btn btn-success">Edit</a>
			<td><a href="delete?txteid=${e.empId}&pg=${pageurl}" class="btn btn-danger">Delete</a>
		</tr>
		</c:forEach>
	</table>
</body>
</html>