 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Booking</title>
	<link rel="stylesheet" href="styles.css">
	<link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">
</head>
<body>
	<div class="body"></div>
<!--Header-->
	
	<img class="blue" src="images/Home/blue1.jpg" alt="blue">
	<img class="logo" src="images/Home/logo.png" alt="logo">
	<img class="user" src="images/Home/user.png" alt="logo">
	<h1 id="topic" style="text-align:center"><b>GOLDEN  EVENT  PLANNERS</b></h1>
		
	<hr style="border:3px solid black">	
	
	
	<% 
		String bid = request.getParameter("bid");
		String type = request.getParameter("type");
		String venue = request.getParameter("venue");
		String time = request.getParameter("time");
		String date = request.getParameter("date");
	%>
	     <form class ="book-form" action="bupdate" method="post" align="center">
			      <h2 class="booking-label">Edit Appointment </h2><br><br><br>
			      <div>
					<label class = "reg-text reg-des">User ID</label>
			        <input type="text" name="id" value="<%= bid %>" class = "size" required readonly ><br><br> 
					</div>
               	  <div>
                    <label  class = "booking-label"  for="type">Select Event Type :</label>
                    <select name="etype" id="type" class="booking_select_input" required>
                        <option value="" selected disabled><%= type %></option>
                        <option value="Birthdays">Birthdays</option>
                        <option value="Weddings">Weddings</option>
						<option value="Anniversaries">Anniversaries</option>
                        <option value="Family Events">Family Events</option>
                        <option value="Others">Others</option>
                    </select>
                </div><br>
				
				<div>
                    <label  class = "booking-label"  for="type">Select Venue :</label>
                    <select name="vtype" id="type" class="booking_select_input" required>
                        <option value=""selected disabled><%= venue %> </option>
                        <option value="Head Office">Head Office</option>
                        <option value="Colombo Branch">Colombo Branch</option>
						<option value="Galle Branch">Galle Branch</option>
                        <option value="Chilaw Branch<">Chilaw Branch</option>
                    </select>
                </div><br>
				<div>
                    <label  class = "booking-label"  for="type">Select Time :</label>
                    <select name="ttype" id="type" class="booking_select_input" required>
                        <option value="" selected disabled><%= time%> </option>
                        <option value="9.00a.m - 11.00a.m">9.00a.m - 11.00a.m</option>
                        <option value="1.00p.m - 3.00p.m">1.00p.m - 3.00p.m</option>
						<option value="4.00p.m - 6.00p.m">4.00p.m - 6.00p.m</option>
                    </select>
                </div><br>
				<div>
                      <label class = "booking-label" for="date-in">Select Date :</label>
                      <input type="date" name="date" id="date" placeholder="date"  class="booking_select_input" value="<%= date %>">
                </div><br>
               
                <div>
                      <input type="submit" value="Update" id="submit" class="booking_select_input booking_sub" name="book" >
                </div>
            </form>														

<hr>
<!--footer-->
<footer class="footer">
	<div class="container">
		<div class="row">
			<div class="footer-col">
				<h4>company</h4>
				<ul>
					<li><a href="about.php">>about us</a></li>
					<li><a href="#">>privacy policy</a></li>
					<li><a href="#">>Term & Condition</a></li>
				</ul>
			</div>
			<div class="footer-col">
				<h4>Contact</h4>
				<ul>
					<li><a href="#">FAQ</a></li>
					<li><a href="#">123 Street,Colombo.</a></li>
					<li><a href="#">011-2788856</a></li>
					<li><a href="#">gevents@gmail.com</a></li>
				</ul>
			</div>
			<div class="footer-col">
				<h4>follow us</h4>
				<div class="social-links">
					<a href="#"><i class="fab fa-facebook-f"></i></a>
					<a href="#"><i class="fab fa-twitter"></i></a>
					<a href="#"><i class="fab fa-instagram"></i></a>
					<a href="#"><i class="fab fa-linkedin-in"></i></a>
				</div>
			</div>
			<div class="map">
				<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d15799.272129499186!2d80.37134780364997!3d6.736016323992659!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3ae3beeb373e90c7%3A0xcc578e3f0396185!2sThe%20Royal%20Peak%20Resort!5e0!3m2!1sen!2slk!4v1685886884211!5m2!1sen!2slk"
				 width="200" height="200" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
			</div>
		</div>
	</div>

</footer>
<hr>


</body>
</html>