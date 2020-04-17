<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head><meta charset="UTF-8"><title>EMI Calculation</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"></head>
<body>
<h1 align="center">EMI Calculation</h1>
<div class="col-md-10 text-right"><a class="btn btn-danger" href="home">Home</a></div><hr/>
<form action="emisubmit">
	<table class ="col-md-4 table table-striped mx-auto">
		<tr>
			<td>Customer Name</td>
			<td><input type = "text" name="txtname" required /></td>
		</tr>
		<tr>
			<td>Loan Amount</td>
			<td><input type = "number" name="txtamt" required /></td>
		</tr>
		<tr>
			<td>Years</td>
			<td><input type = "number" name="txtyears" required min="5" max="25"/></td>
		</tr>
		<tr><td colspan="2" align="center" ><input type="submit" value="Calc EMI"/></td></tr>
	</table></form>
</body>
</html>