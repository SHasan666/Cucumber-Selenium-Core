<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html lang="en">


<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Welcome to NextGenIT</title>

<!-- <link rel="stylesheet" type="text/css" href="/css/login.css"> -->

<!-- CSS -->
<link rel="stylesheet"
	href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">

<link rel="stylesheet" href="/assets/bootstrap/css/bootstrap.min.css">
<!--   <link href="webjars/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet"> -->

<link rel="stylesheet"
	href="/assets/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet" href="/assets/css/form-elements.css">
<link rel="stylesheet" type="text/css" href="/assets/css/style.css">

<!-- Favicon and touch icons -->
<!-- <link rel="shortcut icon" href="/assets/ico/favicon.png">
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="/assets/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="/assets/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="/assets/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="/assets/ico/apple-touch-icon-57-precomposed.png"> -->
<link rel="icon" type="image/png" href="assets/ico/nextgenLogo.png" />

</head>

<body>
	<%-- <p>${errorMsg}</p>   action="/home"   --%>

	<!-- Top content -->
	<div class="top-content">

		<div class="inner-bg">
			<div class="container">

				<div class="row">
					<div class="col-sm-8 col-sm-offset-2 text">
						<h1>
							<strong>Welcome</strong>
						</h1>
						<h2>NextGenIT</h2>
						<div class="description">

							<p>
								Learn more about your <strong>NETWORK</strong> traffic!
							</p>
						</div>
					</div>
				</div>

				<div class="row">
					<div class="col-sm-5">

						<div class="form-box">
							<div class="form-top">
								<div class="form-top-left">
									<h3>Login to our site</h3>
									<p>Enter email and password to log on:</p>
								</div>
								<div class="form-top-right">
									<i class="fa fa-lock"></i>
								</div>
							</div>
							<div class="form-bottom">
								<form role="form" action="/home" method="post"
									class="login-form">
									<div class="form-group">
										<label class="sr-only" for="form-username">Email</label> <input
											type="email" name="name" placeholder="Email..."
											class="form-username form-control" id="form-username"
											required>
									</div>
									<div class="form-group">
										<label class="sr-only" for="form-password">Password</label> <input
											type="password" name="psw" placeholder="Password..."
											class="form-password form-control" id="form-password"
											required>
									</div>
									<button type="submit" class="btn">Sign in!</button>
								</form>

							</div>

							${errorMsg}

							<!-- <div class="alert alert-danger"
								style="margin-top: 10px; display: none;" role="alert">
								Invalid username/password!</div> -->
						</div>


					</div>

					<div class="col-sm-1 middle-border"></div>
					<div class="col-sm-1"></div>

					<div class="col-sm-5">

						<div class="form-box">
							<div class="form-top">
								<div class="form-top-left">
									<h3>Sign up now</h3>
									<p>Fill in the form below to register yourself:</p>
								</div>
								<div class="form-top-right">
									<i class="fa fa-pencil"></i>
								</div>
							</div>
							<div class="form-bottom">
								<form role="form" action="/RegisterUser" method="post"
									class="registration-form">
									<div class="form-group">
										<label class="sr-only" for="form-first-name">First
											name</label> <input type="text" name="firstName"
											placeholder="First name..."
											class="form-first-name form-control" id="form-first-name"
											required>
									</div>
									<div class="form-group">
										<label class="sr-only" for="form-last-name">Last name</label>
										<input type="text" name="lastName"
											placeholder="Last name..."
											class="form-last-name form-control" id="form-last-name"
											required>
									</div>
									<div class="form-group">
										<label class="sr-only" for="form-email">Email</label> <input
											type="email" name="email" placeholder="Email..."
											class="form-email form-control" id="form-email" required>
									</div>
									<div class="form-group">
										<label class="sr-only" for="form-SignUppassword">Password</label>
										<input type="password" name="password"
											placeholder="Password..." class="form-password form-control"
											id="form-SignUppassword" required>
									</div>
									<div class="form-group">
										<label class="sr-only" for="form-phone">Phone</label> <input
											type="number" name="phone" placeholder="Phone..."
											class="form-first-name form-control" id="form-phone" required>
									</div>
									<div class="form-group">
										<label class="sr-only" for="form-address">Address</label>
										<textarea name="address" placeholder="Address..."
											class="form-address form-control" id="form-address" required></textarea>
									</div>
									<button type="submit" class="btn">Sign me up!</button>
								</form>
							</div>
						${alreadyUserOrSucessMsg}
						
						</div>

					</div>
				</div>

			</div>
		</div>

	</div>

	<!-- Footer -->
	<footer>
		<div class="container">
			<div class="row">

				<div class="col-sm-8 col-sm-offset-2">
					<div class="footer-border"></div>
					<p>
						Made by Sakib <i class="fa fa-smile-o"></i>
					</p>
				</div>

			</div>
		</div>
	</footer>

	<!-- Javascript -->
	<!-- <script src="webjars/jquery/3.2.1/jquery.min.js"></script>
		<script src="webjars/bootstrap/4.0.0-beta/js/bootstrap.min.js"></script> -->

	<script src="/assets/js/jquery-1.11.1.min.js"></script>
	<script src="/assets/bootstrap/js/bootstrap.min.js"></script>
	<script src="/assets/js/jquery.backstretch.min.js"></script>

	<script src="/assets/js/scripts.js"></script>
	<!-- 	<script src="/js/login.js"></script> -->


</body>
</html>