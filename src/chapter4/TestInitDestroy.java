package chapter4;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestInitDestroy extends HttpServlet
{

	@Override
	public void destroy()
	{
		System.out.println("Servlet被销毁!");
	}

	@Override
	public void init() throws ServletException
	{
		System.out.println("初始化Servlet!");
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		// 为了使程序不至于出错，需要加上此方法
	}

}
