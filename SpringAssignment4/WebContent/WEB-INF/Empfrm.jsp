<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Employee</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<h1 class="text-center">Search Employee</h1>
	<div class="col-md-10 text-right">
	    <span class="m-1">${initParam.slogan}</span>
		<a class="btn btn-danger" href="home.htm">Home</a>
	</div>
	<hr/>
	<form action="search.htm">
		<div class="col-md-4 mx-auto p-1">
			<input type="number" name="txtsearch" required placeholder="enter employee id"/>
			<input type="submit" value="search"/>
		</div>	
	</form>
</body>
</html>