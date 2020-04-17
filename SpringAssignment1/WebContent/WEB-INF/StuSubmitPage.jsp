<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EMI Calculation</title>
<link rel="stylesheet" 	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<h1 align="center">Trainee Score</h1>
	<div class="col-md-10 text-right"><a class="btn btn-danger" href="home">Home</a></div>
	<hr />
	<table class="col-md-4 table table-striped mx-auto">
		<tr><td>Student Name</td><td>${smodel.stuName}</td></tr>
		<tr><td>Java</td><td>${smodel.javaMarks}</td></tr>
		<tr><td>Angular</td><td>${smodel.angMarks}</td></tr>
		<tr><td>Spring</td><td>${smodel.springMarks}</td></tr>
		<tr><td>DOJ</td><td>${smodel.doj}</td></tr>
		<tr><td>Total</td><td>${total}</td></tr>
		<tr><td>Average</td><td>${average}</td></tr>
		<tr><td>Result</td><td>${result}</td></tr>
	</table>
	
</body>
</html>