<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="/css/addToDo.css">
<title>Add Todo</title>
</head>
<body>

	<h2>Hi ${user} , Please add new To Do</h2>

	<form method="post" style="border: 1px solid #ccc">
		<div class="container">
			<label><b>Description</b></label> 
			<input type="text" placeholder="Enter Description" name="desc" required> 

			<div class="clearfix">				
				<button type="submit" class="signupbtn">Add</button>
			</div>
		</div>
	</form>
</body>
</html>