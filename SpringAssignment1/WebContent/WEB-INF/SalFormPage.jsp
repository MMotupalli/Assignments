<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head><meta charset="UTF-8"><title>Salary Calculation</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"></head>
<body>
<h1 align="center">Salary Calculation</h1>
<div class="col-md-10 text-right"><a class="btn btn-danger" href="home">Home</a></div><hr/>
<form action="calcsal">
	<table class ="col-md-4 table table-striped mx-auto">
	    <tr>
			<td><s:message code="id"/></td>
			<td><input type = "number" name="eid" required /></td>
		</tr>
		<tr>
			<td><s:message code="name"/></td>
			<td><input type = "text" name="ename" required /></td>
		</tr>
		<tr>
			<td><s:message code="salary"/></td>
			<td><input type = "number" name="sal" required /></td>
		</tr>
		
		<tr><td colspan="2" align="center" ><input type="submit" value="Calc Salary"/></td></tr>
	</table></form>
</body>
</html>