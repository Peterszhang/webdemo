package chapter4;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Helloworld extends HttpServlet // Servlet类必须从HttpServlet及其子类继承
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		response.setContentType("text/html"); // 设置HTTP响应头的Content-Type字段值		
		PrintWriter out = response.getWriter(); // 获得用于输出信息的PrintWriter对象
		out.println("<b>Hello world</b>"); // 向客户端输出Hello world
	}
}
