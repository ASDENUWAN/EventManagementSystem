package booking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/updateBookingServlet")
public class updateBookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		int bid =  Integer.parseInt(request.getParameter("id"));
		String type = request.getParameter("etype");
	 	String venue = request.getParameter("vtype");
	 	String time = request.getParameter("ttype");
	 	String date = request.getParameter("date");
	 	
	 	boolean isTrue = BookingDbUtill.updatebook(bid, type, venue, time, date);
		
		if(isTrue==true)
		{
			out.println("<script>");
			out.println("alert('Your upadate sccessfull..!');");
			out.println("location = 'showbookServlet'");
			out.println("</script>");
		}
		else 
		{
			out.println("<script>");
			out.println("alert('Your upadate unsccessfull..!');");
			out.println("location = 'showbookServlet'");
			out.println("</script>");
		}
	 	
	}

}
