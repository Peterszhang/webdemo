package chapter4;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ReadCookie extends HttpServlet
{

	// 通过一个Cookie名获得Cookie对象，未找到指定名的Cookie对象，返回null
	protected Cookie getCookieValue(Cookie[] cookies, String name)
	{
		if (cookies != null)
		{
			for (Cookie c : cookies)
			{
				if (c.getName().equals(name))
					return c;
			}
		}
		return null;
	}

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		// 获得临时Cookie ，getCookies方法获得一个保存了请求消息头中所有Cookie的数组
		Cookie tempCookie = getCookieValue(request.getCookies(), "temp");
		if (tempCookie != null)
			out.println("临时Cookie值：" + tempCookie.getValue() + "<br/>");
		else
			out.println("临时Cookie未设置！<br/>");
		// 这个Cookie永远不可能获得，因为它的MaxAge为0
		Cookie cookie = getCookieValue(request.getCookies(), "cookie");
		if (cookie != null)
			out.println("cookie：" + cookie.getValue() + "<br/>");
		else
			out.println("cookie已经被删除!<br/>");
		// 获得永久Cookie
		Cookie userCookie = getCookieValue(request.getCookies(), "user");
		if (userCookie != null)
			out.println("user：" + userCookie.getValue());
		else
			out.println("user未设置！");
	}

}
