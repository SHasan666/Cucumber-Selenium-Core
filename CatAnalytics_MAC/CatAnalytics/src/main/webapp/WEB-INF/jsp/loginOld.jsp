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
	
	<title>Sakibs App</title>
</head>

<body>

	<h2>Modal Login Form</h2>
	
	<button onclick="document.getElementById('id01').style.display='block'"
		style="width: auto;">Login</button>
	<p>${errorMsg}</p>
	<div id="id01" class="modal">

		<form class="modal-content animate"  method="post" action="/home">
			<div class="imgcontainer">
				<span onclick="document.getElementById('id01').style.display='none'"
					class="close" title="Close Modal">&times;</span>
				<%-- <spring:url value="/images/img_avatar2.png" var="logoImg"/> --%>

				<%-- <img src="${logoImg}" alt="Avatar" class="avatar"> --%>
				<img src="/images/img_avatar2.png" alt="Avatar" class="avatar">

			</div>

			<div class="container">
				<label><b>Username</b></label> <input type="text"
					placeholder="Enter Username" name="name" required> <label><b>Password</b></label>
				<input type="password" placeholder="Enter Password" name="psw"
					required>

				<button type="submit">Login</button>
				<input type="checkbox" checked="checked"> Remember me
			</div>

			<div class="container" style="background-color: #f1f1f1">
				<button type="button"
					onclick="document.getElementById('id01').style.display='none'"
					class="cancelbtn">Cancel</button>
				<span class="psw">Forgot <a href="#">password?</a></span>
			</div>
		</form>
	</div>


	<script src="/js/login.js"></script>
</body>
</html>