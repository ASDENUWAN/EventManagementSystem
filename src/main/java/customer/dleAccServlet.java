package customer;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class dleAccServlet
 */
@WebServlet("/dleAccServlet")
public class dleAccServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		if(session.getAttribute("id")!=null) {
			int id = (Integer)session.getAttribute("id");
			boolean isTrue;
			isTrue = cusDBUtil.removeaccount(id);
			if(isTrue==true) {
				session.invalidate();//destroys the session
				out.println("<script>");
				out.println("alert('Your account is removed..!');");
				out.println("location = 'index.jsp'");
				out.println("</script>");
			}else {
				out.println("<script>");
				out.println("alert('Your account is not removed..!');");
				out.println("location = 'detailShowServlet'");
				out.println("</script>");
			}
			
		}else {
			RequestDispatcher dis = request.getRequestDispatcher("cuslog.jsp");
			dis.forward(request, response);
			
		}
	}


}
