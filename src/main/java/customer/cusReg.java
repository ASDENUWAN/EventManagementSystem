package customer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;


/**
 * Servlet implementation class cusReg
 */
@WebServlet("/cusReg")
public class cusReg extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
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
		String password  = request.getParameter("pwd");
		
		
		boolean isTrue = cusDBUtil.insertcustomer(fname,lname,dob,gender,nic,country,passport, email, phone, uname, password);
		
		if(isTrue==true)
		{
			RequestDispatcher dis = request.getRequestDispatcher("cuslog.jsp");	
			dis.forward(request,response);
		}
		else 
		{
			out.println("<script>");
			out.println("alert('Your Registration unsccessfull..!');");
			out.println("location = 'registration form.jsp'");
			out.println("</script>");
		}
	}

}
