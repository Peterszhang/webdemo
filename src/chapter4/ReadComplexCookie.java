package chapter4;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class ReadComplexCookie extends ReadCookie
{
	
	@Override
	public void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		try
		{
			sun.misc.BASE64Decoder base64Decoder = new sun.misc.BASE64Decoder();
			Cookie cookie = getCookieValue(request.getCookies(), "mycookie");
			if (cookie == null)
				return;
			String classStr = cookie.getValue();
			byte[] classBytes = base64Decoder.decodeBuffer(classStr);
			ObjectInputStream ois = new ObjectInputStream(
					new ByteArrayInputStream(classBytes));
			MyCookie myCookie = (MyCookie) ois.readObject();
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println(myCookie.getMsg());

		}
		catch (Exception e)
		{

		}
	}

}
