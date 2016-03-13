package chapter4;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IncludedServlet extends HttpServlet
{

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{

		response.setContentType("text/plain; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<b>≥¨»À</b><br/>");
		out.println("IncludedServlet URI£∫" + request.getRequestURI() + "<p/>");

	}

}
