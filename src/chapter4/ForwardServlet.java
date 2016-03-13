package chapter4;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ForwardServlet extends HttpServlet
{

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		// RequestDispatcher对象封装的资源路径前必须加“/”
		RequestDispatcher rd = getServletContext().getRequestDispatcher(
				"/servlet/IncludingServlet");
		rd.forward(request, response);

	}

}
