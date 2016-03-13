package chapter4;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AjaxEncode extends HttpServlet
{

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{		
		
		String name = request.getParameter("name");
		/*
		name = new String(name.getBytes("iso-8859-1"), "utf-8");
		System.out.println(name);*/
		name = java.net.URLDecoder.decode(name, "UTF-8");
		System.out.println(name);
		response.setCharacterEncoding("utf-8");
		response.getWriter().println(name);
	}

}
