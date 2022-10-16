package servletDemo2;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import jakarta.servlet.http.HttpServletRequest;
@WebServlet(value = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	/**
	 * 
	 */
	
	//private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		
		String name = req.getParameter("fname");
		String surname = req.getParameter("lname");
		String cond = req.getParameter("condition");
		
		if(cond!=null) {
			out.println("<h2>Welcome to the Academy</h2>");
			out.println();
		    out.println("<h3>Thank You "+name+" "+surname+" for connecting with us</h3>");
		
		}
		else {
			out.println("<h3>Please check The Terms And Condition</h3>");
		}
	}

}
