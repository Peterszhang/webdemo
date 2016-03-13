package chapter4;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class NewSessionServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		RequestDispatcher sessionServlet = getServletContext()
				.getRequestDispatcher("/servlet/SessionServlet");
		sessionServlet.include(request, response);
		out.println("<br><a href='" + response.encodeURL("SessionServlet")
				+ "'>SessionServlet</a>");
	}

}
