package customer;

import java.io.IOException;
import java.io.PrintWriter;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/userServlet")
public class userServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		int id =  Integer.parseInt(request.getParameter("id"));
		String fname = request.getParameter("fname");
	 	String lname = request.getParameter("lname");
	 	String dob = request.getParameter("dob");
	 	String gender = request.getParameter("gender");
	 	String nic = request.getParameter("nic");
	 	String country = request.getParameter("country");
	 	String passport = request.getParameter("passport");
		String email  = request.getParameter("email");
		String phone  = request.getParameter("phone");
		String uname  = request.getParameter("uname");
		String pwd  = request.getParameter("pwd");
		String npwd  = request.getParameter("npwd");
		String pass = pwd;
		if(npwd!=""){
			
			pass=npwd;
		}
		
		
		boolean isTrue = cusDBUtil.updatecustomer(id,fname,lname,dob,gender,nic,country,passport, email, phone, uname, pass);
		
		if(isTrue==true)
		{
			out.println("<script>");
			out.println("alert('Your upadate sccessfull..!');");
			out.println("location = 'detailShowServlet'");
			out.println("</script>");
		}
		else 
		{
			out.println("<script>");
			out.println("alert('Your upadate unsccessfull..!');");
			out.println("location = 'detailShowServlet'");
			out.println("</script>");
		}
	}
	
	
	
	}
	

