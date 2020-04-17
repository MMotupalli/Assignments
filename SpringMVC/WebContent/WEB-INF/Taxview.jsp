<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<h1 align="center">Tax Result</h1>
	<div class="col-md-10 text-right">
	    <span class="m-1">${initParam.slogan}</span>
		<a class="btn btn-danger" href="home.htm">Home</a>
	</div>
	<hr />
	<table class="col-md-4 table table-striped mx-auto">
		<tr>
			<td>Employee Name</td>
			<td>${param.txtname}</td>
		</tr>
		<tr>
			<td>Annual Income</td>
			<td>${param.txtincome}</td>
		</tr>
		<tr>
			<td>Tax Result</td>
			<td>${requestScope.taxresult}</td>
		</tr>
	</table>

</body>
</html>