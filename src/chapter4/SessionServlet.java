package chapter4;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SessionServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(60 * 60 * 24); // 设置Session的超时间隔为1天
		if (session.isNew()) // 如果是新建立的会话，保存属性值
		{
			session.setAttribute("session", "宇宙");
			out.println("新会话已经建立！");
		}
		else
			// 如果是以前建立的会话，输出这个属性值
			out.println("会话属性值：" + session.getAttribute("session"));
	}

}
