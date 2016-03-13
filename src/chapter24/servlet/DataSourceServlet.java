package chapter24.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import chapter22.HelloService;

public class DataSourceServlet extends HttpServlet
{

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("中华人民共和国");
		ApplicationContext context = new FileSystemXmlApplicationContext(
				
						this.getServletContext().getRealPath(
								"\\WEB-INF\\classes\\MyDatasource.xml") );
		javax.sql.DataSource datasource = (javax.sql.DataSource) context
				.getBean("myDatasource1");
		try
		{
			out.println(datasource.getConnection().getCatalog());
		}
		catch (Exception e)
		{
			out.println(e.getMessage());
		}
	}

}
