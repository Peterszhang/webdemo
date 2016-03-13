package chapter13.servlet;

import java.io.*;
import java.util.*;
import java.text.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LocaleServlet extends HttpServlet
{	
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out  = response.getWriter();
		Locale locale = request.getLocale();
		ResourceBundle bundle = java.util.ResourceBundle.getBundle("resource", locale);
		out.println(locale.getDisplayLanguage() + "<p/>");
		out.println(bundle.getString("product.name") + "<br>");
		out.println(bundle.getString("product.price") + "<br>");
		String msg = bundle.getString("message");
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		out.println(MessageFormat.format(msg, "Mike", dateFormat.format(new Date())));
		
	}
}
