<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Emp Management</title>
<link rel="stylesheet" 	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<h1 align="center">Emp Management</h1>
	<div class="text-center"><a class="btn btn-danger" href="home">Home</a>
	</div>
	<hr />
	<h2 class="text-center">View By Dept</h2>
	<form action="searchbydept">
		<table class="col-md-4 table table-striped mx-auto">
			<tr>
				<td>Dept</td>
				<td><select name="txtdept" required>
				    <option value="">--select dept--</option>
				    <c:forEach items="${dlist}" var="d">
				      <option value="${d.deptName}">${d.deptName}</option>
				    </c:forEach>
				</select></td>
				<td><input type="submit" value="search" /></td>
			</tr>
		</table>
	</form>
	<hr />
	
	
</body>
</html>