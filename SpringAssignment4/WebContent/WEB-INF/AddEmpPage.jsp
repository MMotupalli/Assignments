<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Employee</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<body>
	<h1 class="text-center">ADD Employee Details</h1>
	<div class="col-md-10 text-right"><a class="btn btn-danger" href="home.htm">home</a></div><hr />
	
	<sf:form action="add.htm" method="post" modelAttribute="emodel">
		<table class="col-md-8 table table-striped mx-auto">
			<tr><td><spring:message code="id"/></td>
				<td><sf:input path="empId"/></td><td><sf:errors path="empId" class="text-danger"/></td></tr>
			<tr>
				<td><spring:message code="name"/></td>
				<td><sf:input path="empName"/></td>	<td><sf:errors path="empName" class="text-danger"/></td>
			</tr>
			<tr>
				<td><spring:message code="sal"/></td>
				<td><sf:input path="empSal"/></td><td><sf:errors path="empSal" class="text-danger"/></td>
			</tr>
			<tr>
				<td><spring:message code="dept"/></td>
				<td><sf:input path="dept"/></td><td><sf:errors path="dept" class="text-danger"/></td>
			</tr><tr><td colspan="3"><input type="submit"/></td></tr>
		</table>
	</sf:form>
</body>
</html>
