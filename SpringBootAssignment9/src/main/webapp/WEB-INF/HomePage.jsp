<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Emp Management</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<h1 class="text-center">Account Management</h1>
</hr>
<h2 class="text-center">Home</h2>
<nav class="col-md-10 mx-auto alert alert-primary row">
	<div class="m-2"><a class="btn btn-danger" href="viewall">View ALL</a></div>
	<div class="m-2"><a class="btn btn-danger" href="showtransfer">Transfer fund</a></div>
	<div class="m-2"><a class="btn btn-danger" href="showaddform">Add Account</a></div>
	
</nav>
<c:if test="${msg ne null}">
	  <div class="col-md-4 mx-auto alert alert-success">${requestScope.msg}</div>
</c:if>
</body>
</html>