package chapter4;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class IncludingServlet extends HttpServlet
{

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{

		response.setContentType("text/html; charset=gb2312");
		PrintWriter out = response.getWriter();
		out.println("中国<br/>");
		out.println("IncludingServlet URI：" + request.getRequestURI() + "<p/>");
		// RequestDispatcher对象封装的资源路径前必须加“/”
		RequestDispatcher rd = getServletContext().getRequestDispatcher(
				"/servlet/IncludedServlet");
		rd.include(request, response);
		rd = getServletContext().getRequestDispatcher("/chapter4/IncludedHtml.html");
		rd.include(request, response);

	}
}
