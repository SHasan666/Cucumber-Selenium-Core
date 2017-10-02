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
<title>Welcome ${name}</title>
</head>
<body>
		
		<h1>Welcome ${name} </h1>
		
		<button onclick="window.location.href='list-todos'"style="width: auto;">My Todo's</button>
		<input type="button" class="cancelbtn" value="LOGOUT" onclick="window.location.href='login'">
		
</body>
</html>