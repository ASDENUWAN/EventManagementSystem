package booking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cancelBookingServlet
 */
@WebServlet("/cancelBookingServlet")
public class cancelBookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		int bid =  Integer.parseInt(request.getParameter("id"));
		
	 	
	 	boolean isTrue = BookingDbUtill.cancel(bid);
		
		if(isTrue==true)
		{
			out.println("<script>");
			out.println("alert('Your booking is canceled..!');");
			out.println("location = 'showbookServlet'");
			out.println("</script>");
		}
		else 
		{
			out.println("<script>");
			out.println("alert('Your booking is not canceled..!');");
			out.println("location = 'showbookServlet'");
			out.println("</script>");
		}
	 	
	}

}
