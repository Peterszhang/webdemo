package chapter4;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReadText extends HttpServlet
{

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{

		// byte[] buffer = new byte[8192];
		// System.out.println(is.read(buffer));
		String name = request.getParameter("name");
		System.out.println(name);

		String name1 = request.getParameter(new String("Ãû³Æ".getBytes("utf-8"),
				"iso-8859-1"));
		
        System.out.println(name);
       //System.out.println(name1);
//		System.out.println(new String(name.getBytes("iso-8859-1"), "utf-8"));
	//	System.out.println(new String(name1.getBytes("iso-8859-1"), "utf-8"));

	}

}
