package customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class detailShowServlet
 */
@WebServlet("/detailShowServlet")
public class detailShowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		if(session.getAttribute("id")!=null) {
			int id = (Integer)session.getAttribute("id");
			
			List<Customer> cusInfo = cusDBUtil.getcus(id);
			
			request.setAttribute("cusInfo", cusInfo);
			RequestDispatcher dis = request.getRequestDispatcher("user.jsp");
			dis.forward(request, response);
		}else {
			RequestDispatcher dis = request.getRequestDispatcher("cuslog.jsp");
			dis.forward(request, response);
			
		}
	}

}
