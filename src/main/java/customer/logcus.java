package customer;

import java.io.IOException;

import java.io.PrintWriter;
//import java.util.List;

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logcus")
public class logcus extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("deprecation")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		String uname  = request.getParameter("uname");
		String password  = request.getParameter("pwd");
		
		boolean isTrue;
		
		isTrue = cusDBUtil.validate(uname, password);
		if(isTrue==true) {
			
			int id = cusDBUtil.cusId(uname, password);  
			HttpSession session = request.getSession(true);
			
			session.putValue("id", id);
			response.sendRedirect("index.jsp");  
			
		}else {
			out.println("<script>");
			out.println("alert('Your username or password is incorrect!');");
			out.println("location = 'cuslog.jsp'");
			out.println("</script>");
			
			
		}
		
	}

}
