<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Golden Event Planners</title>
	<link rel="stylesheet" href="styles.css">
</head>
<body>
<!--Header-->
	<img class="blue" src="images/Home/blue1.jpg" alt="blue">
	<img class="logo" src="images/Home/logo.png" alt="logo">
	
	<h1 id="topic"><b>Golden Event Planners</b></h1>
	<hr style="border:3px solid white">															

<!--navigation bar-->

<form method="POST" action="" class="log_form" >
	<div class="log_form_text">
		<h2> STAFF LOGIN</h2>
		<label for="name">Username</label><br>
		<input type="text" class="log_input" id="name" name="name"  placeholder="abcd" required><br><br>
		<label for="psw">Password</label><br>
		<input type="password" id="pws" name="psw" class="log_input" required><br><br>
		<input type="submit"  class="log_sub" id = "submitBtn" value="Login">	
	</div>
</form>

</body>
</html>