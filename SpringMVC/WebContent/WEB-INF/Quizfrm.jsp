<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List, com.cg.entity.Question"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Quiz</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<h1 class="text-center">Play Quiz</h1>
	<div class="col-md-10 text-right">
	    <span class="m-1">${initParam.slogan}</span>
		<a class="btn btn-danger" href="home.htm">Home</a>
	</div>
	<hr />
	<form action="finishquiz.htm" method="post">
		`
		<c:forEach items="${requestScope.qlist }" var="q">
			<div class="col-md-6 mx-auto m-2 bg-primary text-white">
				<div class="m-1">${ q.qdesc }</div>
				<div class="m-1">
					<input type="radio" name="${ q.qid }" value="${ q.opta }" />
					${ q.opta }
				</div>
				<div class="m-1">
					<input type="radio" name="${ q.qid }" value="${ q.optb }" />
					${ q.optb }
				</div>
				<div class="m-1">
					<input type="radio" name="${ q.qid }" value="${ q.optc }" />
					${ q.optc }
				</div>
			</div>
		</c:forEach>

		<div class="text-center">
			<input type="submit" value="finish" />
		</div>
	</form>
</body>
</html>