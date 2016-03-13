package chapter4;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SaveCookie extends HttpServlet
{

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		// 设置临时Cookie，临时Cookie不用设置path属性
		Cookie tempCookie = new Cookie("temp", "87654321"); // 临时Cookie
		tempCookie.setMaxAge(-1); // -1是MaxAge的默认值
		response.addCookie(tempCookie);
		// 设置MaxAge为0的Cookie
		Cookie cookie = new Cookie("cookie", "6666");
		cookie.setMaxAge(0); // MaxAge设为0，浏览器接收到Cookie后，Cookie立即被删除
		response.addCookie(cookie);
		// 设置永久Cookie
		String user = request.getParameter("user");
		if (user != null) // 如果请求url含有user参数，创建这个永久Cookie
		{
			Cookie userCookie = new Cookie("user", user);
			userCookie.setMaxAge(60 * 60 * 24); // 将MaxAge设为1天
			userCookie.setPath("/"); // 这个Cookie对站点中所有目录下的访问路径都有效
			response.addCookie(userCookie);
		}
		RequestDispatcher readCookie = getServletContext() // 包括/servlet/ReadCookie资源
				.getRequestDispatcher("/servlet/ReadCookie");
		readCookie.include(request, response);

	}

}
