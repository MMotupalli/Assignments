<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<h1 class="text-center">Home Page</h1>
<h2 class="text-center text-success"><spring:message code="welcome"/></h2>
</hr>
<nav class="col-md-10 mx-auto alert alert-primary row">
	<div class="m-2"><a class="btn btn-danger" href="taxform.htm">Calculate Tax</a></div>
	<div class="m-2"><a class="btn btn-danger" href="empform.htm">Search Employee</a></div>
	<div class="m-2"><a class="btn btn-danger" href="startquiz.htm">Play Quiz</a></div>
	<div class="m-2"><a class="btn btn-danger" href="download.htm">Download</a></div>
	<div class="m-2"><a class="btn btn-danger" href="addform.htm">Add Employee</a></div>
</nav>
</body>
</html>