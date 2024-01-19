package booking;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/showbookServlet")
public class showbookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		if(session.getAttribute("id")!=null) {
			int id = (Integer)session.getAttribute("id");
			
			List<book> bookInfo = BookingDbUtill.getbook(id);
			
			request.setAttribute("bookInfo", bookInfo);
			RequestDispatcher dis = request.getRequestDispatcher("booking.jsp");
			dis.forward(request, response);
		}else {
			RequestDispatcher dis = request.getRequestDispatcher("cuslog.jsp");
			dis.forward(request, response);
			
		}
	}

}
