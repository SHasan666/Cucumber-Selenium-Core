<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="/css/login.css">
<title>Todos</title>
</head>
<body>

	<h1>Here are the todo's</h1>
	<%-- <p>${todos}</p> --%>

	<table>
		<caption>Your todos are</caption>

		<thead>
			<tr>
				<th>Description</th>
				<th>Target Date</th>
				<th>Status</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${todos}" var="todo">
				<tr>
					<td>${todo.desc}</td>
					<td>${todo.targetDate}</td>
					<td>${todo.done}</td>
				</tr>
			</c:forEach>
		</tbody>

	</table>

	<button onclick="window.location.href='add-todo'" style="width: auto;">Add
		ToDo</button>

</body>
</html>