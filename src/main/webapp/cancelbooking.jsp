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
<% 
		String bid = request.getParameter("bid");
%>


<form method="GET" action="bcancel" class="log_form" >
	<div class="log_form_text">
		<h2>Cancel Booking..!</h2>
	<div>
		<label class = "reg-text reg-des">User ID</label>
	    <input type="text" name="id" value="<%= bid %>" class = "size"  readonly ><br><br> 
	</div>
     <div>
		<input type="submit"  class="dle_sub"  value="Done">	
	</div>
</form>
</body>
</html>