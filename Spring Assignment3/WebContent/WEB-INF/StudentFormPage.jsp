<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head><meta charset="UTF-8"><title>Student Details</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"></head>
<body>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<h1 align="center">Trainee Score</h1>
<div class="col-md-10 text-right"><a class="btn btn-danger" href="home">Home</a></div><hr/>
<sf:form action="stusubmit" modelAttribute="smodel" method="post">
	<table class ="col-md-8 table table-striped mx-auto">
		<tr>
			<td>Student Name</td>
			<td><sf:input  path="stuName"  /></td>
			<td><sf:errors  path="stuName"  class="text-danger"/></td>
		</tr>
		<tr>
			<td>Java</td>
			<td><sf:input  path="javaMarks"  /></td>
			<td><sf:errors  path="javaMarks"  class="text-danger"/></td>
		</tr>
		<tr>
			<td>Angular</td>
			<td><sf:input  path="angMarks"  /></td>
			<td><sf:errors  path="angMarks"  class="text-danger"/></td>
		</tr>
		<tr>
			<td>Spring</td>
			<td><sf:input  path="springMarks"  /></td>
			<td><sf:errors  path="springMarks"  class="text-danger"/></td>
		</tr>
		<tr>
			<td>DOJ</td>
			<td><sf:input path="doj" placeholder="yyyy-M-d"/></td>
			<td><sf:errors  path="doj"  class="text-danger"/></td>
		</tr>
		<tr><td colspan="2" align="center" ><input type="submit" /></td></tr>
	</table></sf:form>
</body>
</html>