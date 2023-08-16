<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
	<style>
		body {
			font-family: Arial, sans-serif;
			margin: 0;
			padding: 0;
			background-color: #F7CAC9;
		}
		
		form {
			width: 300px;
			margin: 20px auto;
			background-color: #88B04B;
			padding: 20px;
			border-radius: 5px;
			box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
		}

		h2 {
			text-align: center;
			margin-bottom: 20px;
		}

		h3 {
			margin-top: 20px;
			text-align: center;
		}

		label {
			display: block;
			margin-bottom: 5px;
			font-weight: bold;
		}

		input[type="text"],
		input[type="password"] {
			width: 100%;
			padding: 8px;
			margin-bottom: 10px;
			border: 1px solid #ccc;
			border-radius: 5px;
		}

		input[type="submit"] {
			background-color: #007bff;
			color: #fff;
			padding: 10px 15px;
			border: none;
			border-radius: 3px;
			cursor: pointer;
		}

		input[type="submit"]:hover {
			background-color: #0056b3;
		}

		hr {
			margin-top: 20px;
		}

		a {
			display: block;
			text-align: center;
			margin-top: 10px;
		}
	</style>
</head>
<body>
	<form action="login" method="post">
		<h2>LOGIN HERE</h2>
		<hr>
		<label for="email">USERNAME:</label>
		<input type="text" name="email" required>
		<label for="password">PASSWORD:</label>
		<input type="password" name="password" required>
		<input type="submit" value="LOGIN">
		</form>
		<hr>
		${msg}
		<h3>NEW USER SIGNUP HERE</h3>
		<a href="signup">signup?</a>
</body>
</html>