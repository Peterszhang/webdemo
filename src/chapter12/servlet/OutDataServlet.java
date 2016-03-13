package chapter12.servlet;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OutDataServlet extends HttpServlet
{
	
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out  = response.getWriter();
		InputStream is = request.getInputStream();		
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String requestData = "";
		String s = "";
		while((s = br.readLine()) != null)
		{
			requestData += s;
		}
		out.println(requestData);
		out.println("<p/>");
		String decodedRequestData = java.net.URLDecoder.decode(requestData, "UTF-8");
		out.println(decodedRequestData);
	}

}
