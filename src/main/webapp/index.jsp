 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Golden Event Planners</title>
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
		<div class="header_button">
		<button  type="button" id="butt1" ><a  id="log_changer" class="butt-a" href="log.jsp">Log in</a></button><br>
		<button  type="button" id="butt2" ><a  id="page_changer" href="registration form.jsp" class="butt-a">Sign up</a></button>
		</div>
		<%
	if(session.getAttribute("id")!=null){
		
		int id =(Integer) session.getAttribute("id");
		out.println("<script> var log = document.querySelector('#log_changer');var account = document.querySelector('#page_changer');");
		out.println("log.innerHTML='Log out';log.setAttribute('href','logout.jsp');account.innerHTML='User';account.setAttribute('href','detailShowServlet');");		
		out.println("</script>");
	}
%>
		
	<!--navigation bar-->

	<ul  class="nav">
		<li class="nav-list"><a href="index.jsp" class="list-a">Home</a></li>
		<li class="nav-list"><a href="#" class="list-a">Events</a></li>
		<li class="nav-list"><a href="#" class="list-a">Facilities</a></li>
		<li class="nav-list"><a href="showbookServlet" class="list-a">Booking</a></li>
		<li class="nav-list"><a href="#" class="list-a">About us</a></li>
		<li class="nav-list"><a href="#" class="list-a">Reviews</a></li>
		<li class="nav-list"><a href="#" class="list-a">Contact us</a></li>
	</ul>
	<hr style="border:3px solid black">															
<!--slideshow-->
<div class="slideshow-container">
	<div class="mySlides fade">
		 <img src="images/Home/e1.jpg" style="width:100%;height:300px ">
	</div>
	<div class="mySlides fade">
		 <img src="images/Home/e2.jpg" style="width:100%;height:300px">
	</div>
	<div class="mySlides fade">
		<img src="images/Home/e3.jpg" style="width:100%;height:300px">
    </div>
    <div class="mySlides fade">
		<img src="images/Home/e4.jpg" style="width:100%;height:300px">
    </div>
	<div class="mySlides fade">
		<img src="images/Home/e5.jpg" style="width:100%;height:300px">
    </div>
    <div class="mySlides fade">
		<img src="images/Home/e6.jpg" style="width:100%;height:300px">
    </div>
	<div class="mySlides fade">
		<img src="images/Home/e7.jpeg" style="width:100%;height:300px">
    </div>
    <div class="mySlides fade">
		<img src="images/Home/e8.jpg" style="width:100%;height:300px">
    </div>
</div>
<br>
<div style="text-align:center">
  <span class="dot"></span> 
  <span class="dot"></span>  
  <span class="dot"></span> 
  <span class="dot"></span>  
  <span class="dot"></span> 
  <span class="dot"></span>  
  <span class="dot"></span> 
  <span class="dot"></span>  
</div>
<p class = "welcome">
	Welcome to "Golden Event Planners"! Your journey to exceptional events starts here. We'll turn your dreams into reality, one golden moment at a time. 
	Explore our seamless platform, expert guidance, and curated resources for unforgettable experiences. From weddings to corporate gatherings, we're your trusted partner. 
	Let's create magic together!</p>
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

<script>
	let slideIndex = 0;
	showSlides();
	 
	function showSlides() {
	  let i;
	  let slides = document.getElementsByClassName("mySlides");
	  let dots = document.getElementsByClassName("dot");
	  for (i = 0; i < slides.length; i++) {
		slides[i].style.display = "none";  //each slide hide them from view.
	  }
	  slideIndex++;
	  if (slideIndex > slides.length) {slideIndex = 1}    
	  for (i = 0; i < dots.length; i++) {
		dots[i].className = dots[i].className.replace(" active", "");
	  }
	  slides[slideIndex-1].style.display = "block";  
	  dots[slideIndex-1].className += " active";
	  setTimeout(showSlides, 4000); // Change image 4s 
	}
</script>
</body>
</html>