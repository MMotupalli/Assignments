<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Quiz Result</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<h1 align="center">Quiz Result</h1>
<div class="col-md-10 text-right">
    <span class="m-1">${initParam.slogan}</span>
	<a class="btn btn-danger" href="home.htm">Home</a>
</div>
<hr/>
	<table class ="col-md-4 table table-striped mx-auto">
		<tr>
			<td>Score</td>
			<td>${score}</td>
		</tr>
		<tr>
			<td>Percentage</td>
			<td>${percentage}</td>
		</tr>
		<tr>
			<td>Result</td>
			<td>${result}</td>
		</tr>
	</table>
</body>
</html>