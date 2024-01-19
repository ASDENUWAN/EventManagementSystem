package booking;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/bookingServlet")
public class bookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		HttpSession session = request.getSession(true);
		
		String type = request.getParameter("etype");
	 	String venue = request.getParameter("vtype");
	 	String time = request.getParameter("ttype");
	 	String date = request.getParameter("date");
	 	
		if(session.getAttribute("id")!=null) {
			int id = (Integer)session.getAttribute("id");
			
			boolean isTrue = BookingDbUtill.insertbooking(id, type, venue, time, date);
			
			if(isTrue==true)
			{
				out.println("<script>");
				out.println("alert('Your Booking successfull..!');");
				out.println("location = 'showbookServlet'");
				out.println("</script>");
			}
			else 
			{
				out.println("<script>");
				out.println("alert('Your Booking unsccessfull..!');");
				out.println("location = 'showbookServlet'");
				out.println("</script>");
			}
		}else {
			RequestDispatcher dis = request.getRequestDispatcher("cuslog.jsp");
			dis.forward(request, response);
			
		}
		
	}

}
